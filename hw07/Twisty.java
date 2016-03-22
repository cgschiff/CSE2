// Connor Schiff
// CSE 002 HW 07
// Twisty.java: Program to generate a twist of hashtags and slashes of given length and width

import java.util.Scanner;

public class Twisty{
   			public static void main(String[] args) {
   			    
   			    Scanner input = new Scanner(System.in); //initialize the scanner

                    //an integer to store the user input
                    int tLength = 0;
                    int tWidth = 0;
                    
                    //a switch to decide if you want to ask again
                    boolean acceptablel = false;
                    boolean acceptablew = false;
                    
                    //loop until you get acceptable input
                    System.out.println("Enter the length of the Twist you would like: "); //prompt for the length
                    while( !acceptablel ){
                        if (input.hasNextInt()){
                        //if so, store it.
                        tLength = input.nextInt();
                            if(tLength<=80 && tLength>0){
                            acceptablel = true;
                            }
                            else{
                            System.out.println("   ERROR: need a positive integer length less than 80");
                            System.out.println("Enter the length of the Twist you would like: "); //prompt for the length
                            }
                        }
                        else{
                        //if not, trash it.  This does not assign the output of 
                        //next() to anything. The output is just discarded.
                        System.out.println("   ERROR: need a positive integer length less than 80");
                        System.out.println("Enter the length of the Twist you would like: "); //prompt for the length
                        // input.next();
                        }
                    }
                    
                    //loop until you get acceptable input
                    System.out.println("Enter the width of the Twist you would like: "); //prompt for the width
                    while( !acceptablew ){
                        if (input.hasNextInt()){
                        //if so, store it.
                        tWidth = input.nextInt();
                        if(tWidth<tLength){
                            acceptablew = true;
                            }
                            else{
                            System.out.println("   ERROR: need a positive integer width less than the length");
                            System.out.println("Enter the width of the Twist you would like: "); //prompt for the length
                            }
                        }
                        else{
                        //if not, trash it.  This does not assign the output of 
                        //next() to anything. The output is just discarded.
                        System.out.println("   ERROR: need a positive integer width less than the length");
                        System.out.println("Enter the width of the Twist you would like: "); //prompt for the length
                        // input.next();
                        }
                    }
                    
                int i = 0;
                int j = 0;
                    
                //printing statements
                for(i=0; i<tWidth; i++){
                    for(j=0; j<tLength; j++){
                        if(i==j%tWidth && j%(tWidth*2)<tWidth){
                            System.out.print("#");
                        }
                        else if((i+j%tWidth)%tWidth==tWidth-1 && j%(tWidth*2)<tWidth){
                            System.out.print("/");
                        }
                        else if(i==j%tWidth && j%(tWidth*2)>tWidth-1){
                            System.out.print("\\");
                        }
                        else if((i+j%tWidth)%tWidth==tWidth-1 && j%(tWidth*2)>tWidth-1){
                            System.out.print("#");
                        }
                        else{
                         System.out.print(" ");
                         }
                    }
                    System.out.println();
                }

   	 } //end of main method
   	 
} //end of class

