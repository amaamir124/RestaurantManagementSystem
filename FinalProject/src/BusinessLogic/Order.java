package BusinessLogic;
import java.util.ArrayList;

public class Order {
	


//ArrayList <Item> OrderList = new ArrayList<Item>(); //List of items on the order
ArrayList<OrderItem> OrderA = new ArrayList<OrderItem>();

OrderItem order = new OrderItem();	

	void enterItem(String itemid , int quantity)
	{
		OrderItem orderitem = new OrderItem();
		orderitem.setOrderItem(itemid, quantity);
	}
	
	public Order()
	{
	}
	 public void EndOrderItem(ArrayList<OrderItem> OrderItem){
		 
		 //saving items from db into ItemList array
		 System.out.println("In end Order item");
		 OrderA = OrderItem;
		 for(int i = 0 ; i < OrderA.size() ; i++)
		 {
			 OrderItem current = new OrderItem();
			 current = OrderA.get(i);
			 System.out.println("OrderId " + current.getId());
			 System.out.println("OrderItemId " + current.getItemId() );
			 System.out.println("Order Item Quantity " + current.getQuantity() );
			 
		 }
		 return;
		 
	 }
	 public OrderItem searchItemList(String orderid, String orderItemId,String itemQuantity,ArrayList<OrderItem> OItem)
	 {	
		 System.out.println("In search item list func in menu");
		 OrderA= OItem;
		 for(int i = 0 ; i < OrderA.size() ; i++)
		 {
			 OrderItem current = new OrderItem();
			 current = OrderA.get(i);
			 System.out.println("OrderId " + current.getId() );
			 System.out.println("OrderItem id " + current.getItemId() );
			 System.out.println("OrderItem Quantity " + current.getQuantity());
			 
		 }
		 int ind=-1;
		 for(int i=0; i<OrderA.size(); i++)
		 {    
			 System.out.println("In search Order item list - for loop ");
			 if(OrderA.get(i).getId().contentEquals(orderid))
			 {
				 System.out.println("In search item list - item found ");
				 ind=i;
				 break;
			 }
			 else
			 {
				 System.out.println("Item not found");
			 }
		 }
		 return OrderA.get(ind);
	 }
	public OrderItem AddOrderItem(String Orderid, String ItemId,String Quantity,ArrayList<OrderItem> OI)
	{
		System.out.println("In add item in menu");
		EndOrderItem(OI);
		 System.out.println("returned to Add item class in menu");
		OrderItem Oitem = searchItemList(Orderid,ItemId,Quantity,OI);
		//int index=searchItemList(id,name);
		System.out.println("Item found");
		//MenuList.add(ItemList.get(index));
		//db.saveMenu(ItemList.get(index));
		return Oitem;
	}


	
	

}
