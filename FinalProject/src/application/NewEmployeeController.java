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
public class NewEmployeeController
{
	@FXML 
	private TextField NameTextField;
	@FXML 
	private TextField IdTextField;
	@FXML 
	private TextField PhonenoTextField;
	@FXML 
	private TextField AddressTextField;
	@FXML 
	private TextField UsernameTextField;
	@FXML 
	private TextField PasswordTextField;
	@FXML
	private Button Createbttn;
	@FXML 
	private Label NewEmpLabel;
	@FXML 
	private Button BackButton;
	public void CreateButtononAction(ActionEvent e)
	{
		Main m=new Main();
		String name = NameTextField.getText();
		String id = IdTextField.getText();
		String phoneno = PhonenoTextField.getText();
		String address = AddressTextField.getText();
		String username = UsernameTextField.getText();
		String password = PasswordTextField.getText();
    	if(name.isEmpty() || id.isEmpty()||phoneno.isEmpty() || address.isEmpty() || username.isEmpty() || password.isEmpty())

    	{
    		NewEmpLabel.setText("Enter Data in all fields");
    	}
    	else
    	{
    		
    		m.getBlController().EnterEmployeeDetails(name, id, phoneno, address, username, password);
    		NewEmpLabel.setText("New Employee added");
    	}
		
	}
	public void BackButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("ManagerController.fxml","ManagerJobs");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}