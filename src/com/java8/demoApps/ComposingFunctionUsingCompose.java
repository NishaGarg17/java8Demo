package com.java8.demoApps;

import java.util.function.Function;

import com.java8.utility.Letter;

public class ComposingFunctionUsingCompose {
	public static void main(String args[]) {
		String letterText = "This is to inform you that I will be on leave for next week.";
		Function<String, String> addHeader = Letter :: addHeader;
		String resultantString = performOperation(letterText, addHeader.compose(Letter :: turnToLowerCase).compose(Letter :: addFooter));
		System.out.println("My Letter is: \n" + resultantString);
		
	}

	private static String performOperation(String letterText, Function<String, String> function) {
		return function.apply(letterText);
	}
}
