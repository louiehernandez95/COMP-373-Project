package Usage Detail;
import java.util.ArrayList;
import java.util.ArrayList;
import facility-detail.facility-detail;
import facility-detail.Facility_Interface;


public class Address(){
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String HomeAddress;

    public Address(){}

    public Address(String homeAddress, String City, String State, String ZipCode, String Country){
            this.city=City;
            this.HomeAddress = homeAdress;
            this.state = State;
            this.zipCode = ZipCode;
            this.country = Country;
            }

    public String getHomeAddress(){
            return this.HomeAdress;
            }

    public void setHomeAddress(String homeAdress){
            this.HomeAdress = homeAdress;
            }
    public String getZipCode(){
            return this.zipCode;
            }

    public void setZipCode(String ZipCode){
            this.zipCode = ZipCode;
            }

    public String getCity(){
            return this.city;
            }

    public void setCity(String City){
            this.city = City;
            }

    public String getState(){
            return this.state;
            }

    public void setState(String State){
            this.state = State;
            }

    public String getCountry(){
            return this.country;
            }

    public void setCountry(String Country){
            this.country = Country;
            }

    public String toString(){
            return HomeAdress + " " + "\n" + city + ", " + state + " " + zipCode;
            }

}
public class Phone(){

    private String AreaCode=null;
    private String ServiceProvider=null;
    private String PhoneNumber=null;
    private String CountryNumber=null;

    public Phone(){}

    public Phone (String Service_Provider, String Country_Number, String Area_Code, String Phone_Number){
            this.ServiceProvider = Service_Provider;
            this.CountryNumber = Country_Number;
            this.AreaCode = Area_Code;
            this.PhoneNumber = Phone_Number;
            }

    public String getServiceProvider(){
            return this.ServiceProvider;
            }

    public void setServiceProvider(String Service_Provider){
            this.ServiceProvider = Service_Provider;
            }

    public String getCountryNumber(){
            return this.CountryNumber;
            }

    public void setCountryNumber(String Country_Number){
            this.CountryNumber = Country_Number;
            }

    public String getAreaCode(){
            return this.AreaCode;
            }

    public void setAreaCode(String Area_Code){
            this.AreaCode = Area_Code;
            }

    public String getPhoneNumber(){
            return this.PhoneNumber;
            }

    public void setPhoneNumber(String Phone_Number){
            this.PhoneNumber = Phone_Number;
            }

    public String getPhone(){
            return String.format("%s: +%s + (%s) + %s", ServiceProvider, CountryNumber, AreaCode, PhoneNumber);
        }
}
public class Person(){
    private String firstName=null;
    private String lastName=null;
    private String gender=null;
    private String sex=null;
    private String age=null;
    private String dateOfBirth=null;
    private String email=null;
    private ArrayList<Phone> phone = null;
    private ArrayList<Address>address = null;
    public ArrayList<Facility_Interface> usesFacility = new ArrayList<Facility_Interface> (); //change facility to IfacilityUse

    public Person(){
            this.address = new ArrayList<Address>();
            this.phone = new ArrayList<Phone>();
            }

    public Person(String FirstName, String LastName, String DateOfBirth){
            this.firstName = FirstName;
            this.lastName = LastName;
            this.dateOfBirth = DateOfBirth;
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

    public ArrayList<Phone> getPhone(){
            return this.phone;
            }

    public void addPhone(Phone phone){
            this.phone.add(phone);
            }

    public boolean removePhone(Phone phone){
            if (this.phone.contains(phone)){
            this.phone.remove(phone);
            }
            return !this.phone.contains(phone);
            }

    public String getEmail(){
            return this.email;
            }

    public void setEmail(String Email){
            this.email = Email;
            }

    public String getDateOfBirth(){
            return this.dateOfBirth;
            }

    public void setDateOfBirth(String dateOfBirth){
            this.dateOfBirth = DateOfBirth;
            }

    public void listPersonFacilities(){
            for (Facility_Interface f : usesFacility)
            System.out.println(f.getFacilityInfo());
            }
}

