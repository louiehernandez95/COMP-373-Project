package Services;

import java.util.ArrayList;

import facility-detail.facility-interface;
import Facility_Maintenance.Maintenance;

public interface MaintenanceUsageInterface {

    void makeFacilityMainRequest(Maintenance maintenance, Facility_Interface facility);
    void scheduleMaintenance(Facility_Interface facility, ArrayList<Maintenance> maintenance);
    void calcMaintenanceCost(Facility_Interface facility);
    void calcProblemRate(Facility_Interface facility);
    void calcDownTime(Facility_Interface facility);
    void listMaintenanceRequest();
    void listMaintenance();
    void listFacilityProblems(Facility_Interface facility);
}
