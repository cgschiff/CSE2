// Connor Schiff
// CSE 002 HW06
// TextSpinner.java: Program to display a spinner

import java.util.*;

public class TextSpinner{
   			public static void main(String[] args) {
   			    
   			    int i=1;
   			    
                while(i<=4){
                    if(i==1){
                        System.out.print("/");
                        System.out.print("\b");
                        i++;
                    }
                    else if(i==2){
                        System.out.print("-");
                        System.out.print("\b");
                        i++;
                    }
                    else if(i==3){
                        System.out.print("\\");
                        System.out.print("\b");
                        i++;
                    }
                    else if(i==4){
                        System.out.print("|");
                        System.out.print("\b");
                        i=1;
                    }
                } //end of while
        
   	 } //end of main method
   	 
} //end of class
