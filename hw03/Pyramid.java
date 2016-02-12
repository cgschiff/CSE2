// Connor Schiff
// CSE 002 HW 03
// Computes the volume of a square pyramid given base side length and height

import java.util.Scanner;

public class Pyramid{
   			public static void main(String[] args) {
   			    
   			    Scanner myScanner = new Scanner( System.in ); //initialize the scanner
                System.out.print("Enter the length of the square sides of the base: "); //prompt for base side length
                double length = myScanner.nextDouble(); //read the double for number of meters and save it as numMeters
                System.out.print("Enter the height: "); //prompt for height
                double height = myScanner.nextDouble(); //read the double for number of meters and save it as numMeters
                double volume = (length*length*height)/3; //computes the volume using the input length and height
                System.out.println("The volume of the pyramid is " + volume); //print the number of inches
                
            }  //end of main method   
    } //end of class