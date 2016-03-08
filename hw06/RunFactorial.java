// Connor Schiff
// CSE 002 HW06
// RunFactorial.java: Program to find the factorial of a given number

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class RunFactorial{
   			public static void main(String[] args) {
   			    int k=0;
   			    Scanner myScanner = new Scanner(System.in); //initialize the scanner
                System.out.println("Enter a number between 9 and 16: "); //prompt first number
          while(k<1){      
            if(myScanner.hasNextInt()){
                    int a = myScanner.nextInt();
                    if(a>9 && a<16){
                    int i=a;
                    int a1=a;
                    int j=i-1;
                    System.out.println("Input Accepted: ");
                        while(j>0){
                        i=i*j;
                        j--;
                        }
                    System.out.println(a1+"! = "+i);
                    return;
                }
                else{
                    System.out.println("Bad input, enter only integers between 9 and 16: ");
                    if(myScanner.hasNextInt()){
                        a = myScanner.nextInt();
                        if(a>9 && a<16){
                        int i=a;
                        int a1=a;
                        int j=i-1;
                        System.out.println("Input Accepted: ");
                            while(j>0){
                                i=i*j;
                                j--;
                            }
                        System.out.println(a1+"! = "+i);
                        return;
                    }
                    else{
                        System.out.println("Bad input, enter only integers between 9 and 16: ");
                        }
                    }
                }
            }
        }
        
   	 } //end of main method
   	 
} //end of class
