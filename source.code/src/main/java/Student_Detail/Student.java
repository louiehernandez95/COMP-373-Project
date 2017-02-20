package Student_Detail;

import java.util.ArrayList;
import Facility.Facility_Interface;

public class Student {

    private String id = null;
    private String firstName = null;
    private String lastName = null;
    private String dateOfBirth = null;
    private ArrayList<Address>address = null;
    public ArrayList<Facility_Interface> usesFacility = new ArrayList<Facility_Interface> ();

    public Student(){
        this.address = new ArrayList<Address>();

    }

    public Student(String id, String FirstName, String LastName, String DateOfBirth){
        this.id = id;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.dateOfBirth = DateOfBirth;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String FirstName){
        this.firstName = FirstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String LastName){
        this.lastName = LastName;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public ArrayList<Address> getAddress(){
        return this.address;
    }

    public void addAddress(Address address){
        this.address.add(address);
    }

    public boolean removeAddress(Address address){
        if (this.address.contains(address)){
            this.address.remove(address);
        }
        return !this.address.contains(address);
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth){
        this.dateOfBirth = DateOfBirth;
    }

    public void listPersonFacilities(){
        for (Facility_Interface f : usesFacility)
            System.out.println(f.getFacilityInfo());
    }

}


