package com.tka.guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame_Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int generatedNumber;
		int guessNumber;
		int attempts = 0;
		boolean b = true;
		do {
			System.out.println("===================== Welcome to Guess the Number Game ==================");
			System.out.println("Press 1 for Guess Number ");
			System.out.println("Press 2 for Exit Guess Number");
			int Choice = scanner.nextInt();
			switch (Choice) {
			case 1: {
				Random random = new Random();
				generatedNumber = random.nextInt(10);
				System.out.println("Random Number is Generated between 1 to 10");
				System.out.println("Enter Your Guess Number");
				guessNumber = scanner.nextInt();
				attempts++;
				if (generatedNumber == guessNumber) {
					System.out.println("Conguratulation!!! Your Guess Number is Correct");
					System.out.println("You Guess the number in " + attempts + " attempts");
				} else {
					int gap = generatedNumber - guessNumber;
					if (gap < 0) {
						gap = gap * -1;
					}
					if (gap <= 3) {
						System.out.println("You are Close to the Generated Number");
					} else {
						System.out.println("You are far Away from the Generated Number");
					}
				}

				System.out.println("Generated Number is :" + generatedNumber);
				System.out.println("Your Guess Number is :" + guessNumber);
				break;
			}

			case 2: {
				b = false;
				break;
			}

			default: {
				System.out.println("Invalid Number");
			}

			}

		} while (b);
		System.out.println("App Terminated...");

	}

}
