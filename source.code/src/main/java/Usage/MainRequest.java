package Usage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import Facility.Facility;
import Facility.Facility_Interface;
import Facility_Maintenance.Maintenance;

public class MainRequest implements MaintenanceUsage_Interface{

    private Facility facility;
    private Maintenance maintenance;
    private ArrayList<Facility_Interface> facilities = new ArrayList<Facility_Interface>();
    public HashMap<Maintenance,Facility_Interface> maintenanceRequests = new HashMap<Maintenance,Facility_Interface>(); //request for this maintainance came from this facility
    public HashMap<Facility_Interface, ArrayList<Maintenance>> scheduledMaintenances = new HashMap<Facility_Interface, ArrayList<Maintenance>>(); //this facility needs this maintainance
    private ArrayList <Facility_Interface> temp = new ArrayList<Facility_Interface>();
    public MainRequest(){}

    //interfaces methods begin here
    public void makeFacilityMaintRequest(Maintenance maintainance, Facility_Interface facility) {
        maintenanceRequests.put(maintainance, facility);
    }

    public void listMaintenanceRequest() {
        for (Entry<Maintenance, Facility_Interface> entry : maintenanceRequests.entrySet())
            System.out.println("Maintainance type: " + entry.getKey().getType() + " made by facility" + entry.getValue().getFacilityInfo());
    }

    public void scheduleMaintenance(Facility_Interface facility, ArrayList<Maintenance> maintenance) {
        scheduledMaintenances.put(facility,maintenance);
    }

    public void listMaintenance() {
        for (Entry<Facility_Interface, ArrayList<Maintenance>> entry : scheduledMaintenances.entrySet()){
            System.out.println("Facility: " + entry.getKey().getFacilityInfo() + " requested following maintenances");
            for (Maintenance m : entry.getValue()){
                System.out.print(m.getType() + ", ");
            }
        }
    }

    public void calcMaintenanceCost(Facility_Interface facility) {
        double cost = 0.0;
        for (Entry<Facility_Interface, ArrayList<Maintenance>> entry : scheduledMaintenances.entrySet()) {
            if (entry.getKey() == facility) {
                for (Maintenance m : entry.getValue()){
                    cost += m.getCost();}
            }
        }
        System.out.println(cost);
    }

    //some hardcoded values here to check for problem rate
    public void calcProblemRate(Facility_Interface facility) {
        int problemrate = 0;
        for (Entry<Maintenance, Facility_Interface> entry : maintenanceRequests.entrySet()){
            if (entry.getValue() == facility){
                if (entry.getKey().getType() == "water")
                    problemrate = 1;
                else if (entry.getKey().getType() == "gas")
                    problemrate = 2;
                else if (entry.getKey().getType() == "electric")
                    problemrate = 5;
            }
        }
        System.out.println(problemrate);
    }

    public void calcDownTime(Facility_Interface facility) {
        return;
    }

    public void listFacilityProblems(Facility_Interface facility) {
        for (Entry< Facility_Interface , ArrayList<Maintenance>> entry : scheduledMaintenances.entrySet()){
            if (entry.getKey() == facility){
                for (Maintenance m : entry.getValue())
                    System.out.println(m.getType());
            }
        }
    }


}