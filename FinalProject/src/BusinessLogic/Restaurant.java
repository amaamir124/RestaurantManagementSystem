package BusinessLogic;
import java.util.ArrayList;

import BusinessLogic.Menu;
//Controller class for MenU
import Database.DbHandler;

public class Restaurant 
{
     Menu M = new Menu();
     //Db handler object 
      private DbHandler db;
 	//Restaurant class Constructor
      public Restaurant() 
      {
     	 db = new DbHandler(); 
      }
     public void UpdateMenu(String id,String name,double price)
     {
    	 Item i = new Item();
    	 i = M.CreateNewItem(id, name, price);
    	 db.saveItem(i);
     }

     public void AddItem(String id, String name)
     {
    	 System.out.println("Restuarant class where add item of Menu is called");
    	 Item i =  M.AddItem(id,name,db.readItems());
    	 db.saveMenu(i);
     }
     
     public ArrayList<Item> EndUpdateMenu()
     {
    	 System.out.println("In end update menu in Restaurant");
    	 M.EndupdateMenu(db.readMenuItems(),db.readItems());
    	 return db.readMenuItems();
     }
     
     Order O = new Order();
     public void enterItem(String orderId,String ItemId,String ItemItem)
     {
    	 OrderItem o = O.AddOrderItem(orderId, ItemId, ItemItem, db.readOrder());
    	 db.saveOrder(o);
     }
     public ArrayList<OrderItem> EndOrderItem()
     {
    	 System.out.println("In end order item in Restaurant");
    	 O.EndOrderItem(db.readOrder());
    	 return db.readOrder();
     }
     
     
}
