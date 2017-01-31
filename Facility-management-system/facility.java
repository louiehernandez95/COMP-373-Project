import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.sql.*;

public class Facility {
    public String facilityName;
    public String facilityManager;
    public String maintenenceSchedule;
    public float usageRate;
    public int problemCounter;
    public String getFacilityInformation(Facility facility){
        String info = ("Facility Name: " + facility.facilityName +"\nFacility Manager: " +
                facility.facilityManager + "\nMaintenence Schedule: " + facility.maintenenceSchedule +
                "\nUsage Rate: " + facility.usageRate);
        return info;
    }
}