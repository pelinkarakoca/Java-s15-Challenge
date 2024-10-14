import library.collection.Book;

import java.util.*;

public class Librarian extends Person {
	private Library library;

	public Librarian(String name, Long id, Library library) {
		super(name, id);
		this.library = library;
	}

	public List<Book> searchBook(String name) {
		return library.getBookMap().values().stream().filter(book -> book.getTitle().contains(name)).toList();
	}

	public boolean verifyMember(String id) {
		return library.getMemberMap().containsKey(id);
	}

	public void addMember(String name, long id, String phoneNumber, String address, MembershipType type) {
		String memberId = UUID.randomUUID().toString();
		Member newMember = new Member(name, id, phoneNumber, address, new Date(), type, memberId, 0);
		library.addMember(memberId, newMember);
	}

	public void addBook(String title, double fee, int numOfPages, int edition, String language, String author, int year) {
		UUID uniqueID = UUID.randomUUID();
		long id = Math.abs(uniqueID.getMostSignificantBits());
		Book book = new Book(id, title, true, fee, numOfPages, edition, language, author, year);
		library.addBook(id, book);
	}

	public void issueBook(long id, String memberId) {
		Book selectedBook = library.getBookMap().get(id);
		library.getMemberMap().get(memberId).getBorrowedBooks().add(selectedBook);
		library.getBookMap().get(id).setAvailability(false);
	}

	// TODO - kitap alınırken return date ekle. eğer geç gün varsa faiz koy.
	public void calculateFine(Book book) {

	}

	// TODO member- adress- phoneNum- ödenen tutar- kitap adı
	public void createBill() {
		System.out.println("");
	}

	public void returnBook(long id, String memberId) {
		Book selectedBook = library.getBookMap().get(id);
		library.getMemberMap().get(memberId).getBorrowedBooks().remove(selectedBook);
		library.getBookMap().get(id).setAvailability(true);
	}
}
