package com.revature.example;

import com.revature.transport.*;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		//create new car object
		Car myCar = new Car(2021, "Elantra", "Hyundai", 50);
		
		//in Car, change overridden move() from vehicle so that a MaitenanceException
		//can be thrown if oil has not been changed recently

		try {
		myCar.move();
		}catch (MaintenanceException m) {
			m.printStackTrace();
		}
		
		//drive around for a bit
		myCar.setMilesSinceOilChange(5500);
		
		//try to restart car
		try {
			myCar.move();
		}catch (MaintenanceException m) {
			m.printStackTrace();
			//change the oil
			myCar.setMilesSinceOilChange(0);
			//try to move car
			//you can nest try-catch, but be careful with this
			try {
				myCar.move();
				System.out.println(myCar);
			}catch (MaintenanceException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
