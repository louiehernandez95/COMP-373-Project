package Services;

import java.util.ArrayList;

import Facility.Facility_Interface;
import Facility_Maintenance.Maintenance;

public interface IMaintainanceUsage {

    public void makeFacilityMaintRequest(Maintainance maintainance, IFacility facility);
    public void scheduleMaintainance(Facility_Interface facility, ArrayList<Maintainance> maintainance);
    public void calcMaintainanceCost(Facility_Interface facility);
    public void calcProblemRate(Facility_Interface facility);
    public void calcDownTime(Facility_Interface facility);
    public void listMaintainanceRequest();
    public void listMaintainance();
    public void listFacilityProblems(Facility_Interface facility);
}
