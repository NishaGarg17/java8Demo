package com.java8.utility;

public class Letter {
	public static String addHeader(String text) {
		return "From: Nisha Garg \n" + text;
	}
	public static String addFooter(String text) {
		return text + " \nKind Regards";
	}
	public static String turnToLowerCase(String text) {
		return text.toLowerCase();
	}
}
