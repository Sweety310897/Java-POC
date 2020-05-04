package com.shivani.robots;

import com.shivani.examples.Dog;

public class MurderRobotDog {
	Dog d;
	MurderRobot r;
	MurderRobotDog() {
		r = new MurderRobot();
		d = new Dog();
		
	}
	public void bark() {
		d.bark();
	}
	public void kill() {
		r.kill();
	}
	public void drive() {
		r.drive();
	}
}
