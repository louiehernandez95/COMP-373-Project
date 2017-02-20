package Facility;

public class Inspection {
	
	private String id;
	private String time;
	private String summary;
	
	public Inspection() {
		id = null;
		time = null;
		summary = null;
	}

	public Inspection(String id, String time, String summary) {
		this.id = id;
		this.time = time;
		this.summary = summary;
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
		return summary;
	}

	public String toString() {
		return summary + " " + this.time;
	}

}
