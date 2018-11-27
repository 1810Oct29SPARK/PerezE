package com.revature.transport;

import com.revature.transport.Vehicle;;

public class Tornado extends Vehicle {

	public void setMaxWindSpeed(double maxWindSpeed) {
		this.maxWindSpeed = maxWindSpeed;
	}

	public Tornado() {
		
	}

	private double maxWindSpeed;

	public Tornado(double maxWindSpeed) {
		super();
		this.maxWindSpeed = maxWindSpeed;
	}

	public double getMaxWindSpeed() {
		return maxWindSpeed;
	}
	
	@Override
	public String toString() {
		return "Tornado [maxWindSpeed=" + maxWindSpeed + "]";
	}

	@Override
	public void move() {
		System.out.println("DESTROYING THE CITY");
	}

}
