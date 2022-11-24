package com.bridgelabz.accessmodifiers;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		boolean isVowel = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character :");
		char ch =input.next().charAt(0);
		switch (ch){
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :
		isVowel = true;
		}
		if(isVowel ==true) {
			System.out.println(ch+" is a Vowel");
		}
		else {
			System.out.println(ch+" is a Consonant ");
		}
	}
}
