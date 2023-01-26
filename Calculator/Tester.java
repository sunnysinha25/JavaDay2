package Calculator;

public class Tester {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Calculator obj = new Calculator();
		float avg_3 = obj.findAverage(3.2f, 4f,5.6f);
        float avg_4 = obj.findAverage(3,4.2f,5,6.5f);
        float avg_5 = obj.findAverage(3,4.2f,5,6,8.9f);
        System.out.println("Average of 3 Numbers: " + avg_3);
        System.out.println("Average of 4 Numbers: " + avg_4);
        System.out.println("Average of 5 Numbers: " + avg_5);
	}

}

/*
EXPECTED INPUT/OUTPUT
Average of 3 Numbers: 4.27
Average of 4 Numbers: 4.68
Average of 5 Numbers: 4.55
*/
