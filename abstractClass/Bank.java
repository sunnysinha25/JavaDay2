package abstractClass;

public abstract class Bank {
	protected float balance;

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
    public abstract float getBalance();
}
