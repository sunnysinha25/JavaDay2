package material;
import stock.Inventory;

public class Laptops extends Inventory
{
	private int id;
    private String description;

    public Laptops(int id) {
        this.id = id;
        this.description = "L"+id;
        super.setLowOrderLevelQuantity(3);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
	@Override
    public String toString() {
        return "Laptops{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", lowOrderLevelQuantity=" + lowOrderLevelQuantity +
                '}';
    }
	
}
