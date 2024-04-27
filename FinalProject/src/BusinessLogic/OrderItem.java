package BusinessLogic;


public class OrderItem {
	String Orderid;
	String itemId;
	int quantity;
	//Item item = new Item();

	public OrderItem(String OrderId,String itemId, int quantity) {
		this.Orderid = OrderId;
		this.itemId = itemId;
		this.quantity = quantity;
	}
	public OrderItem()
	{
		
	}
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public void setOrderItem(String itemId , int quantity)
	{
	
	//	Item itemA = new Item();
		//int index=menu.searchMenuList(itemId, null);
		//this.item = menu.MenuList.get(index);
		
		this.itemId=itemId;
		this.quantity=quantity;
	}
	public String getId() {
		return Orderid;
	}

	public void setId(String id) {
		this.Orderid = id;
	}
	

}