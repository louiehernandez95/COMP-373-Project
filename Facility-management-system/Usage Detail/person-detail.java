package Usage Detail;
import java.util.ArrayList;

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
    private String FirstName=null;
    private String LastName=null;
    private String Gender=null;
    private String Sex=null;
    private String Age=null;
    private String DateOfBirth=null;
    private String Email=null;
}
