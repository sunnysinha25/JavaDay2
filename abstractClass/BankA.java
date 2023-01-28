package abstractClass;

public class BankA extends Bank {

	@Override
	public float getBalance() {
		System.out.print("BALANCE IN BANK A: ");
        return this.balance;
	}

}
