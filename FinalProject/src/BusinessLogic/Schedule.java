package BusinessLogic;
public class Schedule {
	
	public Schedule(String date, String time, String id) {
	    
		this.date = date;
		this.time = time;
		this.id = id;
	}
	public Schedule() {
		// TODO Auto-generated constructor stub
	}
	String date,time,id;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}




}
