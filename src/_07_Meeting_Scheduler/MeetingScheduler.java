package _07_Meeting_Scheduler;

public class MeetingScheduler {
    	
    /*
     * Your task is to code a method to find a meeting time for two people
     * given their schedules.
     * 
     * Code the method below so that it returns a Schedule object that contains
     * all the times during the week that are in BOTH people's schedules. The
     * Schedule class is included in this package.
     * 
     * Example:
     * person1 availability - Monday at 9, Tuesday at 14, and Friday 10
     * person2 availability - Tuesday at 14, Friday 8, and Monday at 9
     * The returned HashMap should contain: Tuesday 14 and Monday 9
     * 
     * The returned Schedule object represents the times both people are
     * available for a meeting.
     * 
     * Time availability is always at the top of the hour, so 9:30 is not valid
     * Time availability always represents 1 hour
     * Assume both schedules are in the same time zones
     */
    public static Schedule getMutualAvailability(Schedule person1, Schedule person2) {
    	Schedule common = new Schedule();
    	
        person1.printSchedule();
       person2.printSchedule();
        
        Mon(person1, person2, common);
        Tue(person1, person2, common);
        Wen(person1, person2, common);
        Thu(person1, person2, common);
        Fri(person1, person2, common);
        Sat(person1, person2, common);
        Sun(person1, person2, common);
        common.printSchedule();
    
        return common;
        
    }
    
    static void Mon(Schedule person1, Schedule person2, Schedule common ) {
    	int com = 0;
    	//person1.getSchedule().get("Monday");
    	for(int j = 0; j < person1.getSchedule().get("Monday").size(); j++) {
    		
    		for(int n = 0; n < person2.getSchedule().get("Monday").size(); n++) {
    			if(person1.getSchedule().get("Monday").get(j) == person2.getSchedule().get("Monday").get(n)){
    			 
    				common.addAvailability("Monday", person2.getSchedule().get("Monday").get(n));
    				System.out.println(""+person2.getSchedule().get("Monday").get(n));
    				com = person2.getSchedule().get("Monday").get(n);
    			}
        		
        	}
    		
    	}
    	
    }
    
    static void Tue(Schedule person1, Schedule person2, Schedule common ) {
    	int com = 0;
    	person1.getSchedule().get("Tuesday");
    	for(int j = 0; j < person1.getSchedule().get("Tuesday").size(); j++) {
    		
    		for(int n = 0; n < person2.getSchedule().get("Tuesday").size(); n++) {
    			if(person1.getSchedule().get("Tuesday").get(j) == person2.getSchedule().get("Tuesday").get(n)){
    			 
    				common.addAvailability("Tuesday", person2.getSchedule().get("Tuesday").get(n));
    				System.out.println(""+person2.getSchedule().get("Tuesday").get(n));
    				com = person2.getSchedule().get("Tuesday").get(n);
    			}
        		
        	}
    		
    	}
    	
    }
    
    static void Wen(Schedule person1, Schedule person2, Schedule common ) {
    	int com = 0;
    	person1.getSchedule().get("Wednesday");
    	for(int j = 0; j < person1.getSchedule().get("Wednesday").size(); j++) {
    		
    		for(int n = 0; n < person2.getSchedule().get("Wednesday").size(); n++) {
    			if(person1.getSchedule().get("Wednesday").get(j) == person2.getSchedule().get("Wednesday").get(n)){
    			 
    				common.addAvailability("Wednesday", person2.getSchedule().get("Wednesday").get(n));
    				System.out.println(""+person2.getSchedule().get("Wednesday").get(n));
    				com = person2.getSchedule().get("Wednesday").get(n);
    			}
        		
        	}
    		
    	}
    	
    }
    
    static void Thu(Schedule person1, Schedule person2, Schedule common ) {
    	int com = 0;
    	person1.getSchedule().get("Thursday");
    	for(int j = 0; j < person1.getSchedule().get("Thursday").size(); j++) {
    		
    		for(int n = 0; n < person2.getSchedule().get("Thursday").size(); n++) {
    			if(person1.getSchedule().get("Thursday").get(j) == person2.getSchedule().get("Thursday").get(n)){
    			 
    				common.addAvailability("Thursday", person2.getSchedule().get("Thursday").get(n));
    				System.out.println(""+person2.getSchedule().get("Thursday").get(n));
    				com = person2.getSchedule().get("Thursday").get(n);
    			}
        		
        	}
    		
    	}
    	
    }
    
    static void Fri(Schedule person1, Schedule person2, Schedule common ) {
    	int com = 0;
    	person1.getSchedule().get("Friday");
    	for(int j = 0; j < person1.getSchedule().get("Friday").size(); j++) {
    		
    		for(int n = 0; n < person2.getSchedule().get("Friday").size(); n++) {
    			if(person1.getSchedule().get("Friday").get(j) == person2.getSchedule().get("Friday").get(n)){
    			 
    				common.addAvailability("Friday", person2.getSchedule().get("Friday").get(n));
    				System.out.println(""+person2.getSchedule().get("Friday").get(n));
    				com = person2.getSchedule().get("Friday").get(n);
    			}
        		
        	}
    		
    	}
    	
    }
    
    static void Sat(Schedule person1, Schedule person2, Schedule common ) {
    	int com = 0;
    	person1.getSchedule().get("Saturday");
    	for(int j = 0; j < person1.getSchedule().get("Saturday").size(); j++) {
    		
    		for(int n = 0; n < person2.getSchedule().get("Saturday").size(); n++) {
    			if(person1.getSchedule().get("Saturday").get(j) == person2.getSchedule().get("Saturday").get(n)){
    			 
    				common.addAvailability("Saturday", person2.getSchedule().get("Saturday").get(n));
    				System.out.println(""+person2.getSchedule().get("Saturday").get(n));
    				com = person2.getSchedule().get("Saturday").get(n);
    			}
        		
        	}
    		
    	}
    	
    }
    
    static void Sun(Schedule person1, Schedule person2, Schedule common ) {
    	int com = 0;
    	person1.getSchedule().get("Sunday");
    	for(int j = 0; j < person1.getSchedule().get("Sunday").size(); j++) {
    		
    		for(int n = 0; n < person2.getSchedule().get("Sunday").size(); n++) {
    			if(person1.getSchedule().get("Sunday").get(j) == person2.getSchedule().get("Sunday").get(n)){
    			 
    				common.addAvailability("Sunday", person2.getSchedule().get("Sunday").get(n));
    				System.out.println(""+person2.getSchedule().get("Sunday").get(n));
    				com = person2.getSchedule().get("Sunday").get(n);
    			}
        		
        	}
    		
    	}
    	
    }
   
}
