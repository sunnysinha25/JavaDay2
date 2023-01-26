package Inheritance;

public class Car extends Vehicle{
	private boolean isImported;

	public Car(String color, int noOfWheels, String model, boolean isImported) {
		super(color, noOfWheels, model);
		this.isImported = isImported;
		System.out.println("CAR CLASS CONSTRUCTOR CALLED!");
	}

	public boolean isImported() {
		return isImported;
	}

	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}
	
	public void printCarDetails()
	{
		if(isImported())
			System.out.println("IT IS IMPORTED FROM ANOTHER COUNTRY");
		else
			System.out.println("IT IS MANUFACTURED IN INDIA");
	}

}
