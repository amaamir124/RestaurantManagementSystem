package application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import java.awt.event.*;
import java.io.IOException;

import BusinessLogic.Reservation;
import javafx.event.ActionEvent;
public class SchReservationController
{
	@FXML 
	private TextField DateTextField;
	@FXML 
	private TextField IdTextField;
	@FXML 
	private TextField TimeTextField;
	@FXML 
	private TextField CustNameTextField;
	@FXML 
	private TextField CustPhonenoTextField;
	@FXML 
	private TextField CustIdTextField;
	@FXML
	private Button Createbttn;
	@FXML 
	private Label NewReservationLabel;
	@FXML 
	private Button BackButton;
	public void CreateButtononAction(ActionEvent e)
	{
		Main m=new Main();
		String Custname = CustNameTextField.getText();
		String id = IdTextField.getText();
		String phoneno = CustPhonenoTextField.getText();
		String custId = CustIdTextField.getText();
		String date = DateTextField.getText();
		String time = TimeTextField.getText();
    	if(Custname.isEmpty() || id.isEmpty()||phoneno.isEmpty() || custId.isEmpty() || date.isEmpty() || time.isEmpty())

    	{
    		NewReservationLabel.setText("Enter Data in all fields");
    	}
    	else
    	{
    		
    		m.getBlController().EnterReservationDetails(date, id, time, Custname, phoneno, custId);
    		NewReservationLabel.setText("New Reservation added");
    	}
		
	}
	public void BackButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("EmployeeController.fxml","EmployeeJobs");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}