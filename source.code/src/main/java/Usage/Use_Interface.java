package Usage;

import Facility.Facility_Interface;
import Facility.Inspection;
import Student_Detail.Student;

public interface Use_Interface {
    boolean isInUseDuringInterval();
    void assignFacilityToUse(Student student, Facility_Interface facility);
    boolean vacateFacility(Student student, Facility_Interface facility);
    void listInspection(Facility_Interface facility);
    void listActualUsage(Facility_Interface facility);
    double calcUsageRate();
    void addInspection(Facility_Interface facility, Inspection inspection);

}