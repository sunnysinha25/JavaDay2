package Inheritance;

/*
Inheritance :

Create a class called Vehicle. Create subclasses Truck, Bus and Car. 
Add common methods  in the base class and specific methods in the corresponding 
subclasses. Create a class called Road and create objects for  Truck, Bus and Car
 and display the appropriate messages. Also, in the Vehicle class constructor, 
 initialise the variables colour, no of wheels and model. 
 Give appropriate values for these variables from the invoking subclass.
   
 */


public class Vehicle 
{
	private String color;
	private int noOfWheels;
	private String model;
	
	public Vehicle(String color, int noOfWheels, String model) 
	{
		this.color = color;
		this.noOfWheels = noOfWheels;
		this.model = model;
		System.out.println("VEHICLE CLASS CONSTRUCTOR CALLED!");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void printDetails()
	{
		System.out.println("COLOR: "+this.color);
		System.out.println("NUMBER OF WHEELS: "+this.noOfWheels);
		System.out.println("MODEL: "+this.model);
	}
	
}
