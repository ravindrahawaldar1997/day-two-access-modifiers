package com.bridgelabz.accessmodifiers;

public class ForReverse {

	public static void main(String[] args) {
			int number=231;
			int remainder, revNumber = 0;
			int i;
			for(i=number; number>0; i++){
				remainder = number % 10;
				number = number / 10;
				revNumber = (revNumber * 10) + remainder;		
			}
			 System.out.println("Reverse Number is " +revNumber);
	}

}
