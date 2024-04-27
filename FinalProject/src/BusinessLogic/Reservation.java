package BusinessLogic;
public class Reservation 
{
	public Customer C = new Customer();
    private String date,Resid,time;
    
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getResId() {
		return Resid;
	}
	public void setResId(String Resid) {
		this.Resid = Resid;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCustomerId()
	{
		return C.getId();
	}
	public Reservation(String date,String Resid,String time,String custName,String phoneno,String custId) 
	{
		this.date = date;
		this.time = time;
		this.Resid = Resid;
		C.setName(custName);
		C.setId(custId);
		C.setPhoneNo(phoneno);
  	}
	public void PrintReservationDetails()
	{
	   	 System.out.println("Customer name : " + C.getName()); 
	   	 System.out.println("Customer phoneno : " + C.getPhoneNo()); 
	   	 System.out.println("Customer id : " + C.getId()); 
	   	 System.out.println("Reservation id : " + this.Resid); 
	   	 System.out.println("Reservation date : " + this.date);
	   	 System.out.println("Reservation time : " + this.time);
	}
	
	
	
}
