// Connor Schiff
// CSE 002 Lab 03
// Check.java: Program to split a meal check among friends

import java.util.Scanner;

public class Check{
   			public static void main(String[] args) {
   			    
   			    Scanner myScanner = new Scanner( System.in ); //initialize the scanner
                System.out.print("Enter the original cost of the check in the form xx.xx: "); //prompt for the cost in double form
                double checkCost = myScanner.nextDouble(); //read the double and save it as checkCost
                System.out.print("Enter the percentage tip that you wish to pay as a whole number in the form xx: "); //prompt the user for the tip percent as a two digit integer
                double tipPercent = myScanner.nextDouble(); //save the double from the input as tipPercent
                tipPercent/=100; //Convert the percentage into a decimal value
                System.out.print("Enter the number of people who went out to dinner: "); //prompt for the size of the dinner party (the number of people who would be splitting the check)
                int numPeople = myScanner.nextInt(); //save the number of people (an integer) as numPeople
                double totalCost;
                double costPerPerson;
                int dollars,   //whole dollar amount of cost 
                dimes, pennies; //for storing digits to the right of the decimal point
                totalCost = checkCost * (1 + tipPercent);
                costPerPerson = totalCost / numPeople;
                dollars=(int)costPerPerson; //get the whole amount, dropping decimal fraction
                dimes=(int)(costPerPerson * 10) % 10; //get dimes amount
                pennies=(int)(costPerPerson * 100) % 10; //get pennies amount
                System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies); //prints the cost per person

            }  //end of main method   
    } //end of class
