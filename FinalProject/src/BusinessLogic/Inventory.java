package BusinessLogic;

import java.util.ArrayList;

import Database.DbHandler;
//Inventory Controller class for Ingredients 
public class Inventory 
{

	//DB handler object
	private DbHandler db;

	//Staff Register constructor
	public Inventory() 
	{
		db = new DbHandler();
	}
	
	ArrayList<Ingredient> Ingredients = new ArrayList<Ingredient>();
	
    public void AddIngredient(String id, String name,int quantity)
    {
    	Ingredient I = new Ingredient(id,name,quantity);
    	db.saveIngredient(I);
    	
    }
    public ArrayList<Ingredient> endUpdateInventory()
    {
    	Ingredients = db.readInventory();
		 for(int i = 0 ; i < Ingredients.size() ; i++)
		 {
			 Ingredient current = new Ingredient();
			 current = Ingredients.get(i);
			 System.out.println("ItemName " + current.getIngredientName() );
			 System.out.println("Item id " + current.getIngredientId() );
			 System.out.println("Item Quantity " + current.getIngredeintQuantity() );
			 
		 }
    	return db.readInventory();
    }
}
