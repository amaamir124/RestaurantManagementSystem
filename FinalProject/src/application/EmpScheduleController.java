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

public class EmpScheduleController
{
	@FXML 
	private TextField IdTextField;
	@FXML 
	private TextField ShiftTimeTextField;
	@FXML 
	private TextField ShiftDateTextField;
	@FXML
	private Label createLabel;
	@FXML 
	private Button 	InsertButton;
	@FXML 
	private Button BackButton;
	@FXML
	public void BackButtononAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("ManagerController.fxml","ManagerJobs");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void CreateButtononAction(ActionEvent e)
	{
		Main m=new Main();
		String id = IdTextField.getText();
		String time = ShiftTimeTextField.getText();
		String date = ShiftDateTextField.getText();
    	if(id.isEmpty() || time.isEmpty()||date.isEmpty())
    	{
    		createLabel.setText("Enter Data in all fields");
    	}
    	else
    	{
    		m.getBlController().EnterEmployeeSchedule(date, time, id);
    		System.out.println("Schedule added");
    	}
		
	}
	
	
}
