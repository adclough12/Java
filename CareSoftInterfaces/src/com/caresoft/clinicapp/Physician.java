package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
//... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}
    
	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	
	@Override
	public boolean assignPin(int pin) {
    	if(pin>999 && pin<10000) {
    		return true;
    	}
    	return false;
    }
	
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	if(this.id == confirmedAuthID) {
    		return true;
    	}
    	return false;
    }
    // TO DO: Constructor that takes an ID
    // TO DO: Implement HIPAACompliantUser!
	public Physician(int id) {
		super(id);
	}


	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
    // TO DO: Setters & Getters

}
