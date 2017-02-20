package Facility;

public class Inspection {
	
	private String id;
	private String time;
	private String type;
	
	public Inspection() {
		id = null;
		time = null;
		type = null;
	}

	public Inspection(String id, String time, String type) {
		this.id = id;
		this.time = time;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSummary() {
		return type;
	}

	public String toString() {
		return type + " " + this.time;
	}

}
