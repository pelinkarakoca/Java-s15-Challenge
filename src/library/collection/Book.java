package library.collection;

import library.admin.Author;

import java.time.LocalDate;

public class Book extends LibraryCollection {
	private int year;
	private boolean isAvailable;
	private double fee;
	private int edition;
	private Author author;
	private Category category;
	private LocalDate withdrawDate;
	private Rarity rarity;

	public Book(String title, boolean isAvailable, double fee, int numOfPages, int edition, String language, Author author, int year, Category category) {
		super(title, language, numOfPages);
		this.isAvailable = isAvailable;
		this.edition = edition;
		this.author = author;
		this.year = year;
		this.rarity = calculateRarity();
		this.fee = fee * rarity.getCoefficient();
		this.category = category;
	}

	public int getYear() {
		return year;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setYear(int year) {
		this.year = year;
		this.rarity = calculateRarity();
		this.fee = getFee() * rarity.getCoefficient();
	}


	public boolean isAvailable() {
		return isAvailable;
	}

	public double getFee() {
		return fee;
	}

	public LocalDate getWithdrawDate() {
		return withdrawDate;
	}

	public void setWithdrawDate(LocalDate withdrawDate) {
		this.withdrawDate = withdrawDate;
	}

	public int getEdition() {
		return edition;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAvailability(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	public void setFee(double fee) {
		this.fee = fee * rarity.getCoefficient();
	}

	public void setEdition(int edition) {
		this.edition = edition;
		this.rarity = calculateRarity();
		this.fee = getFee() * rarity.getCoefficient();
	}

	public void setAuthorId(Author author) {
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
				"book_ID=" + getId() +
				", title='" + getTitle() + '\'' +
				", isAvailable=" + isAvailable +
				", fee=" + fee +
				", numOfPages=" + getNumOfPages() +
				", edition=" + edition +
				", language='" + getLanguage() + '\'' +
				", author=" + author+
				'}';
	}
}
