package Inheritance;

public class Bus extends Vehicle{
	
	private boolean isPublicTransport;

	public Bus(String color, int noOfWheels, String model, boolean isPublicTransport) {
		super(color, noOfWheels, model);
		this.isPublicTransport = isPublicTransport;
		System.out.println("BUS CLASS CONSTRUCTOR CALLED!");
	}

	public boolean isPublicTransport() {
		return isPublicTransport;
	}

	public void setPublicTransport(boolean isPublicTransport) {
		this.isPublicTransport = isPublicTransport;
	}
	
	public void printBusDetails()
	{
		if(isPublicTransport())
			System.out.println("IT IS A PUBLIC TRANSPORT");
		else
			System.out.println("IT IS A PRIVATE TRANSPORT");
	}
	
}
