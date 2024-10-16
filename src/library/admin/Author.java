package library.admin;

import java.util.HashSet;
import java.util.Set;

public class Author extends Person {
	Set<Long> bookIds;

	public Author(String name, Long id) {
		super(name, id);
		bookIds = new HashSet<>();
	}

	public Set<Long> getBooks() {
		return bookIds;
	}

	public void setBooks(Set<Long> bookIds) {
		this.bookIds = bookIds;
	}

	public int getBookCount(){
		return bookIds.size();
	}
}

