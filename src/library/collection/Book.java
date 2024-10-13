package library.collection;
import java.util.Date;
import java.util.Optional;
public class Book {
	private long book_ID;
	private int year;
	private String title;
	private boolean isAvailable;
	private double fee;
	private int numOfPages;
	private int edition;
	private String language;
	private String author;
	private Optional<Date> withdrawDate;
	private Rarity rarity;


	public Book(long book_ID, String title, boolean isAvailable, double fee, int numOfPages, int edition, String language, String author, int year) {
		this.book_ID = book_ID;
		this.title = title;
		this.isAvailable = isAvailable;
		this.numOfPages = numOfPages;
		this.edition = edition;
		this.language = language;
		this.author = author;
		this.year = year;
		this.rarity = calculateRarity();
		this.fee = fee * rarity.getCoefficient();
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public long getBook_ID() {
		return book_ID;
	}

	public String getTitle() {
		return title;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public double getFee() {
		return fee;
	}

	public Optional<Date> getWithdrawDate() {
		return withdrawDate;
	}

	// TODO
	public void setWithdrawDate(Optional<Date> withdrawDate) {
		this.withdrawDate = withdrawDate;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public int getEdition() {
		return edition;
	}

	public String getLanguage() {
		return language;
	}

	public String getAuthor() {
		return author;
	}

	public void setBook_ID(long book_ID) {
		this.book_ID = book_ID;
	}

	public void setAvailability(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void updateAvailability(boolean available){
		this.isAvailable = available;
		System.out.println("operation is completed");
	}

	private Rarity calculateRarity(){
			if (year < 1930) {
				if (edition <= 2) {
					rarity = Rarity.UNIQUE;
				} else {
					rarity = Rarity.RARE;
				}
			} else if (year > 1931 && year < 1960) {
				if (edition == 1) {
					rarity = Rarity.UNIQUE;
				} else if (edition < 3) {
					rarity = Rarity.RARE;
				}
				else {
					rarity = Rarity.COMMON;
				}
			} else {
				rarity = Rarity.COMMON;
			}
			return rarity;

	}


	@Override
	public String toString() {
		return "Book{" +
				"book_ID=" + book_ID +
				", title='" + title + '\'' +
				", isAvailable=" + isAvailable +
				", fee=" + fee +
				", numOfPages=" + numOfPages +
				", edition=" + edition +
				", language='" + language + '\'' +
				", author=" + author +
				'}';
	}
}
