package library.admin;

import library.collection.Book;

import java.util.LinkedList;
import java.util.List;
import java.util.Date;

public class Member extends Person {
	private List<Book> borrowedBooks;
	private double balance;
	private String memberId;
	private MembershipType type;
	private Date registrationDate;
	private String address;
	private String phoneNumber;

	public Member(String name, Long id, String phoneNumber, String address, Date registrationDate, MembershipType type, String memberId, double balance) {
		super(name, id);
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.registrationDate = registrationDate;
		this.type = type;
		this.memberId = memberId;
		this.balance = balance;
		borrowedBooks = new LinkedList<>();
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public MembershipType getType() {
		return type;
	}

	public void setType(MembershipType type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(List<Book> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}

	public void borrowBook(Book book) {
		if (canBorrowBook(book)) {
			borrowedBooks.add(book);
			balance = balance - book.getFee();
		}
	}

	private boolean canBorrowBook(Book book) {
		if (balance < book.getFee()) {
			System.out.println("Your balance is not sufficient");
			return false;
		}
		if (type.getMaxLimit() == getBookCount()) {
			System.out.println("You have reached your max limit");
			return false;
		}
		return true;
	}

	public void returnBook(long bookId) {
		borrowedBooks.removeIf(book -> (book.getId() == bookId));
	}

	public void showBooks() {
		for (Book book : borrowedBooks) {
			System.out.println(book);
		}
	}

	public int getBookCount() {
		return borrowedBooks.size();
	}

	@Override
	public String toString() {
		return "library.admin.Member{" +
				"borrowedBooks=" + borrowedBooks +
				", balance=" + balance +
				", memberId=" + memberId +
				", type=" + type +
				", registrationDate=" + registrationDate +
				", address='" + address + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				'}';
	}
}
