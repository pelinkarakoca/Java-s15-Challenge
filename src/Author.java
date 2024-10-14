import library.collection.Book;

import java.util.HashSet;
import java.util.Set;

public class Author extends Person {
	Set<Book> books;

	public Author(String name, Long id) {
		super(name, id);
		books = new HashSet<>();
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	public void addNewBook(Book book) {
		books.add(book);
	}

	public void showBooks() {
		for(Book book: books){
			System.out.println(book);
		}
	}

	public int getBookCount(){
		return books.size();
	}
}

