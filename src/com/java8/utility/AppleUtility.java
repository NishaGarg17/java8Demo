package com.java8.utility;

import java.util.ArrayList;

import com.java8.entity.Apple;

public class AppleUtility {
	static ArrayList<Apple> appleList = new ArrayList();
	public static ArrayList<Apple> getAppleList() {
		appleList.add(new Apple("Green",50));
		appleList.add(new Apple("Green",50));
		appleList.add(new Apple("Red",25));
		appleList.add(new Apple("Red",100));
		appleList.add(new Apple("Golden",100));
		return appleList;
		
	}
	public static void printAppleList(ArrayList<Apple> appleList) {
		for(Apple apple : appleList) {
			System.out.println(apple + "[color=" + apple.getColor() + ", weight=" + apple.getWeight() + "]");
		}
	}
}
