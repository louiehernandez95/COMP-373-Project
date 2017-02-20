package Usage;

import Facility.Facility_Interface;
import Facility.Inspection;
import Student_Detail.Student;



public class FacilityUse implements Use_Interface{

    public FacilityUse(){}


    public boolean isInUseDuringInterval() {
        return false;
    }

    public void assignFacilityToUse(Student student, Facility_Interface facility) {
        student.usesFacility.add(facility);

    }

    public boolean vacateFacility(Student student, Facility_Interface facility) {
        if (student.usesFacility.contains(facility))
            student.usesFacility.remove(facility);
        return true;
    }

    public void addInspection(Facility_Interface facility, Inspection inspection) {
        facility.addInspection(inspection);
    }

    public void listInspection(Facility_Interface facility) {
        for(Inspection i : facility.getInspections()){
            System.out.println(i.toString());
        }
    }

    public void listActualUsage(Facility_Interface facility) {
        System.out.println(facility.getUsage());
    }

    public double calcUsageRate() {
        return 0;
    }


}
