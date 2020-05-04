package com.shivani.services;

public class Parent {
	
	int x = 888;
	public void m1() {
		System.out.println("Parent ");
	}
	public void property() {
		System.out.println("Property ");		
	}
	public void marry() {
		System.out.println("Married to sita");
	}
	
	public Object checkForReturn() {
		System.out.println("Object return type");
		return null;
	}
	
	private void checkForPrivate() {
		System.out.println("Private method");
		
	}
	
	void checkForScope() {
		System.out.println("Iam default scope");
		
	}
	public void checkForException() throws Exception {
		System.out.println("Parent class thrown  exception ");
		
	}

}
