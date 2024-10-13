import library.collection.Book;

import java.util.*;
import java.util.stream.Collectors;

public class Library {
	private Map<Long, Book> bookMap;
	private Map<String, Member> memberMap;

	public Library(Set<Member> memberList, List<Book> bookList) {
		Map<Long, Book> bookMap = new HashMap<>();
		for(Book book: bookList){
			bookMap.put(book.getBook_ID(), book);
		}
		Map<String, Member> memberMap = new HashMap<>();
		for(Member member: memberList){
			memberMap.put(member.getMemberId(), member);
		}
	}

	public Map<String, Member> getMemberMap() {
		return memberMap;
	}

	public Map<Long, Book> getBookMap() {
		return bookMap;
	}

	public void addMember(String id, Member member) {
		memberMap.put(id, member);
	}

	public void addBook(Long id, Book book) {
		bookMap.put(id, book);

	}

	public Book withdrawBook(long bookId) {
		Book selectedBook = bookMap.get(bookId);
		selectedBook.updateAvailability(false);
		return selectedBook;
	}

	public void depositBook(long bookId) {
		Book selectedBook = bookMap.get(bookId);
		selectedBook.updateAvailability(true);
	}

	public List<Book> showAvailableBooks() {
		return bookMap.values().stream().filter(Book::isAvailable).toList();
	}
}
