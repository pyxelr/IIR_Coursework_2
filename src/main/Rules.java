package main;

public class Rules {
	
// Create variables
int ruleid;


// Generate Events inside rules
Events event;

//Generate Getters and Setters for "rule id"
public int getRuleid() {
	return ruleid;
}
public void setRuleid(int ruleid) {
	this.ruleid = ruleid;
}

//Generate Getters and Setters for "event"
public Events getEvent() {
	return event;
}
public void setEvent(Events event) {
	this.event = event;
}

}