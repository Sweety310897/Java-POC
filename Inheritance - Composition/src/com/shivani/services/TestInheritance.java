package com.shivani.services;

public class TestInheritance {

	public static void main(String[] args) throws Exception {
		 
		Parent p = new Parent();
		p.m1(); //Parent
		p.marry(); //married to Sita
		
		Child c = new Child();
		c.m1(); //Parent
		c.m2(); //Child
		c.marry(); //Married to gita
		
		//In overriding method resolution always take care by jvm based on runtime object.
		//Hence overrding is also known as run time polymorphism
		//Parent class ref can be used when we do not know exact runtime obj
		Parent p1 = new Child();
		p1.marry(); //Married to gita
		
		
		//For overriding same method names and arg types. Return types were considered only till 1.4, later
		//covariant types were introduced which were used for overriding
		p.checkForReturn(); //object return type
		c.checkForReturn(); //String return type
		p1.checkForReturn(); //String return type
		
		
		//overriding not applicable for private methods.
		//If we have checkForPrivate method in Child class then its valid but its not overriding happened
		
		
		//If Parent class method is final cannot be overridden
		
		//The scope of the method should increase while overrding not decrease
		p.checkForScope(); // default scope
		c.checkForScope(); //Scope has increased from default to public
		p1.checkForScope(); //Scope has increased from default to public
		
	
		p.checkForException(); //Parent class Exception
		c.checkForException(); //child class did not throw any exception
		p1.checkForException(); //child class did not throw any exception
	
		//Overrdiing applicable only for methods not for varaibles
		System.out.println(p.x); //888
		System.out.println(c.x); //999
		System.out.println(p1.x); //888
	
	
	}
}

