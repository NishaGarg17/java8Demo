package com.java8.demoApps;

import java.util.Scanner;

public class StringsEvenOddCharacterComparison {
	static String str1;
	static String str2;

	public static void main(String[] args) {
		// call to getInput method
		getInput();
		// call to compareAndFindMatchedChars method
		compareAndFindMatchedChars();

	}

	// getting input from user
	private static void getInput() {
		Scanner sc = new Scanner(System.in);
		// input first string from user
		System.out.println("String input1: ");
		str1 = sc.next();
		// input second string from user

		System.out.println("String input2: ");
		str2 = sc.next();

	}

	// find out the matched characters in two input strings
	private static void compareAndFindMatchedChars() {
		int count;
		for(int i = 1; i < str1.length(); i=i+2 ) {
			int currentCharCount = 1;
			count = 0;
			boolean isRepitiveChar = false;
			for(int k=i+2; k< str1.length(); k=k+2 ) {
				if(str1.charAt(i) == str1.charAt(k)) {
					currentCharCount++;
				}
			}
			for(int temp = i-2 ; temp > 0; temp = temp-2) {
				if(str1.charAt(i) == str1.charAt(temp)) {
					isRepitiveChar = true;
				}
			}
			//System.out.println("Current char count for: " + str1.charAt(i) + " is " + currentCharCount);
			if(isRepitiveChar == false) {
				for(int j=0; j< str2.length(); j=j+2) {
					if(str1.charAt(i) == str2.charAt(j)) {
						//System.out.println("Match Found for character: " + str1.charAt(i));
						count++;
					}
					
				}
			}
			if (isRepitiveChar == false) {
				System.out.println(str1.charAt(i) + " even char of " + str1  + " matched " + count*currentCharCount + " times with odd chars of String " + str2 );
			} 
		}
	}

}
