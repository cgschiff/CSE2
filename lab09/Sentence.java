// Connor Schiff
// CSE 002 Lab 07
// Bowtie.java: Program to generate a bow tie

import java.util.*;

public class Sentence{
    
        public static String adjectiveGen(int randGen1) {
            String adj = "";
            switch (randGen1) {
            case 1:  adj = "simple";
                     break;
            case 2:  adj = "quick";
                     break;
            case 3:  adj = "slow";
                     break;
            case 4:  adj = "gross";
                     break;
            case 5:  adj = "filthy";
                     break;
            case 6:  adj = "stunning";
                     break;
            case 7:  adj = "entrancing";
                     break;
            case 8:  adj = "supple";
                     break;
            case 9:  adj = "wise";
                     break;
            default: adj = "Random adj Gen not working";
                     break;
             }
             return adj;
        }
        public static String subjectGen(int randGen2) {
            String subject = "";
            switch (randGen2) {
            case 1:  subject = "dog";
                     break;
            case 2:  subject = "rock";
                     break;
            case 3:  subject = "river";
                     break;
            case 4:  subject = "building";
                     break;
            case 5:  subject = "bagel";
                     break;
            case 6:  subject = "person";
                     break;
            case 7:  subject = "computer";
                     break;
            case 8:  subject = "table";
                     break;
            case 9:  subject = "desk";
                     break;
            default: subject = "Random object Gen not working";
                     break;
             }
             return subject;
        }
        public static String verbGen(int randGen3) {
            String verb = "";
            switch (randGen3) {
            case 1:  verb = "snatched";
                     break;
            case 2:  verb = "took";
                     break;
            case 3:  verb = "wrecked";
                     break;
            case 4:  verb = "coded";
                     break;
            case 5:  verb = "broke";
                     break;
            case 6:  verb = "fixed";
                     break;
            case 7:  verb = "stole";
                     break;
            case 8:  verb = "glossed over";
                     break;
            case 9:  verb = "messed with";
                     break;
            default: verb = "Random verb Gen not working";
                     break;
             }
             return verb;
        }
        public static String objectGen(int randGen4) {
            String object = "";
            switch (randGen4) {
            case 1:  object = "dog";
                     break;
            case 2:  object = "rock";
                     break;
            case 3:  object = "river";
                     break;
            case 4:  object = "building";
                     break;
            case 5:  object = "bagel";
                     break;
            case 6:  object = "person";
                     break;
            case 7:  object = "computer";
                     break;
            case 8:  object = "table";
                     break;
            case 9:  object = "desk";
                     break;
            default: object = "Random object Gen not working";
                     break;
             }
             return object;
        }
    
   		public static void main(String[] args) {
   		    Random randomGenerator = new Random();
   		    int random1 = 1+randomGenerator.nextInt(9);
   		    int random2 = 1+randomGenerator.nextInt(9);
   		    int random3 = 1+randomGenerator.nextInt(9);
   		    int random4 = 1+randomGenerator.nextInt(9);
   		    int random5 = 1+randomGenerator.nextInt(9);

            String finAdjective1 = adjectiveGen(random1);
            String finAdjective2 = adjectiveGen(random5);
            String finSubject = subjectGen(random2);
            String finVerb = verbGen(random3);
            String finObject = objectGen(random4);
            
            System.out.println("The "+finAdjective1+" "+finSubject+" "+finVerb+" the "+finAdjective2+" "+finObject);
  
   	 } //end of main method
   	 
} //end of class
