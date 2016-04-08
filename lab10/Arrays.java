//Connor Schiff
//CSE 002 Lab 10
//Arrays
//Array Practice

import java.util.*;

public class Arrays {
    //main method
        public static void main(String[] args){
            
            String[] students;
            int[] midterm;
            
            Random randomGenerator = new Random();
            int randomSize = 5+randomGenerator.nextInt(5);
            
            
            students = new String[randomSize];
            midterm = new int[randomSize];
            
            //name the students
            for(int i = 0; i<randomSize; i++){
                Scanner nameScanner = new Scanner(System.in); //initialize the scanner
                System.out.print("Enter the name of student No."+ (i+1) + ": ");
                students[i]=nameScanner.next();
            }
            
            //assign the grades
            for(int j = 0; j<randomSize; j++){
                Random gradeGenerator = new Random();
                midterm[j]=gradeGenerator.nextInt(100);
            }
            
            //print statements
            System.out.println("******************************");
            for(int k = 1; k<randomSize; k++){
                System.out.println(students[k] + " received a grade of " + midterm[k]);
            }

        
    } //end of main method
} //end of class