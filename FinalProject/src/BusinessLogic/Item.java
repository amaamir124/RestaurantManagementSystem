package BusinessLogic;
public class Item {
	String id;
	String name;
	double price;

	//for all Items 
	public Item(String id, String name,double price) {
		
		this.id = id;
		this.name = name;
		this.price=price;
	}
	
	//for menu items
	public Item(String id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public Item()
	{
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void printItemDetails()
	{
	   	 System.out.println("Item name        : " + this.name); 
	   	 System.out.println("Item ID          : " + this.id); 
	  	 System.out.println("Item price       : " + this.price); 
	}
	
}
