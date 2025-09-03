package com.va.week1.EvenOdd;

import java.util.Scanner;

/*
 *  Program to check if the number entered by user is even or odd
 */

public class EvenOdd {

	public static void main(String args[]) {

		int num;
		System.out.println("enter a integer no...");

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " is an even number.");
		} else {
			System.out.println(num + " is an odd number.");
		}
		
		
		sc.close();

	}

}
