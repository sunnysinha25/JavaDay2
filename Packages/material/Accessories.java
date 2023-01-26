package material;
import stock.Inventory;

public class Accessories extends Inventory
{
	private int id;
    private String description;

    public Accessories(int id) {
        this.id = id;
        this.description = "A"+id;
        super.setLowOrderLevelQuantity(5);
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
        return "Accessories{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", lowOrderLevelQuantity=" + lowOrderLevelQuantity +
                '}';
    }
	
}
