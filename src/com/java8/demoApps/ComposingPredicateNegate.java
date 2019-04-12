package com.java8.demoApps;

import java.util.ArrayList;
import java.util.function.Predicate;
import com.java8.entity.Apple;
import com.java8.utility.AppleUtility;

public class ComposingPredicateNegate {
	public static void main(String[] args) {
		// to find apple is red or not
		System.out.println("Apple List is: ");
		ArrayList<Apple> appleList = AppleUtility.getAppleList();
		AppleUtility.printAppleList(appleList);
		System.out.println("Red Apple List is: ");
		Predicate<Apple> redApplePredicate = apple -> apple.getColor().equalsIgnoreCase("red");
		ArrayList<Apple> redAppleList = filterApples(appleList, redApplePredicate);
		AppleUtility.printAppleList(redAppleList);
	System.out.println("Non Red Apple List is: ");
		Predicate<Apple> nonRedApplePredicate = redApplePredicate.negate();
		ArrayList<Apple> nonRedAppleList = filterApples(appleList, nonRedApplePredicate);
		AppleUtility.printAppleList(nonRedAppleList);
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
