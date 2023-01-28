package abstractClass;

public class BankC extends Bank {

	@Override
	public float getBalance() {
		System.out.print("BALANCE IN BANK C: ");
        return this.balance;
	}

}
