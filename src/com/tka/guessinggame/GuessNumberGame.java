package com.tka.guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
	public void playGame(Scanner sc) {
		Random random = new Random();
		int generatedNumber = random.nextInt(10);
		int attempts = 0;
		System.out.println("Random Number is generated between 1 to 10");
		System.out.println("Enter your Guess Number");
		attempts++;
		int guessNumber = sc.nextInt();
		if (generatedNumber == guessNumber) {
			System.out.println("Congratulation!!!! you win the Game");
			System.out.println("You Guess the Number in " + attempts + " attempts");
		} else {
			int gap = generatedNumber - guessNumber;
			if (gap < 0) {
				gap = gap * -1;
			}
			if (gap <= 3) {
				System.out.println("You are close to the Generated Number");
			} else {
				System.out.println("You are far away from the Generated Number");
			}
		}
		System.out.println("Generated Number is : " + generatedNumber);
		System.out.println("Your Guess Number is : " + guessNumber);

	}

	public void exitGame() {
		System.out.println("Thanku to Play the Game.........");

	}

	public static void main(String[] args) {
		GuessNumberGame guessNumberGame = new GuessNumberGame();
		Scanner sc = new Scanner(System.in);
		System.out.println("===================== Welcome to Guess the Number Game ==================");
		System.out.println("Press 1 to Play the Game");
		System.out.println("Press 2 to Exit the Game");
		int Choice = sc.nextInt();

		switch (Choice) {
		case 1: {
			guessNumberGame.playGame(sc);
			break;
		}
		case 2: {
			guessNumberGame.exitGame();
			break;
		}
		default: {
			System.out.println("Enter a valid number");
		}
		}

	}

}
