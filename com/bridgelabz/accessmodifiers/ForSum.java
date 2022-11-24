package com.bridgelabz.accessmodifiers;

import java.util.Scanner;

public class ForSum {

	public static void main(String[] args) {
		int num, i, total=0;
		System.out.println("Enter the value of n:");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		for (i=1; i<=num; i++) {
			total = total+i;
		}
		System.out.println("Sum of the natural number is:" +total);
	}

}
