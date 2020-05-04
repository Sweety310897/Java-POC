package com.shivani.services;

public class Child extends Parent {
	int x = 999;
	public void m2() {
		System.out.println("Child");
	}
	public void marry() {

		System.out.println("Married to gita");
		
	}
	
	public String checkForReturn() {
		System.out.println("String return type");
		return null;
	}
	
	public void checkForScope() {
		System.out.println("Scope has increased from default to public");
	}
	
	public void checkForException() {
		System.out.println("child class did not throw any exception ");
		
	}

}
