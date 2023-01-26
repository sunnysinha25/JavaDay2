package Inheritance;

public class Road {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Truck truck = new Truck("Brown",8,"Eicher 4564", "Durgapur, West Bengal");
        truck.printDetails();
        truck.printTruckDetails();
        System.out.println();

        Bus bus = new Bus("Red",10,"Ashok Leyland",false);
        bus.printDetails();
        bus.printBusDetails();
        System.out.println();

        Car car = new Car("Blue",4,"Hyundai Sportz",true);
        car.printDetails();
        car.printCarDetails();
        System.out.println();
        
	}

}

/*
EXPECTED INPUT/OUTPUT

VEHICLE CLASS CONSTRUCTOR CALLED!
TRUCK CLASS CONSTRUCTOR CALLED!
COLOR: Brown
NUMBER OF WHEELS: 8
MODEL: Eicher 4564
SHIPPING TO: Durgapur, West Bengal

VEHICLE CLASS CONSTRUCTOR CALLED!
BUS CLASS CONSTRUCTOR CALLED!
COLOR: Red
NUMBER OF WHEELS: 10
MODEL: Ashok Leyland
IT IS A PRIVATE TRANSPORT

VEHICLE CLASS CONSTRUCTOR CALLED!
CAR CLASS CONSTRUCTOR CALLED!
COLOR: Blue
NUMBER OF WHEELS: 4
MODEL: Hyundai Sportz
IT IS IMPORTED FROM ANOTHER COUNTRY


*/
