public class Tank extends Vehicle {
	private int numOfGuns;

	public Tank(int numOfGuns) {
		this.numOfGuns = numOfGuns;
	}

	public int getNumOfGuns() {
		return this.numOfGuns;
	}

	public void setNumOfGuns(int numOfGuns) {
		this.numOfGuns = numOfGuns;
	}

	@Override
	public void move() {
		System.out.println("Tank is crushing everything");
	}
}
