package application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import java.awt.event.*;
import java.io.IOException;
import javafx.event.ActionEvent;

public class AddNewIngredientController
{
	@FXML
	private Label NewIngredientLabel;
	@FXML 
	private TextField NameTextField;
	@FXML 
	private TextField IdTextField;
	@FXML 
	private TextField QuantityTextField;
	
	@FXML 
	private Button 	AddButton;
	
	@FXML 
	private Button 	BackButton;
	
	public void AddButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		String Ingredientid = IdTextField.getText();
		String IngredientName = NameTextField.getText();
		
		String text = QuantityTextField.getText();
		int quantity = Integer.parseInt(text);
	
		
				
    	if(Ingredientid.isEmpty() ||IngredientName.isEmpty())

    	{
    		//System.out.println("Enter all data in fields added");
    		NewIngredientLabel.setText("Enter Data in all fields");
    	}
    	else
    	{
    		m.getBlController3().AddIngredient(Ingredientid, IngredientName, quantity);
    		//ADD SAVING TO DB CODE HERE I GUESS
    		
    		try {
    			m.changeScene("UpdateInventory.fxml","Update Inventory");
    		} catch (IOException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}

    	}
		
	}
	
	public void BackButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("UpdateMenu.fxml","Update Menu");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	
	
}
