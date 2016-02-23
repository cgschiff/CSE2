// Connor Schiff
// CSE 002 HW 04
// Converts Decimal numbers to Hexadecimal

import java.util.*;

public class ToHex{
   			public static void main(String[] args) {
   			    
   			    Scanner myScanner = new Scanner( System.in ); //initialize the scanner
                System.out.print("Enter the red number up to 255: "); //prompt for R
                int R = myScanner.nextInt(); //read the int for the red part of the RGB\
                System.out.print("Enter the green number up to 255: "); //prompt for G
                int G = myScanner.nextInt(); //read the int for the green part of the RGB
                System.out.print("Enter the blue number up to 255: "); //prompt for B
                int B = myScanner.nextInt(); //read the int for the blue part of the RGB
                
                if((R>255) || (R<0) || (G>255) || (G<0) || (B>255) || (B<0)){
                    System.out.println("Bad input: Enter only integers from 0 to 255");
                }
                
                else if((R<255) || (R>0) || (G<255) || (G>0) || (B<255) || (B>0)){
                    
                String R1= Integer.toString(((R/16)-((R%16)/16))); //convert to the number of times 16 goes into the number
                String G1= Integer.toString(((G/16)-((G%16)/16))); //convert to the number of times 16 goes into the number
                String B1= Integer.toString(((B/16)-((B%16)/16))); //convert to the number of times 16 goes into the number
                
                String R2= Integer.toString(R%16); //takes the remainder
                String G2= Integer.toString(G%16); //takes the remainder
                String B2= Integer.toString(B%16); //takes the remainder
                
                if(R1.equals("10")){
                    R1="A";
                }
                else if(R1.equals("11")){
                    R1="B";
                }
                else if(R1.equals("12")){
                    R1="C";
                }
                else if(R1.equals("13")){
                    R1="D";
                }
                else if(R1.equals("14")){
                    R1="E";
                }
                else if(R1.equals("15")){
                    R1="F";
                }
                else{
                    R1=R1;
                }
                
                if(G1.equals("10")){
                    G1="A";
                }
                else if(G1.equals("11")){
                    G1="B";
                }
                else if(G1.equals("12")){
                    G1="C";
                }
                else if(G1.equals("13")){
                    G1="D";
                }
                else if(G1.equals("14")){
                    G1="E";
                }
                else if(G1.equals("15")){
                    G1="F";
                }
                else{
                    G1=G1;
                }
                
                if(B1.equals("10")){
                    B1="A";
                }
                else if(B1.equals("11")){
                    B1="B";
                }
                else if(B1.equals("12")){
                    B1="C";
                }
                else if(B1.equals("13")){
                    B1="D";
                }
                else if(B1.equals("14")){
                    B1="E";
                }
                else if(B1.equals("15")){
                    B1="F";
                }
                else{
                    B1=B1;
                }
                
                if(R2.equals("10")){
                    R2="A";
                }
                else if(R2.equals("11")){
                    R2="B";
                }
                else if(R2.equals("12")){
                    R2="C";
                }
                else if(R2.equals("13")){
                    R2="D";
                }
                else if(R2.equals("14")){
                    R2="E";
                }
                else if(R2.equals("15")){
                    R2="F";
                }
                else{
                    R2=R2;
                }
                
                if(G2.equals("10")){
                    G2="A";
                }
                else if(G2.equals("11")){
                    G2="B";
                }
                else if(G2.equals("12")){
                    G2="C";
                }
                else if(G2.equals("13")){
                    G2="D";
                }
                else if(G2.equals("14")){
                    G2="E";
                }
                else if(G2.equals("15")){
                    G2="F";
                }
                else{
                    G2=G2;
                }
                
                if(B2.equals("10")){
                    B2="A";
                }
                else if(B2.equals("11")){
                    B2="B";
                }
                else if(B2.equals("12")){
                    B2="C";
                }
                else if(B2.equals("13")){
                    B2="D";
                }
                else if(B2.equals("14")){
                    B2="E";
                }
                else if(B2.equals("15")){
                    B2="F";
                }
                else{
                    B2=B2;
                }

                String RGB = R1 + R2 + G1 + G2 + B1 + B2; //defines the Hexadecimal version of the numbers
                System.out.println("The hexadecimal of your RGB is: " + RGB);
                
                } //end of else if statement
                
              else{
                  System.out.println("Bad input: Enter only integers");
              }  
              
                
            }  //end of main method   
            
    } //end of class