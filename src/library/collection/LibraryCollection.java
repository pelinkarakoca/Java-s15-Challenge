package library.collection;

import java.util.UUID;

abstract public class LibraryCollection {
	private long id;
	private String title;
	private String language;
	private int numOfPages;

	public LibraryCollection(String title, String language, int numOfPages) {
		UUID uniqueID = UUID.randomUUID();
		this.id = Math.abs(uniqueID.getMostSignificantBits());
		this.title = title;
		this.language = language;
		this.numOfPages = numOfPages;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
}
