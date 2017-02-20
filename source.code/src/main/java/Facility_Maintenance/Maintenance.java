package Facility_Maintenance;
import Facility.Facility_Interface;
import java.util.ArrayList;

public class Maintenance {
    private String Id;
    private String Type;
    private double Cost;
    private ArrayList<Facility_Interface> facilities = new ArrayList<Facility_Interface>();

    public Maintenance(){
        this.Id = null;
        this.Type = null;
        this.Cost = 0.0;
    }

    public Maintenance(String id, String type, double cost){
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

}
