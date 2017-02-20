package Facility;
import java.util.ArrayList;


public interface Facility_Interface {
    void listUnits();
    String getFacilityInfo();
    int getAvailableCapacity();
    boolean addNewUnit(Unit unit);
    void addFacilityDetail(String detail);
    boolean removeUnit(Unit unit);
    ArrayList<Inspection> getInspections();
    void addInspection(Inspection inspection);
    double getUsage();

}
