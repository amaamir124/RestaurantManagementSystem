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
public class EmployeeController
{
	@FXML 
	private Label GenerateOrder;
	@FXML 
	private Label GeneratePayment;
	@FXML 
	private Label ScheduleReservation;
	@FXML
	private Button GenerateOrderButton;
	@FXML
	private Button ScheduleReservationButton;
	@FXML
	private Button GeneratePaymentButton;
	@FXML 
	private Label WelcomeEmployee;
	@FXML 
	private Button BackButton;
	
	public void GenerateOrderButtonOnAction(ActionEvent e)
	{
		
	}
	
	
	public void GeneratePaymentButtonOnAction(ActionEvent e)
	{

	}
	public void ScheduleReservationButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("SchReservation.fxml","EnterReservation");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	
	public void BackButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("LoginController.fxml","Login");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	

	public void ShowButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("ShowAllReservations.fxml","Reservations");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
}
	
}