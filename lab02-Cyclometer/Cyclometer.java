//Connor Schiff
//CSE 002 Lab 02
//Cyclometer
//Prints time, counts, and distance of two trips on a bicycle.

public class Cyclometer {
    //main method
    public static void main(String[] args){
        
        //input data
        int secsTrip1=480; //the duration of the first trip
        int secsTrip2=3220; //the duration of the second trip
        int countsTrip1=1561; //the number of counts in the first trip
        int countsTrip2=9027; //the number of counts in the second trip
        
        //intermediate variables and output data
        double wheelDiameter=27.0, //the diameter of the wheels of the bike
        PI=3.14159, //definition of Pi
        feetPerMile=5280, //number of feet in a mile
        inchesPerFoot=12, //number of inches in a foot
        secondsPerMinute=60; //number of seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; //the variables that will contain the distance traveled on each trip
        
        
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+ "minutes and had "+countsTrip1+" counts."); //prints the facts from the first trip
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+ "minutes and had "+countsTrip2+" counts."); //prints the facts from the second trip
        
	    distanceTrip1=countsTrip1*wheelDiameter*PI; //computes the distance in inches
	    distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
	    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //gives distance in miles
	    totalDistance=distanceTrip1+distanceTrip2; //computes the total distance
	    
	    //Prints the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
    	System.out.println("Trip 2 was "+distanceTrip2+" miles");
    	System.out.println("The total distance was "+totalDistance+" miles");
    	
    } //end of main method
} //end of class