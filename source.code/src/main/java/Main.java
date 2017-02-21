import java.util.ArrayList;

import Facility.Facility;
import Facility.Floors;
import Facility.Inspection;
import Facility.Unit;
import Facility_Maintenance.Maintenance;
import Student_Detail.Address;
import Student_Detail.Student;
import Usage.FacilityUse;
import Usage.MainRequest;
import Usage.Use_Interface;
import Usage.MaintenanceUsage_Interface;


public class Main 
{
    public static void main( String[] args )
    {
        Address address_1 = new Address ("1", "1125 W Loyola Ave", "Chicago","IL","60626","United States");
        Address address_2 = new Address ("2", "6340 N Winthrop Ave", "Chicago","IL","60660","United States");
        Address address_3 = new Address ("3", "6317 N Kenmore Ave", "Chicago","IL","60660","United States");

        Facility Facility_1 = new Facility("Mertz Hall", "Dorm", "100 * 100", 10, address_1);
        Facility Facility_2 = new Facility("Regis Hall", "Dorm", "100 * 100", 10, address_2);
        Facility Facility_3 = new Facility("San Francisco Hall", "Dorm", "100 * 100", 10, address_3);

        Facility_1.setUsage(152.1);
        Facility_2.setUsage(142.1);
        Facility_3.setUsage(100.56);

        Unit unit_1 = new Unit ("1", 10.0, 10.0, 10.0, "Dorm room");
        Unit unit_2 = new Unit ("2", 10.0, 10.0, 10.0, "Dorm room");
        Unit unit_3 = new Unit ("3", 10.0, 10.0, 10.0, "Dorm room");
        
        Floors floor_1 = new Floors("1", 150, 1, 120.31, 241.41, 100, 4);
        Floors floor_2 = new Floors("80", 50, 20, 120.41, 241.41, 100, 4 );
        Inspection Inspection_1 = new Inspection ("1", "12:00 pm", "Surprise Inspection");
        Inspection Inspection_2 = new Inspection ("2", "1:00 pm", "Drug Inspection");
        Inspection Inspection_3 = new Inspection ("3", "12:00 pm", "Safety Inspection");
        
        Student student_1 = new Student ("1", "Louie", "hernandez", "11-01-95");
        Student student_2 = new Student ("2", "Adil", "Ahmad", "03-11-96");
        Student student_3 = new Student ("3", "Scooby", "Doo", "09-13-69");
        Student student_4 = new Student ("4", "Donald", "Trump", "01-20-17");
        
        Maintenance maintenance_1 = new Maintenance("1", "Leaky Faucet", 110.50);
        Maintenance maintenance_2 = new Maintenance("2", "Broken Toilet", 100.50);
        Maintenance maintenance_3 = new Maintenance("3", "Gas Leak", 150.50);
        Maintenance maintenance_4 = new Maintenance("4", "Gas Leak", 150.50);
        
        Use_Interface FacUse1 = new FacilityUse ();
        FacUse1.assignFacilityToUse(student_1,Facility_1);
        FacUse1.assignFacilityToUse(student_1,Facility_2);
        FacUse1.vacateFacility(student_1, Facility_2);
        FacUse1.addInspection(Facility_1, Inspection_1);
        System.out.println();
        System.out.println("INSPECTIONS FOR FACILITY " + Facility_1.getFacilityInfo());
        FacUse1.listInspection(Facility_1);
        System.out.println();
        System.out.println("FACILITIES USED BY PERSON: " + student_1.getFullName());
        student_1.listPersonFacilities();
        System.out.println();
        System.out.println("ACTUAL USAGE FOR FACILITY: " + Facility_1.getFacilityInfo());
        FacUse1.listActualUsage(Facility_1);
        System.out.println();
        //Main
        MaintenanceUsage_Interface maintenance_Usage = new MainRequest();
        maintenance_Usage.makeFacilityMaintRequest(maintenance_1, Facility_1);
        maintenance_Usage.makeFacilityMaintRequest(maintenance_2, Facility_2);
        maintenance_Usage.makeFacilityMaintRequest(maintenance_3, Facility_1);
        maintenance_Usage.makeFacilityMaintRequest(maintenance_4, Facility_1);
        System.out.println();
        System.out.println("LIST OF MAINTENANCE REQUESTS BY FACILITIES: ");
        maintenance_Usage.listMaintenanceRequest();
        System.out.println();
        System.out.println("LIST OF SCHEDULED MAINTENANCE: ");
        ArrayList<Maintenance> temp = new ArrayList<Maintenance>();
        temp.add(maintenance_1);
        temp.add(maintenance_3);
        maintenance_Usage.scheduleMaintenance(Facility_1, temp);
        maintenance_Usage.listMaintenance();
        System.out.println();
        System.out.println("MAINTENANCE COST FOR FACILITY 1");
        maintenance_Usage.calcMaintenanceCost(Facility_1);
        maintenance_Usage.calcDownTime(Facility_1);
        System.out.println("PROBLEM RATE FOR MAINTENANCE: ");
        maintenance_Usage.calcProblemRate(Facility_1);

    }
}
