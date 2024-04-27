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

public class GenerateOrderController
{
	@FXML 
	private TextField ItemIdTextField;
	@FXML 
	private TextField QuantityTextField;
	@FXML 
	private Button 	AddButton;
	@FXML
	private TextField OrderIdTextField;
	@FXML 
	private Button 	BackButton;
	
	public void AddButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		String Itemid = ItemIdTextField.getText();
		String Quantity = QuantityTextField.getText();
		String OrderId = OrderIdTextField.getText();
				
    	if(Itemid.isEmpty() || Quantity.isEmpty()|| OrderId.isEmpty())

    	{
    		System.out.println("Enter all data in fields added");
    		//NewEmpLabel.setText("Enter Data in all fields");
    	}
    	else
    	{
    		//code that creates/recieves an empty arraylist of orderitems and then adds orderitem to it every
    		//time the user presses add button//
    		//keep adding to arraylist and then when complete button is pressed,insert array to db
    		m.getBlController2().enterItem(OrderId, Itemid, Itemid);
    		
    	}
		
	}
	
	public void BackButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("EmployeeController.fxml","Employee Jobs");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void CompleteButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("EmployeeController.fxml","EmployeeController");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	
	
}
	
}