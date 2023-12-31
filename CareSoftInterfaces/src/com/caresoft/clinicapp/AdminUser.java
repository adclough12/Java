package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
//... imports class definition...
    
    // Inside class:
    private String role;
    private ArrayList<String> securityIncidents;
    
    
	public void newIncident(String notes) {
    	String report = String.format(
    			"Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
    			new Date(), this.id, notes
    			);
    	securityIncidents.add(report);
    }
    public void authIncident() {
    	String report = String.format(
    			"Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
    			new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
    			);
    	securityIncidents.add(report);
    }
    
    
    
    // TO DO: Implement a constructor that takes an ID and a role
	public AdminUser(int id, String role) {
    	super(id);
    	securityIncidents = new ArrayList<>();
}
	// TO DO: Setters & Getters
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
	
	// TO DO: Implement HIPAACompliantUser!
	// TO DO: Implement HIPAACompliantAdmin!
	@Override
    public boolean assignPin(int pin) {
    	if(pin>99999 && pin<1000000) {
    		return true;
    	}
    	return false;
    	
    }
    
	@Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	if(this.id == confirmedAuthID) {
    		return true;
    	}
    	authIncident();
    	return false;
    }
    
    @Override
    public ArrayList<String> reportSecurityIncidents() {
    	return securityIncidents;
    }
    

}
