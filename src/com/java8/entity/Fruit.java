package com.java8.entity;

public class Fruit {
	protected String type;
	protected int weight;
	public Fruit(String type, int weight) {
		super();
		this.type = type;
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
