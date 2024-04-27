package application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.*;
import javafx.scene.Node;
import java.awt.event.*;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.stage.Stage;
public class LoginController
{
	@FXML
	private Label LoginInLabel;
	
	@FXML 
	private TextField UsernameTextField;
	
	@FXML 
	private TextField PasswordTextField;
	@FXML 
    private RadioButton EmployeeRadioButton, ManagerRadioButton;
	
	public int StaffRadioBttnAction(ActionEvent e)
	{
		int staffType = 0;
		if(ManagerRadioButton.isSelected())
		{
		    staffType = 1;	
		}
		else if(EmployeeRadioButton.isSelected())
		{
		    staffType = 2;	
		}
		return staffType;
	}
	public void LoginButtonOnAction(ActionEvent e)
	{   
		
		Main m=new Main();
		boolean validate = false;
		String username = UsernameTextField.getText();
		String password = PasswordTextField.getText();

        
		validate = m.getBlController().ValidateLogin(StaffRadioBttnAction(e),username, password);
		if(validate == true)
		{
			
			LoginInLabel.setText("Logging In!");
			if(ManagerRadioButton.isSelected())
			{
			try {
				m.changeScene("ManagerController.fxml","ManagerJobs");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
			else if(EmployeeRadioButton.isSelected())
			{
			try {
				//System.out.println("Employee radio button clicked");
				m.changeScene("EmployeeController.fxml","EmployeeJobs");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		
			
			
		}
		
		else
		{
			LoginInLabel.setText("Invalid details!");
		}
		
	}

	@FXML 
	private javafx.scene.control.Button closeButton;
	public void closeButtonOnAction(ActionEvent e)
	{
		Stage stage = (Stage) closeButton.getScene().getWindow();
		stage.close();
	}
	

	
}
