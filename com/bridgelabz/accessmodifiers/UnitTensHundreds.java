package com.bridgelabz.accessmodifiers;

import java.util.Scanner;

public class UnitTensHundreds {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the value of n:");
		Scanner object = new Scanner(System.in);
		num = object.nextInt();
		if(num<10) {
			System.out.println("Unit");
		}
		else if(num<100){
			System.out.println("Ten");
		}
		else if(num<1000) {
			System.out.println("Hundred");
		}
		else {
			System.out.println("Invalid Number");
	}

	}

}
