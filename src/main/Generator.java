package main;
// import resizable-array implementation of the LIST interface
import java.util.ArrayList;

public class Generator {

	
public static void main(String[] args) {

	  
		ArrayList<Rules> listofRules = new ArrayList<Rules>();
		// Create 5000 rules
	for (int i=0; i<5000; i++) {
		Rules rule=new Rules();
		Events event=new Events();
		ArrayList<Actions> actionlist = new ArrayList<Actions>();
		// Create times rule id (1, 2, 3, 4, 5 ... 5000)
		rule.setRuleid(i);
		// Create event id (randomly) <with id in range 1 to 20>
		event.setEventid(generaterandoms(1,20));
		// 4 actions in each event
		event.setNumberofactions(4);
		rule.setEvent(event);
		listofRules.add(rule);
			
		// Generate actions <with id in range 1 to 5>
		for(int j=0; j<event.getNumberofactions(); j++) {
				
			Actions action = new Actions();
			action.setActionId(generaterandoms(1,5));
			actionlist.add(action);
			
			switch(action.getActionId()) {
	         case 1 :
	            action.setDescription("Open gate");
	            break;
	         case 2 :
	             action.setDescription("Close gate");
		         break;
	         case 3 :
	             action.setDescription("Open window");
		         break;
	         case 4 :
	        	 action.setDescription("Close window");
		         break;
	         case 5 :
	        	 action.setDescription("Call the police");
		         break;    
	         default :
	            System.out.println("Default action");
	      
			}
		
		}
			
			// === Print list of rules ===
		for (Rules ruled : listofRules) {
			// Print "r1 = e1 ->"
			System.out.println("r"+ruled.getRuleid()+" = e"+ruled.getEvent().getEventid()+" ->");
				
			for (Actions actionFinished : actionlist) {
				// Print 4 times "a1"
			System.out.println("a"+actionFinished.getActionId()+" "+actionFinished.getDescription());
					
			}
				
		}
			
		// Check redundancy & shadowing	
		for (Actions action1 : actionlist) {
			int counterofactions=0;
			for (Actions action2 : actionlist) {
				if(action1.getActionId() == action2.getActionId()) {
					counterofactions++;
				}
				if(counterofactions==4) {
					System.out.println("Redundancy Event!!!");
					System.out.println(action1.getActionId()+""+action2.getActionId());
					
				}
				
			}
				
		}
	

		
	}
}

		// Function to generate random numbers
		static int generaterandoms(int minimum, int maximum) {
		   
					int rangeofvalues = (maximum - minimum) + 1;     
					return (int)(rangeofvalues * Math.random()) + minimum;
		}
		
		
}