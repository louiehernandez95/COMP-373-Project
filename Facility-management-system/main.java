package Main;
package DAL;


import java.util.ArrayList;
import Facility.Facility;

public class Main {

    public static void main ( String {} args )
    {

     //Individuals

        Person p1 = new Person ("1", "Jim", "Halpert", "09-12-1975");
        Person p2 = new Person ("2", "Todd", "Packer", "03-01-1966");
        Person p3 = new Person ("3", "Pamela", "Halpert", "12-04-1977");
        Person p4 = new Person ("4", "Creed", "Bratton", "03-13-1899");

    //addresses+information

        Address add1 = new Address ("1", "101 Fox Drive", "", "Scranton","PA","18503","USA");
        Address add2 = new Address ("2", "300 East Higgens St", "", "New York","NY","60611","USA");
        Address add3 = new Address ("3", "400 Turn Pike Rd", "", "Scranton","PA","18503","USA");
        Address add4 = new Address ("4", "161 Lincoln Ave", "", "Cleveland","OH","40411","USA");
        Address add5 = new Address ("5", "747 South Park Ave", "", "Pittsburgh","PA","15106","USA");
        Address add6 = new Address ("6", "255 Rudolph St", "", "Scranton","PA","18503","USA");

     //Types of Facilities

        Facility F1 = new Facility("1", "Office", "620 * 14530", 292, add1);
        Facility F2 = new Facility("2", "Gym", "310 * 1310", 312, add2);
        Facility F3 = new Facility("3", "Cafe", "200 * 800", 221, add3);
        Facility F4 = new Facility("4", "Residential", "530 * 400", 222, add4);

     //Usage Costs of Facilities
        F1.setUsage(131.2);
        F2.setUsage(528194.32);
        F3.setUsage(2811.11);
        F4.setUsage(32847163.33);

        //Maintenance

        Maintainance m1 = new Maintainance("1", "gas", 8.25);
        Maintainance m2 = new Maintainance("2", "electric", 112.88);
        Maintainance m3 = new Maintainance("3", "heat", 524.21);

        Facility_Interface Facility_Interface = new FacilityUsage ();
        Facility_Interface.assignFacilityToUse(p1,F1);
        Facility_Interface.assignFacilityToUse(p1,F2);
        Facility_Interface.vacateFacility(p1, F2);
        Facility_Interface.addInspection(F1, I1);
        System.out.println("Inspections for Facility: " + F1.getFacilityInfo());
        FacUse1.listInspection(F1);
        System.out.println();
        System.out.println("Facilities used by this individual: " + p1.getFullName());
        p1.listPersonFacilities();
        System.out.println();
        System.out.println("The actual usage for the facility: " + F1.getFacilityInfo());
        Facility_Interface.listActualUsage(F1);
        System.out.println();

        //MaintenanceRequests
        Maintenance_Interface MainUsage = new MainRequest();
        MainUsage.makeFacilityMaintRequest(m1, F1);
        MainUsage.makeFacilityMaintRequest(m2, F2);
        MainUsage.makeFacilityMaintRequest(m3, F1);
        System.out.println("Maintenance requests made by the facilities are: ");
        System.out.println();
        MainUsage.listMaintainanceRequest();
        System.out.println();
        System.out.println("Scheduled maintenance are: ");
        System.out.println();
        ArrayList<Maintainance> temp = new ArrayList<Maintainance>();
        temp.add(m1);
        temp.add(m3);
        MainUsage.scheduleMaintainance(F1, temp);
        MainUsage.listMaintainance();
        System.out.println();
        System.out.println();
        System.out.println("Maintenance cost for facility F1 is ");
        MainUsage.calcMaintainanceCost(F1);
        System.out.println();
        System.out.println("Problem rate for maintenance is: ");
        MainUsage.calcProblemRate(F1);

        System.out.println();


    }
}