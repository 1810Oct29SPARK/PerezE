//first POJO
public class Car {
	//constructor with no fields (a "no-args" constructor)
	public Car() { System.out.println("called noargs consturctor");
	}

	//constructor with all the fields
	public Car(int yearManufactured, String model, String make) {
		//this refers to the car object being created, not the argument
		this.yearManufactured = yearManufactured;
		this.model = model;
		this.make = make;
	}

	//private instance variables accessible only within the class
	private int yearManufactured;
	private String model;
	private String make;

	//getters and setters (accessors and mutators)
	public int getYearManufactured() {
		return this.yearManufactured;
	}

	public String getModel() {
		return this.model;
	}

	public String getMake() {
		return this.make;
	}
}
