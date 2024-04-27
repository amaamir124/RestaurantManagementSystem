package Database;
import java.sql.*;
import java.util.ArrayList;
import BusinessLogic.*;
import BusinessLogic.Employee;
import BusinessLogic.Manager;

public class DbHandler {

	private String username = "root";
	private String password = "1234";
	Connection con; // connection object

	public DbHandler() { // default constructor

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restauraunt", username, password);
			System.out.println("Connected to Db");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection failed!");
			e.printStackTrace();
		}

	}
	public String queryType(int staffType)
	{
		String query = "";
		if(staffType == 1)
		{
			query = "SELECT * from ManagerInfo";
		}
		else if(staffType == 2)
		{
			query = "SELECT * from EmployeeInfo";
		}
		return query;
	}
	//Manager validate log in  + include a variable to differentiate between employee and manager
	public boolean ValidateLogin(int staffType, String username,String password)
	{
		Statement stm;
		String query = queryType(staffType);
		try
		{
			stm = con.createStatement();
			ResultSet rs =stm.executeQuery(query);
			while(rs.next())
			{
				if(staffType == 1 && (username.equals(rs.getString(1)) && password.equals(rs.getString(2))))
				{
					return true;
				}
				else if(staffType == 2 &&(username.equals(rs.getString(5))  && password.equals(rs.getString(6))))
				{
					return true;
				}
				
			}
		} catch(SQLException e)
		{
			//e.printStackTrace();
			return false;
		}
		return false;
	}
	public void saveEmpSchedule(Schedule S) {
		try {
			System.out.println("In save emp schedule ");
			String query = "INSERT INTO Schedule (scheduledate,scheduletime,id_) VALUES (?,?,?);";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, S.getDate());
			//System.out.println(S.getDate());
			stmt.setString(2, S.getTime());
			//System.out.println(S.getTime());
			stmt.setString(3, S.getId());
			//System.out.println(S.getId());


			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("An employee schedule was added...");
			}
		} catch (Exception exc) {
			System.out.println("error in emp schedule");
			System.out.println(exc);
		}
	}
	public void saveEmployee(Employee e) {
		try {
			String query = "INSERT INTO EmployeeInfo (name_,id_,phoneno,address,username_,password_) VALUES (?,?,?,?,?,?);";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, e.getName());
			stmt.setString(2, e.getId());
			stmt.setString(3, e.getPhoneNo());
			stmt.setString(4, e.getAddress());
			stmt.setString(5, e.getUsername());
			stmt.setString(6, e.getPassword());

			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("An employee was added...");
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	public void saveOrder(OrderItem o) {
		try {
			String query = "INSERT INTO Order_ (Orderid_,OrderItemId_,itemQuantity) VALUES (?,?,?);";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, o.getId());
			stmt.setString(2,o.getItemId() );
			stmt.setInt(3, o.getQuantity());


			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("An Order was added...");
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	public void saveIngredient(Ingredient I) {
		try {
			String query = "INSERT INTO Ingredients (itemid_,itemName_,itemQuantity) VALUES (?,?,?);";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, I.getIngredientId());
			stmt.setString(2, I.getIngredientName());
			stmt.setInt(3, I.getIngredeintQuantity());


			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("An ingredient was added...");
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	public void saveMenu(Item i) {
		try {
			System.out.println("Inserting item into menu in db handler saveMenu");
			String query = "INSERT INTO Menu (id_,itemName,price) VALUES (?,?,?);";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, i.getId());
			stmt.setString(2, i.getName());
			stmt.setDouble(3, i.getPrice());

			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("An item was added in Menu...");
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public void saveItem(Item i) {
		try {
			String query = "INSERT INTO Item (id_,itemName,price) VALUES (?,?,?);";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, i.getId());
			stmt.setString(2, i.getName());
			stmt.setDouble(3, i.getPrice());

			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("An item was added...");
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	public void saveReservation(Reservation R) {
		try {
			String query = "INSERT INTO Reservation (date_,id_,time_,custname,custphoneno,custid_) VALUES (?,?,?,?,?,?);";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, R.getDate());
			stmt.setString(2, R.getResId());
			stmt.setString(3, R.getTime());
			stmt.setString(4, R.C.getName());
			stmt.setString(5, R.C.getPhoneNo());
			stmt.setString(6, R.getCustomerId());

			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("A reservation was added...");
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	//read from employee table function 
	public ArrayList<Employee> readEmployee() {

		ArrayList<Employee> employee = new ArrayList<Employee>();
		Statement stm;
		try {
			stm = con.createStatement();

			String query = "SELECT * from EmployeeInfo";
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				Employee e = new Employee(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
				employee.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}
	//read from employee table function 
	public ArrayList<OrderItem> readOrder() {

		ArrayList<OrderItem> OrderItems = new ArrayList<OrderItem>();
		Statement stm;
		try {
			stm = con.createStatement();

			String query = "select * from Order_;";
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				OrderItem i = new OrderItem(rs.getString(1), rs.getString(2), rs.getInt(3));
				OrderItems.add(i);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return OrderItems;
	}
	//read from Menu table function  - needed for tableeee 
	public ArrayList<Item> readMenuItems()
	{

		ArrayList<Item> MenuItemList = new ArrayList<Item>();
		Statement stm;
		try {
			stm = con.createStatement();

			String query = "select * from Menu;";
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				Item i = new Item(rs.getString(1), rs.getString(2));
				MenuItemList.add(i);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return MenuItemList;
	}
	public ArrayList<Ingredient> readInventory()
	{

		ArrayList<Ingredient> IngredientList = new ArrayList<Ingredient>();
		Statement stm;
		try {
			stm = con.createStatement();

			String query = "select * from Ingredients;";
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				Ingredient i = new Ingredient(rs.getString(1), rs.getString(2),rs.getInt(3));
				IngredientList.add(i);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return IngredientList;
	}
	//read from Item table function 
	public ArrayList<Item> readItems()
	{

		ArrayList<Item> ItemList = new ArrayList<Item>();
		Statement stm;
		try {
			stm = con.createStatement();

			String query = "SELECT * from Item";
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				Item i = new Item(rs.getString(1), rs.getString(2),rs.getDouble(3));
				ItemList.add(i);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ItemList;
	}
	//read from schedule table
	public ArrayList<Schedule> readSchedule() {

		ArrayList<Schedule> Schedule = new ArrayList<Schedule>();
		Statement stm;
		try {
			stm = con.createStatement();

			String query = "Select * from Schedule";
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				Schedule S = new Schedule(rs.getString(1), rs.getString(2), rs.getString(3));
				Schedule.add(S);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Schedule;
	}
	//read from Reservation table function 
		public ArrayList<Reservation> readReservation() {

			ArrayList<Reservation> Reservation = new ArrayList<Reservation>();
			Statement stm;
			try {
				stm = con.createStatement();

				String query = "SELECT * from Reservation";
				ResultSet rs = stm.executeQuery(query);
				while (rs.next()) {
					Reservation r = new Reservation(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
					Reservation.add(r);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return Reservation;
		}

	
	public void closeConnection() {
		try {

			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
