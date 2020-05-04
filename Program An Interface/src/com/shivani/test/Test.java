package com.shivani.test;

import com.shivani.examples.Circle;
import com.shivani.examples.Rectangle;
import com.shivani.interfaces.Shape;

public class Test {
	public static void main(String[] args) {
	
		Shape shape = new Circle();
		shape.area();
		
		
		//Interface type as a method argument
		display(shape);
				
		
		//Interface type as  a return type
		shape = getCircle("small circle");
		shape.draw();
		
		
		shape = new Rectangle();
		shape.area();
		display(shape);
		
	}
	
	public static void display(Shape shape) {
		shape.area();
	}
	public static Shape getCircle(String name) {
		Circle circle = new Circle();
		circle.setName(name);
		return circle;
	}


}
