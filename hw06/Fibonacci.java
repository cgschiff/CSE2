// Connor Schiff
// CSE 002 HW06
// TwistGenerator.java: Program to generate a Fibonacci sequence of a given length

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Fibonacci{
   			public static void main(String[] args) {
   			    
   			    Scanner myScanner = new Scanner(System.in); //initialize the scanner
                System.out.println("Enter the first number in the sequence: "); //prompt first number
                int a = myScanner.nextInt(); //specifies the input type to be an integer and reads it
                System.out.println("Enter the second number in the sequence: "); //prompt second number
                int b = myScanner.nextInt(); //specifies the input type to be an integer and reads it
                System.out.println("Enter the number of terms you want: "); //prompt for the number of terms
                int tn = myScanner.nextInt(); //specifies the input type to be an integer and reads it
                long[] series = new long[tn];
                series[0] = a;
                series[1] = b;
                
                for (int i = 2; i < tn; i++) {
                series[i] = series[i - 1] + series[i - 2];
                    }
                    
                System.out.print(Arrays.toString(series) + "\n");    
        
   	 } //end of main method
   	 
} //end of class
