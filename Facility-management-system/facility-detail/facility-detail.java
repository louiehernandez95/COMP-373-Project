package facility-detail;

import java.util.ArrayList;

import Maintenance.facility-maintenance;
import Usage Detail;

public class facility-detail implements facility_interface{
    private String id = null;
    //facility type: any type of facility, could have made it an entity but all of the subclasses won't be doing much
    //so made a general entity
    private String facilityType = null;
    private String dimensions = null;
    private Address address;
    private int capacity;
    private String detail = null;
    private ArrayList<Floors> numFloors;
    private ArrayList<Unit> Units;
    public ArrayList<Inspection> inspections = new ArrayList<Inspection>();
    public ArrayList<Maintenance> maintenances = new ArrayList<Maintenance>();
    private double usage;

    public Facility(){
        //if no arguements passed set them as default
        this.dimensions = "1000 * 1000";
        this.address = null;
        this.capacity = 10;
        this.facilityType = "general";
        numFloors = new ArrayList<Floors>(10);
        Units = new ArrayList<Unit>(10);
    }

    public Facility(String id, String type, String Dim, int Capacity, Address address){
        this.setId(id);
        this.facilityType = type;
        this.dimensions = Dim;
        this.address = address;
        this.capacity = Capacity;
        inspections = new ArrayList<Inspection>();
    }

    public void listUnits() {
        for (Unit u : Units){
            System.out.println(u.getId());
        }
    }

    public String getFacilityInfo() {
        return this.getId() + " " + this.facilityType + " " + this.address;
    }


    public int getAvailableCapacity() {
        return capacity;
    }

    public boolean addNewUnit(Unit unit) {
        if (!this.Units.contains(unit.getId())){
            this.Units.add(unit);
            return true;
        }
        else return false;
    }

    public void addFacilityDetail(String s) {
        this.detail = s;
    }

    public boolean removeUnit(Unit unit) {
        if (!this.Units.contains(unit)){
            this.Units.remove(unit);
            return true;
        }
        else return false;
    }

    public void setUsage(double use){
        usage += use;
    }

    public double getUsage(){
        return usage;
    }

    public ArrayList<Inspection> getInspections(){
        return inspections;
    }

    public void addInspection(Inspection inspection) {
        inspections.add(inspection);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the facilityType
     */
    public String getFacilityType() {
        return facilityType;
    }

    /**
     * @param facilityType the facilityType to set
     */
    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    /**
      returns the dimensions
     */
    public String getDimensions() {
        return dimensions;
    }

    /**
      the dimensions to set
     */
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
/**
 returns the address
     */
    public Address getAddress() {
        return address;
    }

     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
      capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     returns the detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     the detail to set
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }



}