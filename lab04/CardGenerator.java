// Connor Schiff
// CSE 002 Lab 04
// Generates a random card from a deck of playing cards

import java.util.*;

public class CardGenerator{
   			public static void main(String[] args) {
   			    
   			    int num=(int)((Math.random()*52)+1); //generates a random number from 1 to 52
   			    int numinsuit=num%13; //finds the number that that number is within the suit of 13
   			    String suit = new String ("");
   			    
   			    if(num>=1 && num<=13){
   			        suit = "spades";
   			    }
   			    else if(num>=14 && num <=26){
   			        suit = "clubs";
   			    }
   			    else if(num>=27 && num<=39){
   			        suit = "hearts";
   			    }
   			    else if(num>=40 && num<=52){
   			        suit = "diamonds";
   			    }
                
                switch(numinsuit){
                    case 1:
                        System.out.println("You drew the " + "Ace of " + suit);
                    break;
                    case 2:
                        System.out.println("You drew the " + "two of " + suit);
                    break;
                    case 3:
                        System.out.println("You drew the " + "three of " + suit);
                    break;
                    case 4:
                        System.out.println("You drew the " + "four of " + suit);
                    break;
                    case 5:
                        System.out.println("You drew the " + "five of " + suit);
                    break;
                    case 6:
                        System.out.println("You drew the " + "six of " + suit);
                    break;
                    case 7:
                        System.out.println("You drew the " + "seven of " + suit);
                    break;
                    case 8:
                        System.out.println("You drew the " + "eight of " + suit);
                    break;
                    case 9:
                        System.out.println("You drew the " + "nine of " + suit);
                    break;
                    case 10:
                        System.out.println("You drew the " + "ten of " + suit);
                    break;
                    case 11:
                        System.out.println("You drew the " + "Jack of " + suit);
                    break;
                    case 12:
                        System.out.println("You drew the " + "Queen of " + suit);
                    break;
                    case 13:
                        System.out.println("You drew the " + "King of " + suit);
                    break;
                }
                
            }  //end of main method   
    } //end of class