package com.revature.transport;


/*
 * Abstract class cannot be instantiated 
 * if there is a ONE (or more) abstract method(s), THE CLASS MUST BE SBSTRACT
 * (note: opposite of 'abstract' in java in 'concrete'(but there is no kw for it))
 */
public abstract class Vehicle {

	public Vehicle() {
		super();
		System.out.println("vehicle consructor completed");
	}
	/*
	 * I will have to implement this method in the first concrete subclass
	 */
	public abstract void move() throws MaintenanceException;
}
