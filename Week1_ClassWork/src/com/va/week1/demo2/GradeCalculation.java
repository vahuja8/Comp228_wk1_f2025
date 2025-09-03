package com.va.week1.demo2;

import java.util.Scanner;

/*
 * Calculate and store student grades for various subjects.
This project stores student grades for various subjects, 
calculates their average, and determines their final grade.
 */

public class GradeCalculation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// get student name..
		System.out.println("Enter student name:");
		String studentName = scanner.nextLine();

		// Get number of subjects
		System.out.println("Enter number of subjects:");
		int numSubjects = scanner.nextInt();

		// Array to store grades
		double[] grades = new double[numSubjects];
		double total = 0;

		// Loop to input grades and calculate total
		for (int i = 0; i < numSubjects; i++) {
			System.out.println("Enter grade for subject " + (i + 1) + ":");
			grades[i] = scanner.nextDouble();
			total += grades[i]; // Adding grades to total
		}

		// Calculate average
		double average = total / numSubjects;

		// Determine pass or fail status
		String status = (average >= 60) ? "Pass" : "Fail";

		// Display result
		System.out.println("Student: " + studentName);
		System.out.println("Average grade: " + average);
		System.out.println("Status: " + status);

		scanner.close();

	}

}
