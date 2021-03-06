package in.sts.gradleproject.models;

public class Address {

	private String city;
	private String country;
	private int pincode;

	public Address(String city, String country, int pincode) {
		super();
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}
	
	
	public Address() {
		super();
	}


	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "AddressModel [city=" + city + ", country=" + country + ", pincode=" + pincode + "]";
	}

}
