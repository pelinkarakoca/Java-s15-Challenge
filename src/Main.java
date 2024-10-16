import library.admin.Library;
import library.admin.Librarian;
import library.admin.Author;
import library.collection.Book;
import library.admin.Member;
import library.admin.MembershipType;
import library.collection.Category;

import java.util.*;

// TODO- Constructorda ID olanlarda UUID ile içinde ekle ID'yi parametre geçme
// TODO- Control durumları -> hatalı tipte girişler için menüye kontrol
// TODO- Librarian'a password -> addBook- deleteBook-updateBook için
//
public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Hello world!");

		Library library = new Library(getMembers(), getBooks());
		Librarian librarian = new Librarian("Tammy Swanson", 1L, library);
		createMenu(librarian);
	}


	private static List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		// Adding 20 Book instances to the list with corresponding authors
		books.add(new Book("The Great Gatsby", true, 10.99, 180, 1, "English", new Author("F. Scott Fitzgerald", 1L), 1925, Category.ROMANCE));
		books.add(new Book("To Kill a Mockingbird", true, 12.50, 281, 1, "English", new Author("Harper Lee", 2L), 1960, Category.HORROR));
		books.add(new Book("1984", false, 15.00, 328, 1, "English", new Author("George Orwell", 3L), 1949, Category.MYSTERY));
		books.add(new Book("Moby Dick", true, 11.75, 635, 3, "English", new Author("Herman Melville", 4L), 1851, Category.FANTASY));
		books.add(new Book("War and Peace", false, 20.00, 1225, 2, "Russian", new Author("Leo Tolstoy", 5L), 1869, Category.SCI_FI));
		books.add(new Book( "Pride and Prejudice", true, 9.50, 279, 1, "English", new Author("Jane Austen", 6L), 1813, Category.THRILLER));
		books.add(new Book( "The Odyssey", true, 8.99, 500, 4, "Greek", new Author("Homer", 7L), -700, Category.MYSTERY));
		books.add(new Book("Crime and Punishment", false, 14.99, 671, 1, "Russian", new Author("Fyodor Dostoevsky", 8L), 1866, Category.MYSTERY));
		books.add(new Book( "Brave New World", true, 13.25, 311, 1, "English", new Author("Aldous Huxley", 9L), 1932, Category.MYSTERY));
		books.add(new Book("The Catcher in the Rye", false, 10.50, 277, 1, "English", new Author("J.D. Salinger", 10L), 1951, Category.MYSTERY));
		books.add(new Book( "Ulysses", true, 18.75, 730, 1, "English", new Author("James Joyce", 11L), 1922, Category.MYSTERY));
		books.add(new Book( "The Divine Comedy", true, 22.00, 798, 1, "Italian", new Author("Dante Alighieri", 12L), 1320, Category.MYSTERY));
		books.add(new Book( "Don Quixote", false, 17.50, 1072, 2, "Spanish", new Author("Miguel de Cervantes", 13L), 1605, Category.MYSTERY));
		books.add(new Book( "The Hobbit", true, 14.50, 310, 2, "English", new Author("J.R.R. Tolkien", 14L), 1937, Category.MYSTERY));
		books.add(new Book( "Fahrenheit 451", false, 12.99, 194, 1, "English", new Author("Ray Bradbury", 15L), 1953, Category.MYSTERY));
		books.add(new Book( "Jane Eyre", true, 10.75, 500, 3, "English", new Author("Charlotte Brontë", 16L), 1847, Category.MYSTERY));
		books.add(new Book( "Frankenstein", true, 11.99, 280, 1, "English", new Author("Mary Shelley", 17L), 1818, Category.MYSTERY));
		books.add(new Book( "One Hundred Years of Solitude", false, 15.75, 417, 1, "Spanish", new Author("Gabriel García Márquez", 18L), 1967, Category.MYSTERY));
		return books;
	}

	private static Set<Member> getMembers() {
		Set<Member> members = new HashSet<>();
		members.add(new Member("John Doe", 1L, "1234567890", "123 Main St", new Date(), MembershipType.STUDENT, "M001", 50.00));
		members.add(new Member("Jane Smith", 2L, "0987654321", "456 Oak Ave", new Date(), MembershipType.INSTRUCTOR, "M002", 75.00));
		members.add(new Member("Emily Johnson", 3L, "5678901234", "789 Pine St", new Date(), MembershipType.OTHER, "M003", 100.00));
		members.add(new Member("Michael Brown", 4L, "2345678901", "101 Maple St", new Date(), MembershipType.STUDENT, "M004", 20.00));
		members.add(new Member("Sarah Davis", 5L, "3456789012", "102 Elm St", new Date(), MembershipType.INSTRUCTOR, "M005", 55.00));
		members.add(new Member("David Wilson", 6L, "4567890123", "103 Birch St", new Date(), MembershipType.OTHER, "M006", 90.00));
		members.add(new Member("Laura Moore", 7L, "5678901234", "104 Cedar St", new Date(), MembershipType.STUDENT, "M007", 25.00));
		members.add(new Member("James Taylor", 8L, "6789012345", "105 Cherry St", new Date(), MembershipType.INSTRUCTOR, "M008", 65.00));
		members.add(new Member("Olivia Martin", 9L, "7890123456", "106 Fir St", new Date(), MembershipType.OTHER, "M009", 30.00));
		members.add(new Member("Alexander Thomas", 10L, "8901234567", "107 Poplar St", new Date(), MembershipType.STUDENT, "M010", 40.00));
		members.add(new Member("Isabella White", 11L, "9012345678", "108 Spruce St", new Date(), MembershipType.INSTRUCTOR, "M011", 80.00));
		members.add(new Member("Ethan Harris", 12L, "0123456789", "109 Redwood St", new Date(), MembershipType.OTHER, "M012", 70.00));
		members.add(new Member("Sophia Clark", 13L, "1234567891", "110 Aspen St", new Date(), MembershipType.STUDENT, "M013", 35.00));
		members.add(new Member("Mason Lewis", 14L, "2345678902", "111 Beech St", new Date(), MembershipType.INSTRUCTOR, "M014", 90.00));
		members.add(new Member("Mia Walker", 15L, "3456789013", "112 Oak St", new Date(), MembershipType.OTHER, "M015", 60.00));
		members.add(new Member("Logan Hall", 16L, "4567890124", "113 Pine St", new Date(), MembershipType.STUDENT, "M016", 55.00));
		members.add(new Member("Ava Young", 17L, "5678901235", "114 Maple St", new Date(), MembershipType.INSTRUCTOR, "M017", 85.00));
		members.add(new Member("Jackson King", 18L, "6789012346", "115 Elm St", new Date(), MembershipType.OTHER, "M018", 75.00));
		members.add(new Member("Amelia Scott", 19L, "7890123457", "116 Birch St", new Date(), MembershipType.STUDENT, "M019", 45.00));
		members.add(new Member("Lucas Green", 20L, "8901234568", "117 Cedar St", new Date(), MembershipType.INSTRUCTOR, "M020", 95.00));
		return members;
	}

	;

	public static void createMenu(Librarian librarian) {
		int selectNumber;
		do {
			System.out.println("0: Add new book");
			System.out.println("1: Select book -> id, title, author");
			System.out.println("2: Update book");
			System.out.println("3: Delete book");
			System.out.println("4: Select category");
			System.out.println("5: Select author");
			System.out.println("6: Withdraw book");
			System.out.println("7: Deposit book");
			System.out.println("Please select a number");
			selectNumber = scanner.nextInt();
			scanner.nextLine();
		} while (selectNumber < 0 || selectNumber > 7);

		switch (selectNumber) {
			case 0:
				addBook(librarian);
				break;
			case 1:
				selectBook(librarian);
				break;
			case 2:
				updateBook(librarian);
				break;
			case 3:
				deleteBook(librarian);
				break;
			case 4:
				selectByCategory(librarian);
				break;
			case 5:
				selectByAuthor(librarian);
				break;
			case 6:
				issueBook(librarian);
				break;
			case 7:
				returnBook(librarian);
				break;
		}

	}

	private static void returnBook(Librarian librarian) {
		System.out.println("Please enter member id");
		String memberId2 = scanner.nextLine();
		System.out.println("Please enter book id");
		long depositBookId = scanner.nextLong();
		scanner.nextLine();
		librarian.returnBook(depositBookId, memberId2);
		System.out.println("Operation is completed");
	}

	private static void issueBook(Librarian librarian) {
		System.out.println("Please enter member id");
		String memberId = scanner.nextLine();
		System.out.println("Please enter book id");
		long withdrawBookId = scanner.nextLong();
		scanner.nextLine();
		librarian.issueBook(withdrawBookId, memberId);
		System.out.println("operation is completed");
	}

	private static void selectByAuthor(Librarian librarian) {
		System.out.println("Please enter an author");
		String authorName = scanner.nextLine();
		List<Book> bookList2 = librarian.selectAuthor(authorName);
		for (Book book : bookList2) {
			System.out.println(book);
		}
	}

	private static void selectByCategory(Librarian librarian) {
		System.out.println("Please enter a category");
		String categoryName = scanner.nextLine();
		List<Book> bookList = librarian.selectCategory(Category.valueOf(categoryName.toUpperCase()));
		for (Book book : bookList) {
			System.out.println(book);
		}
	}

	private static void deleteBook(Librarian librarian) {
		System.out.println("Enter the book id");
		long deleteBookId = scanner.nextLong();
		scanner.nextLine();
		librarian.deleteBook(deleteBookId);
		System.out.println("Book is deleted");
	}

	private static void updateBook(Librarian librarian) {
		System.out.println("Enter the book id");
		long bookId = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Please update book info by putting underline between them. Ex: title_fee_numOfPages_edition_language_year_category");
		String updatedBookStr = scanner.nextLine();
		String[] updatedBookArr = updatedBookStr.split("_");
		librarian.updateBook(bookId, updatedBookArr[0], Double.parseDouble(updatedBookArr[1]), Integer.parseInt(updatedBookArr[2]), Integer.parseInt(updatedBookArr[3]), updatedBookArr[4], Integer.parseInt(updatedBookArr[5]), Category.valueOf(updatedBookArr[6].toUpperCase()));
		System.out.println("Update is completed");
	}

	private static void selectBook(Librarian librarian) {
		int case1Num;
		do {
			System.out.println("0: Select book by id");
			System.out.println("1: Select book by title");
			System.out.println("2: Select book by author");
			case1Num = scanner.nextInt();
			scanner.nextLine();
		} while (case1Num < 0 || case1Num > 2);

		switch (case1Num) {
			case 0:
				System.out.println("Enter an id");
				long selectId = scanner.nextLong();
				scanner.nextLine();
				Book book = librarian.searchBookById(selectId);
				System.out.println(book.toString());
				break;
			case 1:
				System.out.println("Enter title");
				String title = scanner.nextLine();
				Book book1 = librarian.searchBookByTitle(title);
				System.out.println(book1.toString());
				break;
			case 2:
				System.out.println("Enter author");
				String author = scanner.nextLine();
				Book book2 = librarian.searchBookByAuthor(author);
				System.out.println(book2);
				break;
		}
	}

	private static void addBook(Librarian librarian) {
		System.out.println("Enter new book by putting underline between them. Ex: title_fee_numOfPages_edition_language_authorName_year_category");
		String bookStr = scanner.nextLine();
		String[] bookArr = bookStr.split("_");
		librarian.addBook(bookArr[0], Double.parseDouble(bookArr[1]), Integer.parseInt(bookArr[2]), Integer.parseInt(bookArr[3]), bookArr[4], (bookArr[5]), Integer.parseInt(bookArr[6]), Category.valueOf(bookArr[7].toUpperCase()));
	}

}