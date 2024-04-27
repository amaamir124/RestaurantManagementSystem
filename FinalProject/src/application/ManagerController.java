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
public class ManagerController
{
	@FXML 
	private Label AddNewEmployee;
	@FXML 
	private Label EmployeeShiftDetails;
	@FXML 
	private Label EmployeeRecords;
	@FXML 
	private Label GenerateDailyReport;
	@FXML 
	private Label GenerateMonthlyReport;
	@FXML 
	private Label UpdateMenu;
	@FXML
	private Button AddNewEmployeeButton;
	@FXML
	private Button AddEmployeeShiftDetailButton;
	@FXML
	private Button ShowButton;
	@FXML
	private Button GenerateDailyReportButton;
	@FXML
	private Button GenerateMonthlyReportButton;
	@FXML
	private Button UpdateMenuButton;
	@FXML 
	private Label WelcomeManager;
	@FXML 
	private Button BackButton;
	@FXML
	private Button UpdateInventoryButton;
	
	public void AddNewEmployeeButtononAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("NewEmployeeController.fxml","AddNewEmployee");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}	
	public void AddEmployeeShiftDetailOnAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("EmpSchedule.fxml","EmployeeShiftDetails");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void ShowButtonOnAction(ActionEvent e)
	{
		System.out.println("Employee Records button clicked");
		Main m=new Main();
		try {
			m.changeScene("EmpRecord.fxml","EmpRecordDetails");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("Employee Records button problem");
			e1.printStackTrace();
		}
	}
	
	
	
	public void GenerateMonthlyReportButtonOnAction(ActionEvent e)
	{
	
	}
	
	public void GenerateDailyReportButtonOnAction(ActionEvent e)
	{
		
	}
	
	public void UpdateMenuButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("UpdateMenu.fxml","Update Menu");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void UpdateInventoryButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("UpdateInventory.fxml","Update Inventory");
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
}