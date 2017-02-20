package Student_Detail;

public class Address {
	private String id;
	private String address1;
	private String city;
	private String state;
	private String zip;
	private String country;
	
	public Address(){}
	
	public Address(String id, String add1, String City, String State, String Zip, String Country){
		this.id = id;
		this.address1 = add1;
		this.city = City;
		this.state = State;
		this.zip = Zip;
		this.country = Country;
	}
	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getAddress1(){
		return this.address1;
	}
	
	public void setAddress1(String add1){
		this.address1 = add1;
	}
	
	public String getZip(){
		return this.zip;
	}
	
	public void setZip(String zip){
		this.zip = zip;
	}
	
	public String getCity(){
		return this.city;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public String getState(){
		return this.state;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	public String getCountry(){
		return this.country;
	}
	
	public void setCountry(String country){
		this.country = country;
	}
	
	public String toString(){
		return address1 + " " + "\n" + city + ", " + state + " " + zip;
	}
		
}
