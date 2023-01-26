package Inheritance;

public class Truck extends Vehicle
{
	private String shippingDetails;

	public Truck(String color, int noOfWheels, String model, String shippingDetails) {
		super(color, noOfWheels, model);
		this.shippingDetails = shippingDetails;
		System.out.println("TRUCK CLASS CONSTRUCTOR CALLED!");
	}

	public String getShippingDetails() {
		return shippingDetails;
	}

	public void setShippingDetails(String shippingDetails) {
		this.shippingDetails = shippingDetails;
	}
	
	public void printTruckDetails()
	{
		System.out.println("SHIPPING TO: "+this.shippingDetails);
	}
	
}
