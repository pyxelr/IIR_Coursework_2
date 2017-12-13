package main;

import java.util.ArrayList;

public class Events {
 int eventid;
 int numberofactions;
 
 ArrayList<Actions> listactions;

public int getEventid() {
	return eventid;
}

public void setEventid(int eventid) {
	this.eventid = eventid;
}

public int getNumberofactions() {
	return numberofactions;
}

public void setNumberofactions(int numberofactions) {
	this.numberofactions = numberofactions;
}

public ArrayList<Actions> getListactions() {
	return listactions;
}

public void setListactions(ArrayList<Actions> listactions) {
	this.listactions = listactions;
}
 
 
}
