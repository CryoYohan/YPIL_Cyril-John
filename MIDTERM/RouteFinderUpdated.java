package MIDTERM;
import java.util.Scanner;

public class RouteFinderUpdated{
	   Scanner sc = new Scanner(System.in);
	   String route1[] = {"Minglanilla - Route 1", "San Fernando - Route 2", "Carcar - Route 3", "Barili - Route 4.1", "Dumanjug - Route 4.1.1", "Alcantra - Route 4.1.2"};
	   String route2[] = {"Minglanilla - Route 1", "San Fernando - Route 2", "Carcar - Route 3", "Sibonga - Route 4.2", "Dumanjug - Route 4.2.1", "Alcantra - Route 4.2.2"};
	   String route3[] = {"Minglanilla - Route 1","San Fernando - Route 2","Carcar - Route 3","Sibonga - Route 4.2", "Argao - Route 5", "Ronda - Route 5.1", "Alcantra - Route 5.2"};
	   double barili = 84.9, dumanjug = 94, argao = 103;
   
   public static void main(String[]args){
      RouteFinderUpdated object = new RouteFinderUpdated();
      String choice;
      int counter = 0;
      System.out.println("Welcome to RouteFinder!");
      do {
    	  try {
		      System.out.println("Is Barili blocked?");
		      choice = object.sc.nextLine();
		      if(choice.equalsIgnoreCase("yes")){
		         System.out.println("Is Dumanjug? blocked?");
		         choice = object.sc.nextLine();
		         if(choice.equalsIgnoreCase("yes")){
		           int val = 3;
		            object.pickRoute(object.argao,val );
		            counter++;
		         }
		         else if(choice.equalsIgnoreCase("no")){
		            int val = 2;
		            object.pickRoute(object.dumanjug,val );
		            counter++;
		         }
		      }
		      else if(choice.equalsIgnoreCase("no")){
		         int val = 1;							// the int val serves as a signifier if the route chosen is 1,2 or 3
		          object.pickRoute(object.barili,val );   // passed arguments the distance and the int val, the signifier
		          counter++;
		      }
		      else {
		    	  System.out.println("Please enter (YES/NO)");
		    	  counter = 0; // If user prompted neither yes or no, this sets counter variable to 0 to loop the program
		      }
    	  }catch(Exception e) {
    		  System.out.println("Invalid input"); // Catches invalid inputs, symbols;
    		  object.sc.nextLine();
    	  }
      }
      while(counter == 0); // Loop if counter == 0
      
   }
      
   public double calculateETA(double speed, double distance){
      double result = distance/speed;
      return result;
   }
   
   public void pickRoute(double distance, int val){ 
       double result;
       System.out.println("Enter speed in km/hr: ");
       double speed = sc.nextDouble();
       switch(val){
         case 1: 
        	 result = calculateETA(speed,barili);
        	 display(result, val, speed, distance);
        	 break;
         case 2:
             result = calculateETA(speed,dumanjug);
             display(result, val, speed, distance);
             break;
         case 3:
             result = calculateETA(speed,argao);
             display(result, val, speed, distance);
             break;
      }
   }
   
   public void display(double result, int val, double speed, double distance){
      switch(val){
         case 1:
            System.out.println("---------------------------------------------\n\tRECOMMENDED ROUTE:\t\t\n\t\t\t\t\t\n\tCebu city(South Bus) -  Start\t\n");
            for(String s: route1){
            	System.out.println("\t" + s);         
            }
            System.out.println("\n\tMoalboal - End\n");
            System.out.println("\tSpeed: " +(int)speed + "km/hr\n\tDistance: " + distance + "km");
            System.out.printf("\t" + convertTime(result) + "\n---------------------------------------------");
            break;
            
          case 2:
        	  System.out.println("---------------------------------------------\n\tRECOMMENDED ROUTE:\t\t\n\t\t\t\t\t\n\tCebu city(South Bus) -  Start\t\n");
            for(String s: route2){
            	System.out.println("\t" + s);         
            }
            System.out.println("\n\tMoalboal - End\n");
            System.out.println("\tSpeed: " + (int)speed + "km/hr\n\tDistance: " + distance + "km");
            System.out.printf("\t" + convertTime(result) + "\n---------------------------------------------");
            break;
            
          case 3:
        	  System.out.println("---------------------------------------------\n\tRECOMMENDED ROUTE:\t\t\n\t\t\t\t\t\n\tCebu city(South Bus) -  Start\t\n");
            for(String s: route3){
            	System.out.println("\t" + s);         
            }
            System.out.println("\n\tMoalboal - End\n");
            System.out.println("\tSpeed: " + (int)speed + "km/hr\n\tDistance: " + distance + "km");
            System.out.printf("\t" + convertTime(result) + "\n---------------------------------------------");
            break;                 
      }
      
   }   
   // Converts double hours to Hours and Minutes
   public String convertTime(double totalHours) {
	   int hours = (int)totalHours;
	   double decimalMinutes = (totalHours - hours) * 60;
	   int minutes = (int)decimalMinutes;
	   return "ETA: " + hours + " hour(s) and " + minutes + " minute(s)";
   } 
}
