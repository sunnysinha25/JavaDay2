package Calculator;
/*
 Methods ->
Implement a class Calculator with the method mentioned below. 
Method Description
findAverage()
Calculate the average of three numbers
Calculate the average of four numbers
Calculate the average of five numbers
Return the average rounded off to two decimal digits
​​​​Test the functionalities using the provided Tester class. 
Hint:  For round-off to two decimal digits:
double num1 = 65, num2 = 175;
double num3 = num1/num2;
System.out.println(Math.round(num3*100.0)/100.0);
// 678.90876 -> 67890.876 -> 67891 ->  678.91
 */

public class Calculator 
{
	float findAverage(float a, float b, float c)
	{
		float avg=0f;
		avg=(a+b+c)/3;
		return Math.round(avg*100f)/100f;
	}

	float findAverage(float a, float b, float c, float d)
	{
		float avg=0f;
		avg=(a+b+c+d)/4;
		return Math.round(avg*100f)/100f;
	}

	float findAverage(float a, float b, float c, float d, float e)
	{
		float avg=0f;
		avg=(a+b+c+d)/4;
		return Math.round(avg*100f)/100f;
	}

}