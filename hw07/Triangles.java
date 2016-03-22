// Connor Schiff
// CSE 002 HW 07
// Triangles.java: Program to generate a triangle of numbers given an int between 5 and 30

import java.util.Scanner;

public class Triangles{
   			public static void main(String[] args) {
   			    
   			    Scanner input = new Scanner(System.in); //initialize the scanner

                    //an integer to store the user input
                    int trinum = 0;
                    
                    //a boolean to decide if you want to ask again
                    boolean acceptable = false;
                    boolean integer = false;
                    
                    //loop until you get acceptable input
                    System.out.print("Enter a number between 5 and 30: "); //prompt for the length
                    while( !acceptable ){
                        if (input.hasNextInt()){
                        integer = true;
                        while(integer){
                        trinum = input.nextInt();
                            if(trinum<=30 && trinum>=5){
                            acceptable = true;
                            }
                            else{
                            System.out.println("   ERROR: need an integer between 5 and 30");
                            System.out.println("Enter the number you would like: "); //prompt for the length
                            }
                        }
                        }
                        else{
                        //if not, trash it.  This does not assign the output of 
                        //next() to anything. The output is just discarded.
                        System.out.println("   ERROR: need an integer between 5 and 30");
                        System.out.println("Enter the number you would like: "); //prompt for the length
                        // input.next();
                        }
                    }
                    
                int i;
                int j;
                int k;
                    
                //printing statements
                System.out.println();
                System.out.println("For Loop:");
                    for(j=1; j<=trinum; j++){
                        for(k=j; k>=1; k--){
                            System.out.print(j);
                        }
                        System.out.println();
                    }
                    for(j=(trinum-1); j>=1; j--){
                        for(k=j; k>=1; k--){
                            System.out.print(j);
                        }
                        System.out.println();
                    }
                    
                    System.out.println();
                    System.out.println("While Loop:");
                    j=1;
                    while(j<trinum){
                        k=j;
                        while(k>=1){
                            System.out.print(j);
                            k--;
                        }
                        j++;
                        System.out.println();
                    }
                    while(j>=1){
                        k=j;
                        while(k>=1){
                            System.out.print(j);
                            k--;
                        }
                        j--;
                        System.out.println();
                    }

                    System.out.println();
                    System.out.println("Do While Loop:");
                    j=1;
                    do{
                        k=j;
                        do{
                            System.out.print(j);
                            k--;
                        } while(k>=1);
                        j++;
                        System.out.println();
                    } while(j<trinum);
                    
                    do{
                        k=j;
                        do{
                            System.out.print(j);
                            k--;
                        }while(k>=1);
                        j--;
                        System.out.println();
                    }while(j>=1);
                    System.out.println();
                
   	 } //end of main method
   	 
} //end of class


