package Interface;

public class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisor_sum(int n) {
		if(n>1000) {
            System.out.println("VALUE OF 'n' SHOULD BE LESS THAN OR EQUAL TO 1000");
            return 0;
        }

        int sum=0;

        for(int i=1; i<=n; i++) {
            if(n%i==0){
                sum+=i;
            }
        }

        return sum;
	}
	
	public static void main(String[] args) {
		MyCalculator obj=new MyCalculator();
        System.out.println("SUM OF DIVISORS: " +obj.divisor_sum(6));
    }

}

/*
EXPECTED INPUT/OUTPUT
SUM OF DIVISORS: 12
*/