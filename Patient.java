
public class Patient {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String emergencyContactName;
	private String emergencyContactPhoneNumber;
	
	public Patient()
	{
		firstName = "";
		middleName = "";
		lastName = "";
		address = "";
		city = "";
		state = "";
		zipCode = "";
		phoneNumber = "";
		emergencyContactName = "";
		emergencyContactPhoneNumber = "";
	}
	
	public Patient(String firstName, String middleName, String lastName)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public Patient(String firstName, String middleName, String lastName, String address, 
			String city, String state, String zipCode, String phoneNumber, 
			String emergencyContactName, String emergencyContactPhoneNumber)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.emergencyContactName = emergencyContactName;
		this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
	}
	
	public void setFirstName(String name)
	{
		firstName = name;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setMiddleName(String name)
	{
		middleName = name;
	}
	
	public String getMiddleName()
	{
		return middleName;
	}
	
	public void setLastName(String name)
	{
		lastName = name;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public String getState()
	{
		return state;
	}
	
	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}
	
	public String getZipCode()
	{
		return zipCode;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void setEmergencyContactName(String emergencyContactName)
	{
		this.emergencyContactName = emergencyContactName;
	}
	
	public String getEmergencyContactName()
	{
		return emergencyContactName;
	}
	
	public void setEmergencyContactPhoneNumber(String emergencyContactPhoneNumber)
	{
		this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
	}
	
	public String getEmergencyContactPhoneNumber()
	{
		return emergencyContactPhoneNumber;
	}
	
	public String buildFullName()
	{
		String fullName = (firstName + " " + middleName + " " + lastName);
		return fullName;
	}
	
	public String buildAddress()
	{
		String fullAddress = (address + " " + city + " " + state + " " + zipCode);
		return fullAddress;
	}
	
	public String buildEmergencyContact()
	{
		String emergencyContact = (emergencyContactName + " " + emergencyContactPhoneNumber);
		return emergencyContact;
	}
	
	public String toString()
	{
		String s = this.buildFullName() + " " + this.buildAddress() + " " + this.buildEmergencyContact();
		return s;
	}

}
