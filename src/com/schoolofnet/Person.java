package com.schoolofnet;

public class Person {
	public String colorHair;
	public String eyeColor;
	public Float height;
	
	public Person() {
		System.out.println("Executing constructor");
	}
	
	public Person(String colorHair, Float height, String eyeColor) {
		this.colorHair = colorHair;
		this.eyeColor = eyeColor;
		this.height = height;
	}
	
	public void walk() {
		System.out.println("I'm walking..");
	}
}