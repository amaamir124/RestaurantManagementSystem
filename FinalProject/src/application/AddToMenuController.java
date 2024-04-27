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

public class AddToMenuController
{
	@FXML 
	private TextField ItemIdTextField;
	@FXML 
	private TextField ItemNameTextField;
	@FXML 
	private Button 	AddButton;
	
	@FXML 
	private Button 	BackButton;
	
	public void AddButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		String Itemid = ItemIdTextField.getText();
		String ItemName = ItemNameTextField.getText();
	
				
    	if(Itemid.isEmpty() || ItemName.isEmpty())

    	{
    		//System.out.println("Enter all data in fields added");
    		//NewEmpLabel.setText("Enter Data in all fields");
    	}
    	else
    	{
    		System.out.println("Add to menu controller class");
    		m.getBlController2().AddItem(Itemid, ItemName);
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
