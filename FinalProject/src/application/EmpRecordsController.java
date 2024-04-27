package application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.awt.event.*;
import java.io.IOException;

import javafx.event.ActionEvent;
import java.util.ArrayList;

import BusinessLogic.Employee;

public class EmpRecordsController {

	@FXML
	private Button viewButton;

	@FXML
	private TableColumn<Employee, String> NameCol;

	@FXML
	private Label info;

	@FXML
	private TableColumn<Employee, String> IdCol;
	@FXML
	private TableColumn<Employee, String> AddressCol;

	@FXML
	private TableColumn<Employee, String> PhonenoCol;

	@FXML
	private TableView<Employee> EmployeeTable;

    @FXML 
    private Button backButton;
	@FXML
	public void viewButtonAction(ActionEvent event) {
		Main m = new Main();
		System.out.println("Employee Records View table called by StaffRegister");
		ArrayList<Employee> e = m.getBlController().EndEmployee();

		if (e.isEmpty()) {
			info.setText("No employees registered");
		}

		else {
			final ObservableList<Employee> data = FXCollections.observableArrayList(e);
			System.out.println("Observable list");
			NameCol.setCellValueFactory(new PropertyValueFactory<Employee, String>("Name"));
			IdCol.setCellValueFactory(new PropertyValueFactory<Employee, String>("Id"));
			PhonenoCol.setCellValueFactory(new PropertyValueFactory<Employee, String>("PhoneNo"));
			AddressCol.setCellValueFactory(new PropertyValueFactory<Employee, String>("Address"));
			EmployeeTable.setItems(data);
		}

	}
	
	public void backButtonOnAction(ActionEvent e)
	{
		System.out.println("Back button clicked");
		Main m=new Main();
		try {
			m.changeScene("ManagerController.fxml","ManagerJobs");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
	

