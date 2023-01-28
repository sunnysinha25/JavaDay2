package abstractClass;

public class TestBank {

	public static void main(String[] args) 
	{
		Bank ob1 = new BankA();
        	ob1.setBalance(100);
        	System.out.println(ob1.getBalance());

        	Bank ob2 = new BankB();
        	ob2.setBalance(150);
        	System.out.println(ob2.getBalance());

        	Bank ob3 = new BankC();
        	ob3.setBalance(200);
        	System.out.println(ob3.getBalance());
	}

}

/*
EXPECTED INPUT/OUTPUT
BALANCE IN BANK A: 100.0
BALANCE IN BANK B: 150.0
BALANCE IN BANK C: 200.0
*/
