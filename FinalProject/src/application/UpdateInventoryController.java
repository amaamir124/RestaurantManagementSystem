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
public class UpdateInventoryController
{
	@FXML 
	private Label UpdateIngredientLabel;
	@FXML 
	private Label AddNewIngredientLabel;
	@FXML 
	private Label ViewInventoryLabel;
	@FXML
	private Button UpdateInventoryButton;
	@FXML
	private Button AddToInventoryButton;
	@FXML
	private Button ViewButton;
	@FXML 
	private Label UpdateInventoryLabel;
	@FXML 
	private Button BackButton;
	
	
	public void AddNewIngredientButtononAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("AddNewIngredient.fxml","Add Ingredient");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public void UpdateIngredientButtonOnAction(ActionEvent e)
	{
		/*Main m=new Main();
		try {
			m.changeScene("UpdateIngredient.fxml","Update Ingredient");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
	}
	public void ViewButtonOnAction(ActionEvent e)
	{
		System.out.println("View inventory button clicked");
		Main m=new Main();
		try {
			m.changeScene("ViewInventory.fxml","Inventory");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("View Inventory button problem");
			e1.printStackTrace();
		}
	}
		
	public void BackButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("ManagerController.fxml","Manager Jobs");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}