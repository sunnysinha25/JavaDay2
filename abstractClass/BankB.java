package abstractClass;

public class BankB extends Bank {

	@Override
	public float getBalance() {
		System.out.print("BALANCE IN BANK B: ");
        return this.balance;
	}

}
