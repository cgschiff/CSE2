// Connor Schiff
// CSE 002 HW 09
// Games.java

import java.util.*;

public class Games{
    
        public static void guessTheBox() {
            boolean goodBoxChoice = false;
            boolean stopBox = false;
            
            Scanner choiceScanner = new Scanner(System.in); //initialize the scanner
            System.out.println("Choose a box: 1, 2, or 3?"); //prompt for box choice
            
                if(choiceScanner.hasNextInt() && !stopBox){
                    goodBoxChoice = true;
                }
            while(goodBoxChoice){ 
                int boxChoice=choiceScanner.nextInt();
                int boxPrize=(int)(Math.random()*3);
                if(boxChoice==1 || boxChoice==2 || boxChoice==3){
                        if(boxPrize==boxChoice){
                            System.out.println("You win the prize!");
                            goodBoxChoice = false;
                        }
                        else{
                            System.out.println("Sorry, no prize!");
                            goodBoxChoice = false;
                        }
                }
                else{
                        System.out.println("There are only 3 boxes!");
                }
            }
        }
        
        public static String roulette(int randInput){
            String winningSection = "";
            switch(randInput){
                case 1:
                    winningSection="red 1";
                    break;
                case 2:
                    winningSection="red 2";
                    break;
                case 3:
                    winningSection="red 3";
                    break;
                case 4:
                    winningSection="red 4";
                    break;
                case 5:
                    winningSection="red 5";
                    break;
                case 6:
                    winningSection="black 1";
                    break;
                case 7:
                    winningSection="black 2";
                    break;
                case 8:
                    winningSection="black 3";
                    break;
                case 9:
                    winningSection="black 4";
                    break;
                case 10:
                    winningSection="black 5";
                    break;
                default:
                    winningSection="invalid: no section win";
            }
            return winningSection; 
        }
        
        public static void spinTheWheel() {
            boolean goodSecChoice = false;
            boolean stopWheel = false;
            
            Scanner choiceScanner = new Scanner(System.in); //initialize the scanner
            System.out.println("Choose a color (red or black) and a number (1-5)"); //prompt for box choice

            while(!goodSecChoice){ 
                String secChoice=choiceScanner.nextLine();
                String secPrize=roulette((int)(Math.random()*10));
                if(secChoice.equalsIgnoreCase("red 1") ||
                secChoice.equalsIgnoreCase("red 2") ||
                secChoice.equalsIgnoreCase("red 3") ||
                secChoice.equalsIgnoreCase("red 4") ||
                secChoice.equalsIgnoreCase("red 5") ||
                secChoice.equalsIgnoreCase("black 1") ||
                secChoice.equalsIgnoreCase("black 2") ||
                secChoice.equalsIgnoreCase("black 3") ||
                secChoice.equalsIgnoreCase("black 4") ||
                secChoice.equalsIgnoreCase("black 5")){
                        if(secPrize.equalsIgnoreCase(secChoice)){
                            System.out.println("You win the prize!");
                            goodSecChoice = true;
                        }
                        else{
                            System.out.println("Sorry, no prize!");
                            goodSecChoice = true;
                        }
                }
                else{
                        System.out.println("Invalid Box Choice!");
                }
            }
        }
        
        public static void scrambler() {
            Scanner wordScanner = new Scanner(System.in); //initialize the scanner
            System.out.println("Enter a word to be scrambled:"); //prompt for box choice
            
                String wordChoice=wordScanner.nextLine();
                System.out.println("Scrambling...");
                    int i = 0;
                    while (i < wordChoice.length()*3) {
                        int randChar = (int)(Math.random()*wordChoice.length());
                        String part1 = wordChoice.substring(0,randChar);
                        String part2 = wordChoice.substring(randChar,wordChoice.length());
                        wordChoice = part2 + part1;
                        i++;
                    }
                    System.out.println(wordChoice);
                    //stopScramb=true;
                }
    
   		public static void main(String[] args) {
   		    boolean goodChoice=false;
   		    boolean stopGame=false;
   		    
   		    while(!goodChoice && !stopGame){
   		        
   		    System.out.println("Welcome to Connor Schiff's Game Center!");
   		    System.out.println("Choose a game: Guess the Box, Spin the Wheel, or Scrambler:"); //prompt for game choice
   		    
   		    Scanner choiceScanner = new Scanner(System.in); //initialize the scanner
            String gameChoice=choiceScanner.nextLine();
            
   		    if(gameChoice.equalsIgnoreCase("guess the box")){
   		        goodChoice=true;
   		        while(!stopGame){
   		        guessTheBox();
   		        System.out.println("Do you want to continue? (Y)");
                String contChoice=choiceScanner.nextLine();
                    if(contChoice.equalsIgnoreCase("y")){
                        stopGame=false;
                    }
                    else{
                        stopGame=true;
                    }
                }
   		    }
   		    else if(gameChoice.equalsIgnoreCase("spin the wheel")){
   		        goodChoice=true;
   		        while(!stopGame){
   		        spinTheWheel();
   		        System.out.println("Do you want to continue? (Y)");
                String contChoice=choiceScanner.nextLine();
                    if(contChoice.equalsIgnoreCase("y")){
                        stopGame=false;
                    }
                    else{
                        stopGame=true;
                    }
                }
   		    }
   		    else if(gameChoice.equalsIgnoreCase("scrambler")){
   		        goodChoice=true;
   		        while(!stopGame){
   		        scrambler();
   		        System.out.println("Do you want to continue? (Y)");
                String contChoice=choiceScanner.nextLine();
                    if(contChoice.equalsIgnoreCase("y")){
                        stopGame=false;
                    }
                    else{
                        stopGame=true;
                    }
                }
   		    }
   		    else{
   		        System.out.println("Invalid input: We don't have that game.");
   		    }

   		    }
   		    
   	 } //end of main method
   	 
} //end of class
