package BusinessLogic;

public class Ingredient 
{
    String IngredientId, IngredientName;
    int IngredeintQuantity;
    
	public Ingredient(String ingredientId, String ingredientName, int ingredeintQuantity) {

		this.IngredientId = ingredientId;
		this.IngredientName = ingredientName;
		this.IngredeintQuantity = ingredeintQuantity;
	}
	public Ingredient()
	{
		
	}
	
	public String getIngredientId() {
		return IngredientId;
	}
	public void setIngredientId(String ingredientId) {
		this.IngredientId = ingredientId;
	}
	public String getIngredientName() {
		return IngredientName;
	}
	public void setIngredientName(String ingredientName) {
		this.IngredientName = ingredientName;
	}
	public int getIngredeintQuantity() {
		return IngredeintQuantity;
	}
	public void setIngredeintQuantity(int ingredeintQuantity) {
		this.IngredeintQuantity = ingredeintQuantity;
	}
}
