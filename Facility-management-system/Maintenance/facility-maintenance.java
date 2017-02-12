import java.util.Date;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.sql.*;

public class FacilityMaintenance {

    private String Id;
    private String Type;
    private double Cost;
    private ArrayList<Facility1> facilities = new ArrayList<Facility1> ();

    public Maintainance(){
        this.Id = null;
        this.Type = null;
        this.Cost = 0.0;
    }

    public Maintainance(String id, String type, double cost){
        this.Id = id;
        this.Type = type;
        this.Cost = cost;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setCost(double cost){
        Cost = cost;
    }

    public double getCost(){
        return Cost;
    }

    //Used All These Methods - ADIL A

    //public Date makeFacilityMaintRequest(Facility facility){

    }
    //public Date scheduleMaintenance(Facility facility){

    }
   // public Float calcMaintenanceCostForFacility(Facility facility){

    }
    //public Float calcProblemRateForFacility(Facility facility){

    }
    //public Float calcDowntimeForFacility(Facility facility){

    }
    //public Date[] listMaintRequests(Facility facility){

    }
   // public Date[] listMaintenance(Facility facility){

    }
    //public String[] listFacilityProblems(Facility facility){

    }
}