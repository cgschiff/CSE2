//Connor Schiff
//CSE 002 HW12
//CSE 2 Grade Arrays

import java.util.*;
import java.util.Arrays;

public class CSE2Linear {
    
        //main method
        public static void main(String[] args){
            
            int[] grades;
            int[] temp;
            
            grades = new int[15];
            temp = new int[16];
            temp[0]=0;
            //midterm = new int[randomSize];
            
            for(int i = 0; i<15; i++){
                Scanner gradeScanner = new Scanner(System.in); //initialize the scanner
                System.out.print("Enter the grade of student No."+ (i+1) + ": ");
                boolean goodInput=false;
                while(!goodInput){
                if(gradeScanner.hasNextInt()){
                    temp[i+1]=gradeScanner.nextInt();
                    if(temp[i+1]<=0 || temp[i+1]>=100){
                    System.out.println("Integer must be between 0 and 100.");
                    }
                    else{
                        if(temp[i+1]<temp[i]){
                            System.out.println("Must be greater than the previous grade.");
                        }
                        else{
                            grades[i]=temp[i+1];
                            goodInput=true;
                        }
                    }
                }
                else{
                    System.out.println("Enter only integers.");
                    gradeScanner.next();
                }
            }
        }
            
            //print the grades
            for(int j = 0; j<15; j++){
                System.out. print(grades[j]+" ");
            }
            System.out.println("");
            
            //sort the grades
            Arrays.sort(grades);
            
            System.out.println("Sorted:");
            //print the sorted grades
            for(int g = 0; g<15; g++){
                System.out. print(grades[g]+" ");
            }
            System.out.println("");
            
                        //get the target of the search
            Scanner targetScanner = new Scanner(System.in); //initialize the scanner
            System.out.println("Enter a grade to search for:");
            int target = targetScanner.nextInt();
            
            //search for the target
            for(int k = 0; k<15; k++){
                if(grades[k]==target){
                    System.out.println("Target found after "+k+" iterations.");
                    break;
                }
                if(k==15){
                    System.out.println("Target not found after 15 iterations.");
                }
            }
            
            //scramble the grades
            for(int s = 0; s<15; s++){
                int scrambleNum=(int)(Math.random()*15);
                int replaceNum=grades[s];
                grades[s]=grades[scrambleNum];
                grades[scrambleNum]=replaceNum;
            }
            
            //print the scrambled grades
            System.out.println("Scrambled:");
            for(int p = 0; p<15; p++){
                System.out. print(grades[p]+" ");
            }
            System.out.println("");
            
            //get the target of the search
            System.out.println("Enter a grade to search for:");
            target = targetScanner.nextInt();
            
            //search for the target
            for(int k = 0; k<15; k++){
                if(grades[k]==target){
                    System.out.println("Target found after "+k+" iterations.");
                    break;
                }
                if(k==15){
                    System.out.println("Target not found after 15 iterations.");
                }
            }

    } //end of main method
} //end of class