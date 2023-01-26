package stock;

public class Inventory {
	protected int quantity;
    protected int lowOrderLevelQuantity;

    public Inventory() {
        this.quantity=0;
        this.lowOrderLevelQuantity=0;
    }

	public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getLowOrderLevelQuantity() {
        return this.lowOrderLevelQuantity;
    }

    public void setLowOrderLevelQuantity(int lowOrderLevelQuantity) {
        this.lowOrderLevelQuantity = lowOrderLevelQuantity;
    }
    
}
