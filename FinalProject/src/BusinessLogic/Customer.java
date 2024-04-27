package BusinessLogic;

public class Customer {
	String name, phoneNo,id;
    
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Customer(String name, String phoneNo, String id) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.id = id;
	}
	public Customer()
	{
		
	}
}
