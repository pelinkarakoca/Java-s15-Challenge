package library.collection;

import java.util.Scanner;

public final class UserInput {
	private Scanner scanner;
	public static final UserInput instance = new UserInput();

	private UserInput(){
		scanner = new Scanner(System.in);
	}

	public void createMenu(){
		System.out.println("0: Add new book");
		System.out.println("1: Select book -> id, title, author");
		System.out.println("2: Update book");
		System.out.println("3: Delete book");
		System.out.println("4: Select category");
		System.out.println("5: Select author");
		System.out.println("6: Withdraw book");
		System.out.println("7: Deposit book");
		System.out.println("Please select a number");
		int selectNumber = scanner.nextInt();

	}

}
