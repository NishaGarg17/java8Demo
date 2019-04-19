package com.java8.demoApps;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.java8.entity.Apple;
import com.java8.utility.AppleUtility;

public class ComposingComplexPredicateAndOr {

	public static void main(String[] args) {
		ArrayList<Apple> appleList = AppleUtility.getAppleList();
		// print AppleList 
		System.out.println("\nApple list is: ");
		AppleUtility.printAppleList(appleList);
		
		// print AppleList having color is Red
		System.out.println("\nRed Apple list is: ");
		Predicate<Apple> redApplePredicate =  apple -> apple.getColor().equalsIgnoreCase("Red");
		ArrayList<Apple> redAppleList = filterApples(appleList, redApplePredicate);
		AppleUtility.printAppleList(redAppleList);
		
		// print AppleList having weight greater than or equal to 100
		System.out.println("\nAppleList having weight greater than or equal to 100: ");
		AppleUtility.printAppleList(filterApples(appleList, apple -> apple.getWeight() >= 100));
		
		// print Green AppleList
		System.out.println("\nGreen AppleList is: ");
		AppleUtility.printAppleList(filterApples(appleList, apple -> apple.getColor().equalsIgnoreCase("Green")));
		
		// print AppleList which are red or green and having weight >= 100 
		System.out.println("\nAppleList which are red or green and having weight >= 100 ");
		AppleUtility.printAppleList(filterApples(appleList, redApplePredicate.and(apple -> apple.getWeight() >= 100)
		.or(apple -> apple.getColor().equalsIgnoreCase("green"))));
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
