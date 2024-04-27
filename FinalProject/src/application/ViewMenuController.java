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
import BusinessLogic.Item;

public class ViewMenuController {
	@FXML
	private Button backButton;
	@FXML
	private Button viewButton;

	@FXML
	private TableColumn<Item, String> ItemIdCol;


	@FXML
	private TableColumn<Item, String> ItemNameCol;
	@FXML
	private TableColumn<Item, String> PriceCol;
	@FXML
	private TableView<Item> MenuTable;


	@FXML
	public void ViewButtonAction(ActionEvent event) {
		System.out.println("in  view Menu");
		Main m = new Main();
		System.out.println("View Menu called");
		ArrayList<Item> ItemList = m.getBlController2().EndUpdateMenu();
		/* for(int i = 0 ; i < ItemList.size() ; i++)
		 {
			 Item current = new Item();
			 current = ItemList.get(i);
			 System.out.println("ItemName " + current.getName() );
			 System.out.println("Item id " + current.getId() );
			 System.out.println("Item price " + current.getPrice() );
			 
		 }*/

		if (ItemList.isEmpty()) {
			//info.setText("Menu is empty");
		}

		else {
			final ObservableList<Item> data = FXCollections.observableArrayList(ItemList);
			System.out.println("Observable list");
			ItemIdCol.setCellValueFactory(new PropertyValueFactory<Item, String>("Name"));
			ItemNameCol.setCellValueFactory(new PropertyValueFactory<Item, String>("Id"));
			PriceCol.setCellValueFactory(new PropertyValueFactory<Item, String>("Price"));
			MenuTable.setItems(data);
		}

	}
	
	public void BackButtonOnAction(ActionEvent event)
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
