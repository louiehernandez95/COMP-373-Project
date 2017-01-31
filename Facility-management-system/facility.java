import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.sql.*;

public class Facility {
    public String listFacilities();
    public String requestAvailableCapacity();
    public String addNewFacility();
    public String addFacilityDetail();
    public String removeFacility();
    public String getFacilityInformation(Facility facility){
        String info = ("Facility Name: " + facility.facilityName +"\nFacility Manager: " +
                facility.facilityManager + "\nMaintenence Schedule: " + facility.maintenenceSchedule +
                "\nUsage Rate: " + facility.usageRate);
        return info;
    }
}