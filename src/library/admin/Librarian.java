package library.admin;

import library.collection.Book;
import library.collection.Category;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Librarian extends Person {
	private Library library;

	public Librarian(String name, Long id, Library library) {
		super(name, id);
		this.library = library;
	}

	public Book searchBookByTitle(String name) {
		return (Book)library.getLibraryCollectionMap().values().stream().filter(book -> book.getTitle().toUpperCase().contains(name.toUpperCase())).findFirst().get();
	}

	public Book searchBookById(Long id) {
		return (Book)library.getLibraryCollectionMap().get(id);
	}

	public Book searchBookByAuthor(String author) {
		return (Book)library.getLibraryCollectionMap().values().stream().filter(libraryCollection -> ((Book)libraryCollection).getAuthor().getName().equalsIgnoreCase(author)).findAny().orElseThrow();
	}

	public void updateBook(Long id, String title, double fee, int numOfPages, int edition, String language, int year, Category category) {
		Book book = (Book)library.getLibraryCollectionMap().get(id);
		book.setTitle(title);
		book.setFee(fee);
		book.setNumOfPages(numOfPages);
		book.setEdition(edition);
		book.setLanguage(language);
		book.setYear(year);
		book.setCategory(category);
	}

	public List<Book> selectCategory(Category category) {
		return library.getLibraryCollectionMap().values().stream().filter(libraryCollection -> ((Book)libraryCollection).getCategory().equals(category)).map(libraryCollection -> (Book) libraryCollection).toList();
	}

	public boolean verifyMember(String id) {
		return library.getMemberMap().containsKey(id);
	}

	public void addMember(String name, long id, String phoneNumber, String address, MembershipType type) {
		String memberId = UUID.randomUUID().toString();
		Member newMember = new Member(name, id, phoneNumber, address, new Date(), type, memberId, 0);
		library.addMember(memberId, newMember);
	}

	public void addBook(String title, double fee, int numOfPages, int edition, String language, String authorName, int year, Category category) {
		UUID uniqueID = UUID.randomUUID();
		long id = Math.abs(uniqueID.getMostSignificantBits());
		Book bookToBeAuthor = (Book) library.getLibraryCollectionMap().values().stream().filter(libraryCollection -> ((Book)libraryCollection).getAuthor().getName().equalsIgnoreCase(authorName)).findFirst().orElseThrow();
		Book book = new Book(title, true, fee, numOfPages, edition, language, bookToBeAuthor.getAuthor(), year, category);
		library.addLibraryCollection(id, book);
	}

	public void deleteBook(Long id) {
		library.getLibraryCollectionMap().remove(id);
	}

	public void issueBook(long id, String memberId) {
		Book selectedBook = library.withdrawBook(id);
		selectedBook.setWithdrawDate(LocalDate.now());
		library.getMemberMap().get(memberId).getBorrowedBooks().add(selectedBook);
	}

	public double calculateFine(Book book, Member member) {
		LocalDate now = LocalDate.now();
		long daysBetween = ChronoUnit.DAYS.between(book.getWithdrawDate(), now);
		int coefficient = switch (member.getType()) {
			case STUDENT -> daysBetween > 10 ? 2 : 1;

			case INSTRUCTOR -> daysBetween > 20 ? 1 : 0;

			case OTHER -> daysBetween > 5 ? 10 : 5;
		};

		return book.getFee() * coefficient;

	}

	public void createBill(Member member, Book selectedBook, double fine) {
		System.out.println("Deposit bill: " + fine);
		System.out.println("Book name: " + selectedBook.getTitle());
		System.out.println("Deposited from: "+ member.getName());
		System.out.println("This bill is addressed at "+ member.getAddress());
		System.out.println("Phone number: " + member.getPhoneNumber());
	}

	public void returnBook(long id, String memberId) {
		Book selectedBook = library.depositBook(id);
		Member member = library.getMemberMap().get(memberId);
		double fine = calculateFine(selectedBook, member);
		member.setBalance(member.getBalance() - fine);
		member.getBorrowedBooks().remove(selectedBook);
		createBill(member, selectedBook, fine);
	}

	public List<Book> selectAuthor(String authorName) {
		return library.getLibraryCollectionMap().values().stream().filter(libraryCollection -> ((Book)libraryCollection).getAuthor().getName().equalsIgnoreCase(authorName)).map(libraryCollection->(Book)libraryCollection).toList();
	}
}
