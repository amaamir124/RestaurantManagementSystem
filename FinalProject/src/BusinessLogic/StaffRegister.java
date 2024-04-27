package BusinessLogic;
import Database.DbHandler;
import java.util.ArrayList;
//Controller class for Manager and Employee funcs 
public class StaffRegister {
    
	//DB handler object
	private DbHandler db;

	//Staff Register constructor
	public StaffRegister() 
	{
		db = new DbHandler();
	}
	
    //Employee class ArrayList
	ArrayList<Employee> e = new ArrayList<Employee>();
	//Reservation Class Array List
	ArrayList<Reservation> R = new ArrayList<Reservation>();
	//Employee
	public void EnterEmployeeDetails(String name,String id,String phoneno,String address,String username,String password) {
		Employee e = new Employee(name, id, phoneno,address,username,password);
		db.saveEmployee(e);
	}
	public void EnterEmployeeSchedule(String date,String time,String id) {
		Schedule s = new Schedule(date,time, id);
		db.saveEmpSchedule(s);
	}
	
	//Reservation
	public void EnterReservationDetails(String date,String Resid,String time,String custName,String phoneno,String custId) {
		Reservation r = new Reservation(date,Resid,time,custName,phoneno,custId);
		db.saveReservation(r);
	}
	public ArrayList<Schedule> EndSchedule()
	{
		return db.readSchedule();
	}
	 public ArrayList<Reservation> EndReservation() {
			
		// ArrayList<Reservation> R = new ArrayList<Reservation>();
		 R = db.readReservation();
		//System.out.println("In end employee");
		//In array list employee is read from db
		//e = db.readEmployee();
		//printing array list content
		for (int i=0; i<R.size(); i++) {
			  // Assuming arr is an ArrayList object
			  Reservation current = R.get(i);
			  System.out.println(current.getResId());
			  System.out.println(current.getCustomerId());
			  System.out.println(current.getDate());
			  System.out.println(current.getTime());
			}
		return db.readReservation();
	 }
    //Validating Employee and Manager log in
	public boolean ValidateLogin(int StaffType,String username,String password)
	{
		boolean validation = db.ValidateLogin(StaffType,username, password);
		return validation;
	}
	
	//Show employee records 
	 public ArrayList<Employee> EndEmployee() {
		
		 ArrayList<Employee> e = new ArrayList<Employee>();
		 e = db.readEmployee();
		//System.out.println("In end employee");
		//In array list employee is read from db
		//e = db.readEmployee();
		//printing array list content
		/*for (int i=0; i<e.size(); i++) {
			  // Assuming arr is an ArrayList object
			  Employee current = e.get(i);
			  System.out.println(current.getName());
			  System.out.println(current.getUsername());
			  System.out.println(current.getId());
			}*/
		return db.readEmployee();
	 }
	 


}


