package Usage;

import java.util.ArrayList;
import Facility.Facility_Interface;
import Facility_Maintenance.Maintenance;

public interface MaintenanceUsage_Interface {
    void makeFacilityMaintRequest(Maintenance maintenance, Facility_Interface facility);
    void scheduleMaintenance(Facility_Interface facility, ArrayList<Maintenance> maintenance);
    void calcMaintenanceCost(Facility_Interface facility);
    void calcProblemRate(Facility_Interface facility);
    void listMaintenanceRequest();
    void listMaintenance();
    void calcDownTime(Facility_Interface facility);
    void listFacilityProblems(Facility_Interface facility);
}
