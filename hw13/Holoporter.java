//Connor Schiff
//CSE 002 HW13
//Holoporter

import java.util.*;

public class Holoporter {
    
    public static String[][][] soRandom(){
        Random xGenerator = new Random();
   		int x = 1+xGenerator.nextInt(9);
        String threeArray[][][] = new String[x][][];
        for(int i = 0; i<x; i++){
            Random yGenerator = new Random();
   		    int y = 1+yGenerator.nextInt(9);
   		    String twoArray[][] = new String[y][];
   		    threeArray[i]=twoArray;
            for(int j = 0; j<y; j++){
                Random zGenerator = new Random();
   		        int z = 1+zGenerator.nextInt(9);
   		        String oneArray[]=new String[z];
   		        twoArray[j]=oneArray;
   		        for(int f = 0; f<z; f++){
   		            oneArray[f]=coder();
   		        }
            }
        }
        return threeArray;
    } //end of soRandom method
    
    public static void print(String[][][] Array){
        for(int i = 0; i<Array.length; i++){
            for(int j = 0; j<Array[i].length; j++){
                System.out.print("[");
   		        for(int k = 0; k<Array[i][j].length; k++){
   		            if(k<Array[i][j].length-1){
   		                System.out.print(Array[i][j][k]+", ");
   		            }
   		            else{
   		                System.out.print(Array[i][j][k]);
   		            }
   		        }
   		        System.out.println("]");
            }
        }
    } //end of print method
    
    public static String letterGen(int randGen1) {
            String letter = "";
            switch (randGen1) {
            case 1:  letter = "A";
                     break;
            case 2:  letter = "B";
                     break;
            case 3:  letter = "C";
                     break;
            case 4:  letter = "D";
                     break;
            case 5:  letter = "E";
                     break;
            case 6:  letter = "F";
                     break;
            case 7:  letter = "G";
                     break;
            case 8:  letter = "H";
                     break;
            case 9:  letter = "I";
                     break;
            case 10: letter = "J";
                     break;
            case 11: letter = "K";
                     break;
            case 12:  letter = "L";
                     break;
            case 13:  letter = "M";
                     break;
            case 14:  letter = "N";
                     break;
            case 15:  letter = "O";
                     break;
            case 16:  letter = "P";
                     break;
            case 17:  letter = "Q";
                     break;
            case 18:  letter = "R";
                     break;
            case 19:  letter = "S";
                     break;
            case 20: letter = "T";
                     break;
            case 21: letter = "U";
                     break;
            case 22:  letter = "V";
                     break;
            case 23:  letter = "W";
                     break;
            case 24:  letter = "X";
                     break;
            case 25:  letter = "Y";
                     break;
            case 26:  letter = "Z";
                     break;
            default: letter = "Random letter generator not working";
                     break;
             }
             return letter;
        }
    
    public static String coder(){
        String codeOut="";
        for(int i=1; i<=6; i++){
            if(i==1 || i==2){
                Random letterNum = new Random();
   		        int letterPlace = 1+letterNum.nextInt(26);
                String charIn = letterGen(letterPlace);
                codeOut=codeOut+charIn;
            }
            if(i>=3 && i<=6){
                Random numGen = new Random();
   		        int numIn = numGen.nextInt(10);
   		        codeOut=codeOut+numIn;
            }
        }
        return codeOut;
    }
    
    public static void sampling(String[][][] array, String input){
        boolean goodInput = false;
        /* int x = 0;
        int y = 0;
        int z = 0;*/
            if(input.length()==6){
                char char1 = input.charAt(0);
                char char2 = input.charAt(1);
                char char3 = input.charAt(2);
                char char4 = input.charAt(3);
                char char5 = input.charAt(4);
                char char6 = input.charAt(5);
                if(Character.isLetter(char1) && Character.isLetter(char2) && Character.isDigit(char3) && Character.isDigit(char4) && Character.isDigit(char5) && Character.isDigit(char6)){
                    goodInput=true;
                }
            }
            if(!goodInput){
                System.out.println("Input Invalid.");
            }
            else{
                for(int i = 0; i<array.length; i++){
                    for(int j = 0; j<array[i].length; j++){
                        for(int k = 0; k<array[i][j].length; k++){
                            if(array[i][j][k].equals(input)){
                                System.out.println("Target found at ("+i+", "+j+", "+k+")");
                            }
                            if(i==array.length-1 && j==array[i].length-1 && k==array[i][j].length-1){
                                System.out.println("Target not found in array.");
                            }
                        }
                    }
                }
            }
        }
    
