package BusinessLogic;
//import Reservation.*;
import BusinessLogic.Schedule;
import java.util.ArrayList;
public class Employee extends Staff
{

	
	public Employee(String name, String id, String phoneno, String address, String username, String password)
	{
		// TODO Auto-generated constructor stub
	    this.username = username;
	    this.password = password;
	    this.id = id;
	    this.address = address;
	    this.phoneNo = phoneno;
	    this.name = name;
	}
	
	/*public Schedule getS() {
		return s;
	}
	public void setS(Schedule s) {
		this.s = s;
	}*/
    
	//ArrayList<Reservation> R = new ArrayList<Reservation>();	
	//@Override
	/*public void PrintEmpDetails() {

	   	 System.out.println("Employee name : " + this.name); 
	   	 System.out.println("Employee phoneno : " + this.phoneNo); 
	   	 System.out.println("Employee address : " + this.address); 
	}	
	

	@Override
	public void PrintShiftDetails() 
	{
		 System.out.println("Employee id : " + this.id);
		 System.out.println("Employee shift date : " + this.s.getDate()); 
		 System.out.println("Employee shift time : " + this.s.getTime()); 	
	}
	public int SearchReservation(int id)
	{
		int ind=-1;
		
		for(int i=0 ; i<=R.size() ;i++ )
		 if(R.get(i).getId()== id)
		 {
			ind=i;
			break;
		 }
		return ind;
	}	
    public void newReservation(int reservationId)
    {
		Reservation newR = new Reservation();
		newR.setId(reservationId);
		R.add(newR);
    }
    public void setReservation(String date,String time,String custname,int custId,int reservationId,String phoneno)
    {
       	int index = SearchReservation(reservationId);
       	R.get(index).setReservation(date, time,custname,custId,phoneno);
    }
    public void PrintReservationDetails(int reservationId)
    {
    	int index = SearchReservation(reservationId);
    	R.get(index).PrintReservationDetails();
    }*/
}
