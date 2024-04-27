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
import BusinessLogic.Reservation;

public class ShowAllReservationsController {
	@FXML
	private Button backButton;
	@FXML
	private Button viewButton;

	@FXML
	private TableColumn<Reservation, String> CustIdCol;

	@FXML
	private TableColumn<Reservation, String> ReservationIdCol;

	@FXML
	private TableColumn<Reservation, String> DateCol;
	
	@FXML
	private TableColumn<Reservation, String> TimeCol;
	
	@FXML
	private TableView<Reservation> ReservationTable;





	@FXML
	public void BackButtonOnAction(ActionEvent event) {

		Main m=new Main();
		try {
			m.changeScene("EmployeeController.fxml","EmployeeJobs");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
}
	
	@FXML
	public void ViewButtonOnAction(ActionEvent event) {
		Main m = new Main();
		System.out.println("Reservation Records View table called by StaffRegister");
		ArrayList<Reservation> R = m.getBlController().EndReservation();

		if (R.isEmpty()) {
			//info.setText("No Reservations made");
		}

		else {
			final ObservableList<Reservation> data = FXCollections.observableArrayList(R);
			System.out.println("Observable list");
			//CustIdCol.setCellValueFactory(new PropertyValueFactory<Reservation, String>("Customer Id"));
			//ReservationIdCol.setCellValueFactory(new PropertyValueFactory<Reservation, String>("ReservationId"));
			DateCol.setCellValueFactory(new PropertyValueFactory<Reservation, String>("Date"));
			TimeCol.setCellValueFactory(new PropertyValueFactory<Reservation, String>("Time"));
			ReservationTable.setItems(data);
		}

	
}

}