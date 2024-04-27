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
public class UpdateMenuController
{
	@FXML 
	private Label CreateNewItem;
	@FXML 
	private Label AddToMenu;
	@FXML 
	private Label ViewMenu;
	@FXML
	private Button CreateNewItemButton;
	@FXML
	private Button AddToMenuButton;
	@FXML
	private Button ViewButton;
	@FXML 
	private Label UpdateMenu;
	@FXML 
	private Button BackButton;
	
	
	public void CreateNewItemButtononAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("CreateNewItem.fxml","Create Item");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	
	public void AddtoMenuButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("AddToMenu.fxml","Add To Menu");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void ViewButtonOnAction(ActionEvent e)
	{
		System.out.println("View Menu button clicked");
		Main m=new Main();
		try {
			m.changeScene("viewMenu.fxml","Menu");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("View menu button problem");
			e1.printStackTrace();
		}
	}
		
	
	public void BackButtonOnAction(ActionEvent e)
	{
		Main m=new Main();
		try {
			m.changeScene("ManagerController.fxml","Manager Jobs");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}