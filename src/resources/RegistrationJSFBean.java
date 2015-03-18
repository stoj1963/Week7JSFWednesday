package resources;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "registration")
@RequestScoped

public class RegistrationJSFBean {
	private String lastname;
	private String firstname;
	private String mi;
	private String gender;
	private String major;
	private String[] minor;
	private String[] hobby;
	private String remarks;
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getMi() {
		return mi;
	}
	
	public void setMi(String mi) {
		this.mi = mi;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String[] getMinor() {
		return minor;
	}
	
	public void setMinor(String[] minor) {
		this.minor = minor;
	}
	
	public String[] getHobby() {
		return hobby;
	}
	
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	
	public String getRemarks() {
		return remarks;
	}
	
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public String getResponse() {
		String temp;
		
		if (lastname == null) {
			temp="";
		}
		else {
			String allMinors = "";
			
			for (String s: minor) {
				allMinors += s + "";
			}
			
			String allHobbies = "";
			
			for (String h: hobby) {
				allHobbies += h + "";
			}		
			
			temp = "<p style='color:red'> You entered: <br>"
					+ "Last Name: " + lastname + "<br>"
					+ "First Name: " + firstname + "<br>"
					+ "MI: " + mi + "<br>"
					+ "Gender: " + major + "<br>"
					+ "Minor: " + allMinors + "<br>"
					+ "Hobbies: " + allHobbies + "<br>"
			        + "Remarks: " + remarks + "</p>";
		}
		return temp;
	}
}
