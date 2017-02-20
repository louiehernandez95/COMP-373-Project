package Facility;

public class Unit {

	private String Id;
	private double length, width, height;
	private String Type;

	public Unit(){
		Id = null;
		length = 0.0;
		width = 0.0;
		height = 0.0;
		Type = null;
	}

	public Unit(String id, double length, double width, double height, String type) {
		Id = id;
		this.length = length;
		this.width = width;
		this.height = height;
		this.Type = type;
	}

	public String getType() {
		return Type;
	}
	
	public void setType(String type) {
		Type = type;
	}
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	
	public String toString(){
		return this.Id + " " + this.Type;
	}
	
}
