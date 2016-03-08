// Connor Schiff
// CSE 002 Lab 06
// TwistGenerator.java: Program to generate a twist of a given length

import java.util.Scanner;

public class TwistGenerator{
   			public static void main(String[] args) {
   			    
   			    Scanner myScanner = new Scanner(System.in); //initialize the scanner
                System.out.println("Enter the length of the Twist you would like: "); //prompt for the length
                int TwistLength = myScanner.nextInt(); //specifies the input type to be an integer and reads it
                int i=TwistLength;
                int j=TwistLength;
                int k=TwistLength;
                
    /* while(!(myScanner.hasNextInt())){
        System.out.print("Length must be an integer, enter a new number: ");
        myScanner.next(); //clears the value
        TwistLength = myScanner.nextInt(); //takes new input
        i=TwistLength;
        j=TwistLength;
        k=TwistLength; 
    }     */
                
    while(i>=3){
        System.out.print(" \\ /");
        i=i-3;
    }
    if(i==1){
            System.out.print("\\");
        }
        else if(i==2){
            System.out.print("\\");
        }
        
    System.out.println("");
    
    while(j>=3){
        System.out.print("  x ");
        j=j-3;
    }
    
    System.out.println("");
    
    while(k>=3){
        System.out.print(" / \\");
        k=k-3;
        }
         if(k==1){
            System.out.print("/");
        }
        else if(k==2){
            System.out.print("/");
        }
        
    System.out.println("");
        
   	 } //end of main method
   	 
} //end of class
