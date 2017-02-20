package Facility;
import java.util.ArrayList;

public class Floors {
	private String id;
	private int personCapacity, numRooms;
	private double length, width, height;
	private ArrayList<Facility> numFacility;
	
public Floors (){
	id = null;
    int personCapacity = 10;
	int numRooms = 1;
	double length = width = height = 100;
	numFacility = new ArrayList<Facility>(10);

}
public Floors(String id, int pCapacity, int nRooms, double l, double w, double h, int nFacility) {
	this.id = id;
	this.personCapacity = pCapacity;
	this.numRooms = nRooms;
	this.length = l;
	this.width = w;
	this.height = h;
	this.numFacility = new ArrayList<Facility> (nFacility);
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
	return numRooms;
}
public int getNumRooms() {
	return numRooms;
}
public void setNumRooms(int numRooms) {
	this.numRooms = numRooms;
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
	return numFacility;
}
public void setNumFacility(int numFacility) {
	this.numFacility = new ArrayList<Facility> (numFacility);
}

}
