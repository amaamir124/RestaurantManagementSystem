package BusinessLogic;
import java.util.ArrayList;
import java.util.Scanner;
import BusinessLogic.Item;
import Database.DbHandler;

public class Menu {
	
	public ArrayList <Item> ItemList = new ArrayList<Item>(); //array list containing all existing items
	public ArrayList <Item> MenuList = new ArrayList<Item>(); //array list containing all items that are included on menu
	

	 public void EndItem(ArrayList<Item> Item){
		 
		 //saving items from db into ItemList array
		 System.out.println("In end item");
		 ItemList= Item;
		 for(int i = 0 ; i < ItemList.size() ; i++)
		 {
			 Item current = new Item();
			 current = ItemList.get(i);
			 System.out.println("ItemName " + current.getName() );
			 System.out.println("Item id " + current.getId() );
			 System.out.println("Item price " + current.getPrice() );
			 
		 }
		 return;
		 
	 }
	 
	 public void EndupdateMenu(ArrayList<Item> MenuItem,ArrayList<Item> ItemListItems)
	 {
		 System.out.println("In end update menu in Menu");
		 MenuList = MenuItem;
		 ItemList= ItemListItems;
		 for(int i = 0 ; i < ItemList.size() ; i++)
		 {
			 Item current = new Item();
			 current = ItemList.get(i);
			 System.out.println("ItemName " + current.getName() );
			 System.out.println("Item id " + current.getId() );
			 System.out.println("Item price " + current.getPrice() );
			 
		 }
		 return;
	 }
	 
	public Item CreateNewItem(String id,String itemName,double price) {
			Item i = new Item(id,itemName,price);
			return i;
			
		}
	//search all of item list
	 public Item searchItemList(String id, String name,ArrayList<Item> Item)
	 {	
		 System.out.println("In search item list func in menu");
		 ItemList= Item;
		 for(int i = 0 ; i < ItemList.size() ; i++)
		 {
			 Item current = new Item();
			 current = ItemList.get(i);
			 System.out.println("ItemName " + current.getName() );
			 System.out.println("Item id " + current.getId() );
			 System.out.println("Item price " + current.getPrice() );
			 
		 }
		 int ind=-1;
		 for(int i=0; i<ItemList.size(); i++)
		 {    
			 System.out.println("In search item list - for loop ");
			 if(ItemList.get(i).getName().contentEquals(name) || ItemList.get(i).getName().contentEquals(id))
			 {
                System.out.println("Item name to find == " + name );
				 System.out.println("In search item list - item found ");
				 ind=i;
				 break;
			 }
			 else
			 {
				 System.out.println("Item not found");
			 }
		 }
		 System.out.println(ItemList.get(ind).getId());
		 return ItemList.get(ind);
	 }
	 public Item AddItem(String id, String name,ArrayList<Item> i)
	{	
		 System.out.println("In add item in menu");
		EndItem(i);
		 System.out.println("returned to Add item class in menu");
		Item item = searchItemList(id,name,i);
		//int index=searchItemList(id,name);
		System.out.println("Item found");
		//MenuList.add(ItemList.get(index));
		//db.saveMenu(ItemList.get(index));
		return item;
		
	}
	 
	public void removeItem(String id, String name)
	{
		int index= searchMenuList(id,name);
		MenuList.remove(index);
	}
	 
	 //search list of items included in menu
	 public int searchMenuList(String id, String name)
	 {	
		 int ind=-1;
		 for(int i=0; i<MenuList.size(); i++)
		 {    
			
			 if(MenuList.get(i).name==name || MenuList.get(i).id==id)
			 {
				 ind=i;
				 break;
			 }
		 }
		 return ind;
	 }
	 

	
	

}
