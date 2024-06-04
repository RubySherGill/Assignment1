package com.tka.studentadmission;

import java.util.Scanner;

public class StudentAdmission {
	int TotalGrades=0;

	public void studentMarks(Scanner sc) {
		System.out.println();
		System.out.println("Enter Your English Grade");
		int English = sc.nextInt();
		System.out.println("Enter Your Maths Grade");
		int Maths = sc.nextInt();
		System.out.println("Enter Your Physics Grade");
		int Physics = sc.nextInt();
		System.out.println("Enter Your Chemistry Grade");
		int Chemistry = sc.nextInt();
		System.out.println("Enter Your Biology Grade");
		int Biology = sc.nextInt();
		TotalGrades = English + Maths + Physics + Chemistry + Biology;
		System.out.println("Student Total Grades :" + TotalGrades);
		//return TotalGrades;
	}

	public void average() {
		//TotalGrades = studentMarks();
		float average = TotalGrades / 5;
		System.out.println("Average :" + average);
		if (average > 80) {
			System.out.println("Student is Eligible for Admission");
		} else if (average <= 80) {
			System.out.println("Student is NOT Eligible for Admission");
		}

	}

	public void exit() {
		System.out.println("Thank you to use this Application...");

	}

	public static void main(String[] args) {
		StudentAdmission studentAdmission = new StudentAdmission();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("======= Students grades for the Admission Eligibility =======");
			System.out.println();
			System.out.println("============== Enter Your Choice ==============");
			System.out.println("1. Enter Your Grades");
			System.out.println("2. Check Eligibilty");
			System.out.println("3. Exit Program");
			int choice = sc.nextInt();
			if (choice == 1) {
				studentAdmission.studentMarks(sc);
			}

			else if (choice == 2) {
				studentAdmission.average();
			}

			else if (choice == 3) {
				studentAdmission.exit();
				return;
			}

			else {
				System.out.println("Enter a Valid Choice");
			}

		}

	}
}
