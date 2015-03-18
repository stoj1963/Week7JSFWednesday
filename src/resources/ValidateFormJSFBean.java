package resources;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;



@Named(value = "validateForm")
@RequestScoped

public class ValidateFormJSFBean {
	private String name;
	private String ssn;
	private String ageString;
	private String heightString;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getAgeString() {
		return ageString;
	}
	
	public void setAgeString(String ageString) {
		this.ageString = ageString;
	}
	
	public String getHeightString() {
		return heightString;
	}
	
	public void setHeightString(String heightString) {
		this.heightString = heightString;
	}
	
	public String getResponse() {
		String temp;
		if(name == null || ssn == null || ageString == null || heightString == null) {
			temp = "";
		}
		else {
			temp = "<br /><br />You Entered: <br />"
				   + "Name: " + name + "<br />"
				   + "SSN: " + ssn + "<br />"
				   + "Age: " + ageString + "<br />"
				   + "height: " + heightString + "<br />";
		}
		return temp;
	}
}
