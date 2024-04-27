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

public class CreateNewItemController
{
	@FXML 
	private TextField ItemIdTextField;
	@FXML 
	private TextField ItemNameTextField;
	@FXML 
	private TextField PriceTextField;
	
	@FXML 
	private Button 	AddButton;
	
	@FXML 
	private Button 	BackButton;
	
	public void AddButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		String Itemid = ItemIdTextField.getText();
		String ItemName = ItemNameTextField.getText();
		
		String text= PriceTextField.getText();
		double price = Double.parseDouble(text);
	
		
				
    	if(Itemid.isEmpty() || ItemName.isEmpty())

    	{
    		//System.out.println("Enter all data in fields added");
    		//NewEmpLabel.setText("Enter Data in all fields");
    	}
    	else
    	{
    		m.getBlController2().UpdateMenu(Itemid, ItemName, price);
    		//ADD SAVING TO DB CODE HERE I GUESS
    		
    		try {
    			m.changeScene("UpdateMenu.fxml","Update Menu");
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
