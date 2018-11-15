public class Driver {
	public static void main(String[] args) {
		System.out.println("This is the point of entry into my programe");

		//make a car object with no set fields
		//declare a variable carOne and assign a new Car to it
		Car carOne = new Car();
		//to string is a methode ingerited from Object
		System.out.println("carOne: " + carOne.toString());

		//make a car object with instance variables set in the contsructor
		//declare a variable carTwo and assign a new car to it
		Car carTwo = new Car(1972, "Delorean", "DMC");
		//check out the toString result
		System.out.println("carTwo: " +carTwo.toString());
	}
}
