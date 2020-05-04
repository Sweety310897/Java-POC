package com.shivani.examples;

import com.shivani.interfaces.Shape;

public class Rectangle implements Shape{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void area() {
		System.out.println("can calculate area of rectangle");	
	}
	public void draw() {
		System.out.println(name + " is drawn");
	}

}
