// Connor Schiff
// CSE 002 HW 03
// Convert.java to convert meters to inches

import java.util.Scanner;

public class Convert{
   			public static void main(String[] args) {
   			    
   			    Scanner myScanner = new Scanner( System.in ); //initialize the scanner
                System.out.print("Enter the number of meters you wish to convert to inches: "); //prompt for the number of meters
                double numMeters = myScanner.nextDouble(); //read the double for number of meters and save it as numMeters
                double inches = numMeters*39.37; //convert meters to inches
                System.out.println(numMeters + " meters is " + inches + " inches."); //print the number of inches
                
            }  //end of main method   
    } //end of class