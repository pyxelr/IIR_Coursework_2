package IIR;

import java.util.ArrayList;

public class Events {
	
  //Create variables
 int eventid;
 int numberofactions;
 ArrayList<Actions> listactions;
 
 
//Generate Getters and Setters for "eventid"
public int getEventid() {
	return eventid;
}

public void setEventid(int eventid) {
	this.eventid = eventid;
}

//Generate Getters and Setters for "numberofactions"
public int getNumberofactions() {
	return numberofactions;
}

public void setNumberofactions(int numberofactions) {
	this.numberofactions = numberofactions;
}

//Generate Getters and Setters for "listactions"
public ArrayList<Actions> getListactions() {
	return listactions;
}

public void setListactions(ArrayList<Actions> listactions) {
	this.listactions = listactions;
}
 
}