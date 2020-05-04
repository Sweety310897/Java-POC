package com.shivani.services;

import com.shivani.examples.Cat;
import com.shivani.examples.Dog;
import com.shivani.robots.CleaningRobot;
import com.shivani.robots.MurderRobot;


public class TestComposition {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
		//dog = eat + bark
		//cat = eat+meow
		//cleaningrobot = drive + clean
		//murderrobot = drive + kill
		
		
		Cat c = new Cat();
		c.meow();
		c.eat();
		
		CleaningRobot crobot = new CleaningRobot();
		crobot.clean();
		crobot.drive();
		
		MurderRobot mrobot = new MurderRobot();
		mrobot.drive();
		mrobot.kill();
		
		//A scenario came where a customer wants a murderrobotdog which can bark,kill,drive but not eat
		//murderrobotdog = drive+ kill+bark
	
//		MurderRobotDog m = new MurderRobotDog();
//		m.bark();
//		m.kill();
//		m.drive();
	}
}




