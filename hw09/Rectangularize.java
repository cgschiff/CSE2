// Connor Schiff
// CSE 002 HW 09
// Rectangularize.java

import java.util.*;

public class Rectangularize{
        
        public static void Rectangularize(int input){
            for(int i=0; i<input; i++){
                for(int j=0; j<input; j++){
                    System.out.print("%");
                }
                System.out.println("");
            }
        }
        
        public static void Rectangularize(String input){
            for(int i=0; i<input.length(); i++){
                System.out.println(input);
            }
        }
        
        public static void typeDecision(){
            Scanner inScanner = new Scanner(System.in); //initialize the scanner
            System.out.println("Enter a word or an integer?"); //prompt for box choice
            if(inScanner.hasNextInt()){
                int intInput = inScanner.nextInt();
                Rectangularize(intInput);
            }
            else{
                String stringInput = inScanner.nextLine();
                Rectangularize(stringInput);
                
            }
        }
    
   		public static void main(String[] args) {
   		    typeDecision();
   	 } //end of main method
   	 
} //end of class
