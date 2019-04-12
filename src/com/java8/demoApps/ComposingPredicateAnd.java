package com.java8.demoApps;

import java.util.ArrayList;
import java.util.function.Predicate;
import com.java8.entity.Apple;
import com.java8.utility.AppleUtility;

public class ComposingPredicateAnd {
	public static void main(String[] args) {
		// to find apple is red or not
		System.out.println("Apple List is: ");
		ArrayList<Apple> appleList = AppleUtility.getAppleList();
		AppleUtility.printAppleList(appleList);
		System.out.println("\nRed Apple List is: ");
		ArrayList<Apple> redAppleList = filterApples(appleList, apple -> apple.getColor().equalsIgnoreCase("red"));
		AppleUtility.printAppleList(redAppleList);
		System.out.println("\nApple List having weight greater than 50 is: ");
		ArrayList<Apple> nonRedAppleList = filterApples(appleList, apple -> apple.getWeight() > 50);
		AppleUtility.printAppleList(nonRedAppleList);
		System.out.println("\nApple List which are red and has weight greater than 50 is: ");
		Predicate<Apple> redApplePredicate = apple -> apple.getColor().equalsIgnoreCase("red");
		ArrayList<Apple> heavyAndRedAppleList = filterApples(appleList, redApplePredicate.and(apple -> apple.getWeight() > 50));
		AppleUtility.printAppleList(heavyAndRedAppleList);
	}

	private static ArrayList<Apple> filterApples(ArrayList<Apple> appleList, Predicate<Apple> p) {
		ArrayList<Apple> resultList = new ArrayList<Apple>();
		for(Apple apple : appleList) {
			if(p.test(apple)) {
				resultList.add(apple);
			}
		}
		return resultList;
	}
}
