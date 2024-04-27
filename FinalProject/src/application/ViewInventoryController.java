package application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;

import BusinessLogic.Employee;
import BusinessLogic.Ingredient;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
public class ViewInventoryController
{
	@FXML
	private Button viewButton;

	@FXML
	private TableColumn<Ingredient, String> IdCol;

	/*@FXML
	private TableColumn<Ingredient, String> 
	@FXML
	private TableColumn<Ingredient, String> 
	*/
	@FXML
	private TableView<Ingredient> InventoryTable;

    @FXML 
    private Button BackButton;
	
	

	public void ViewButtonOnAction(ActionEvent e)
	{
		Main m = new Main();
		System.out.println("View Inventory Button clicked");
		ArrayList<Ingredient> I = m.getBlController3().endUpdateInventory();
		 for(int i = 0 ; i < I.size() ; i++)
		 {
			 Ingredient current = new Ingredient();
			 current = I.get(i);
			 System.out.println("ItemName " + current.getIngredientName() );
			 System.out.println("Item id " + current.getIngredientId() );
			 System.out.println("Item Quantity " + current.getIngredeintQuantity() );
			 
		 }
		if (I.isEmpty()) {
			//info.setText("No employees registered");
		}

		else {
			final ObservableList<Ingredient> data = FXCollections.observableArrayList(I);
			
			System.out.println("Observable list");
			System.out.println(data.get(1).getIngredientId());
			IdCol.setCellValueFactory(new PropertyValueFactory<Ingredient, String>("Id"));
			//IngredientNameCol.setCellValueFactory(new PropertyValueFactory<Ingredient, String>("Name"));
			//IngredientQuantityCol.setCellValueFactory(new PropertyValueFactory<Ingredient, String>("Quantity"));
			InventoryTable.setItems(data);
		}

	}
		
	public void BackButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("UpdateInventory.fxml","Update Inventory");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}