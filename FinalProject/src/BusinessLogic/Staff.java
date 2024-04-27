package BusinessLogic;
import BusinessLogic.Schedule;
//import Schedule.Schedule;

public abstract class Staff {
	protected String name,id ,phoneNo, address,username,password;

	//public Schedule s = new Schedule();
	public Staff(String username, String password, String id, String address, String phoneNo, String name) {
		
		this.username = username;
		this.password = password;
		this.id = id;
		this.address = address;
		this.phoneNo = phoneNo;
		this.name = name;

		//this.s=s;	
	}
	public Staff()
	{
		//s=null;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//public abstract void PrintEmpDetails();
	//public abstract void PrintShiftDetails();
	
}
