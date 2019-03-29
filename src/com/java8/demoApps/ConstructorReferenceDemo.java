package com.java8.demoApps;

import java.util.HashMap;
import java.util.function.BiFunction;
import com.java8.entity.Fruit;
import com.java8.entity.Mango;
import com.java8.entity.Orange;

public class ConstructorReferenceDemo {
	 static HashMap<String,BiFunction<String,Integer,Fruit>> map = new HashMap();
	public static void main(String[] args) {
		map.put("mango",Mango::new);
		map.put("orange",Orange::new);
		Fruit fruit = giveMeFruit("mango",1);
		System.out.println("Fruit is: " + fruit.getType() + " is of weight: " + fruit.getWeight());
		fruit = giveMeFruit("orange",2);
		System.out.println("Fruit is: " + fruit.getType() + " is of weight: " + fruit.getWeight());
	}

	private static Fruit giveMeFruit(String type, int weight) {
		return map.get(type.toLowerCase()).apply(type, weight);
		
	}

}
