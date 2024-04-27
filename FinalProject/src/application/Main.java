package application;
	
import java.io.IOException;
import BusinessLogic.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
//import javafx.scene.layout.BorderPane;
import javafx.fxml.*;


public class Main extends Application {
	private static Stage stg;
	private static StaffRegister SR = new StaffRegister(); //BL controller obj
	private static Restaurant R = new Restaurant(); //2nd BL controller obj
	private static Inventory I = new Inventory(); //3rd BL controller obj
	@Override
	public void start(Stage primaryStage) {
		try {
			stg = primaryStage;
			Parent root = FXMLLoader.load(getClass().getResource("LoginController.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("Login");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public StaffRegister getBlController() {
		return SR;
	}
	
	public Restaurant getBlController2() {
		return R;
	}
	public Inventory getBlController3() {
		return I;
	}
	public void changeScene(String fxml,String Title) throws IOException {
		Parent pane = FXMLLoader.load(getClass().getResource(fxml));
		stg.setTitle(Title);
		stg.getScene().setRoot(pane);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
