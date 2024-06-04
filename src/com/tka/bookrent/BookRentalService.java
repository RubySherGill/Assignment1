package com.tka.bookrent;

import java.util.Scanner;

public class BookRentalService {
	
	int noOfDays = 0;
	float calculatedRent = 0;
	String Book;

	public void getData(Scanner sc) {
		sc.nextLine();
		System.out.println("Enter Book Name :");
		Book = sc.nextLine();
		//sc.nextLine();
		System.out.println("Enter Number Of Days");
		noOfDays = sc.nextInt();

	}

	public void calculateRent() {
		if (noOfDays <= 7) {
			calculatedRent = noOfDays * 2;
			System.out.println("Rent calculated for 7 days or fewer");
		} else {
			calculatedRent = noOfDays * 1.5f;
			System.out.println("Rent calculated for more than 7 days");
		}

	}

	public void displayRent() {
		System.out.println("Name of Book :" + Book);
		System.out.println("Number of Days :" + noOfDays);
		System.out.println("Calculated Book Rent :" + calculatedRent);

	}

	public void exit() {
		System.out.println("Thank You to visit our Application");

	}

	public static void main(String[] args) {
		BookRentalService bookService = new BookRentalService();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("=============== Book Rental Service ================");
			System.out.println();
			System.out.println("1. Enter number of days");
			System.out.println("2. Calculate Renatl Fee");
			System.out.println("3. Display Calculated Renatl Fee");
			System.out.println("4. Exit");
			System.out.println("=======  Enter Your Choice  ======");
			System.out.println();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				bookService.getData(sc);
				break;

			case 2:
				bookService.calculateRent();
				break;

			case 3:
				bookService.displayRent();
				break;

			case 4:
				bookService.exit();
				break;

			default:
				System.out.println("Enter a Valid Choice");

			}
		}
	}
}