    public static String[][][] frankenstein(String[][][] array){
        //sort the array by length
                for (int i = 0; i < array.length; i++) {
                    for(int j = 0; j < array[i].length; j++){
                        for (int k = i + 1; k < array[i].length; k++) {
                                if (array[i][j].length > array[i][k].length) {
                                    String[] holder = new String[array[i][j].length];
                                    holder = array[i][j];
                                    array[i][j]=array[i][k];
                                    array[i][k]=holder;
                                }
                            }
                        }
                }
            return array;
    }    
    
    public static void percentage(String[][][] original, String[][][] second){
        int numOriginal=0;
        int numSecond=0;
        int percentage=0;
        int difference=0;
        for(int i = 0; i<original.length; i++){
            for(int j = 0; j<original[i].length; j++){
                for(int k = 0; k<original[i][j].length; k++){
                    numOriginal++;
                }
            }
        }
        for(int i = 0; i<second.length; i++){
            for(int j = 0; j<second[i].length; j++){
                for(int k = 0; k<second[i][j].length; k++){
                    numSecond++;
                }
            }
        }
        if(numSecond>numOriginal){
            percentage=100;
        }
        else{
            difference=numSecond-numOriginal;
            percentage=difference*100/numOriginal;
        }
        System.out.println(numSecond+" of "+numOriginal+" elements.");
        System.out.println("The holoported array contains "+percentage+"% of the original.");
    }
    
    public static String[][][] holoport(String[][][] array, String[][][] holder){
        if(array.length>holder.length){
            for(int i = 0; i<holder.length; i++){
                if(array[i].length>holder[i].length){
                    for(int j = 0; j<holder[i].length; j++){
                        if(array[i][j].length>holder[i][j].length){
                            for(int k = 0; k<holder[i][j].length; k++){
                                holder[i][j][k]=array[i][j][k];
                            }
                        }
                        else{
                            for(int k = 0; k<array[i][j].length; k++){
                                holder[i][j][k]=array[i][j][k];
                            }
                            for(int k = array[i][j].length; k<holder[i][j].length; k++){
                                holder[i][j][k]="$$$$$$";
                            }
                        }
                    }
                }
                else{
                    for(int j = 0; j<array[i].length; j++){
                        if(array[i][j].length>holder[i][j].length){
                            for(int k = 0; k<holder[i][j].length; k++){
                                holder[i][j][k]=array[i][j][k];
                            }
                        }
                        else{
                            for(int k = 0; k<array[i][j].length; k++){
                                holder[i][j][k]=array[i][j][k];
                            }
                            for(int k = array[i][j].length; k<holder[i][j].length; k++){
                                holder[i][j][k]="$$$$$$";
                            }
                        }
                    }
                    for(int j = array[i].length; j<holder[i].length; j++){
                        for(int k = 0 ; k<holder[i][j].length; k++){
                            holder[i][j][k]="$$$$$$";
                        }
                    }
                }
            }
        }
        else{
            for(int i = 0; i<array.length; i++){
                if(array[i].length>holder[i].length){
                    for(int j = 0; j<holder[i].length; j++){
                        if(array[i][j].length>holder[i][j].length){
                            for(int k = 0; k<holder[i][j].length; k++){
                                holder[i][j][k]=array[i][j][k];
                            }
                        }
                        else{
                            for(int k = 0; k<array[i][j].length; k++){
                                holder[i][j][k]=array[i][j][k];
                            }
                            for(int k = array[i][j].length; k<holder[i][j].length; k++){
                                holder[i][j][k]="$$$$$$";
                            }
                        }
                    }
                }
                else{
                    for(int j = 0; j<array[i].length; j++){
                        if(array[i][j].length>holder[i][j].length){
                            for(int k = 0; k<holder[i][j].length; k++){
                                holder[i][j][k]=array[i][j][k];
                            }
                        }
                        else{
                            for(int k = 0; k<array[i][j].length; k++){
                                holder[i][j][k]=array[i][j][k];
                            }
                            for(int k = array[i][j].length; k<holder[i][j].length; k++){
                                holder[i][j][k]="$$$$$$";
                            }
                        }
                    }
                    for(int j = array[i].length; j<holder[i].length; j++){
                        for(int k = 0 ; k<holder[i][j].length; k++){
                            holder[i][j][k]="$$$$$$";
                        }
                    }
                }
            }
        }
        return holder;
    }
    
    //main method
    public static void main(String[] args){
        String[][][] arrayIn = soRandom();
        String[][][] holder = soRandom();
        //print(arrayIn);
        //System.out.println("------------------------------");
        //print(holder);
        //System.out.println("------------------------------");
        String[][][] holoported = holoport(holder, arrayIn);
        print(holoported);
        System.out.println("------------------------------");
        percentage(holder, holoported);
        System.out.println("------------------------------");
        sampling(holoported, "AB1234");
        frankenstein(holoported);
        
    } // end of main method
            
} //end of class