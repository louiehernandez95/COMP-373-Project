package Facility;
import java.util.ArrayList;

public class Floors {
	private String id;
	private int personCapacity, numberRooms;
	private double length, width, height;
	private ArrayList<Facility> numberFacility;
	
public Floors (){
	id = null;
    int personCapacity = 10;
	int numRooms = 1;
	double length = width = height = 100;
	numberFacility = new ArrayList<Facility>(10);

}
public Floors(String id, int personCapacity, int numberOfRooms, double length, double width, double height, int numberFacility) {
	this.id = id;
	this.personCapacity = personCapacity;
	this.numberRooms = numberOfRooms;
	this.length = length;
	this.width = width;
	this.height = height;
	this.numberFacility = new ArrayList<Facility> (numberFacility);
}

public int getPersonCapacity (){
	return personCapacity;
}

public void setPersonCapacity (int capacity){
	this.personCapacity = capacity;
}

public String getID () {
	return id;
}

public void setID(String id) {
	this.id=id;
}

public int getRooms () {
	return numberRooms;
}
public int getNumRooms() {
	return numberRooms;
}
public void setNumRooms(int numRooms) {
	this.numberRooms = numRooms;
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
public ArrayList<Facility> getNumFacility() {
	return numberFacility;
}
public void setNumFacility(int numFacility) {
	this.numberFacility = new ArrayList<Facility> (numFacility);
}

}
