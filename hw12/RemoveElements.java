import java.util.Scanner;
public class RemoveElements{
    
    public static String listArray(int num[]){
	String out="{";
	    for(int j=0;j<num.length;j++){
  	        if(j>0){
    	        out+=", ";
  	        }
  	        out+=num[j];
	    }
	    out+="} ";
	    return out;
  }
  
  public static int[] delete(int[] list, int pos){
      int[] list2=new int[list.length-1];
      for(int i=0; i<list.length; i++){
          if(i==pos){
              for(int j=pos; j<list.length-1; j++){
                list[j]=list[j+1];
              }
              for(int k = 0; k<list2.length; k++){
                  list2[k]=list[k];
            }
          }
          else{
          }
      }
      return list2;
  }
  
  public static int[] remove(int[] list, int target){
      int targetCounter=0;
      for(int i=0; i<list.length; i++){
          if(list[i]==target){
              targetCounter++;
          }
          else{
          }
      }
      int[] list2=new int[list.length-targetCounter];
      for(int i=0; i<list.length; i++){
          if(list[i]==target){
              for(int j=i; j<list.length-targetCounter; j++){
                list[j] = list[j+1];
                for(int k = 0; k<list2.length; k++){
                  list2[k]=list[k];
                }
              }
          }
          else{
          }
      }
      return list2;
  }
  
  public static int[] randomInput(){
      int randomArray[] = new int[10];
      for(int i=0; i<randomArray.length-1; i++){
          int randomNum=(int)(Math.random()*15);
          randomArray[i]=randomNum;
      }
      return randomArray;
  }
    
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
    int temp = 0;
  	System.out.print("Enter the index ");
  	Scanner indexScanner = new Scanner(System.in); //initialize the scanner
    boolean goodInput=false;
    while(!goodInput){
        if(indexScanner.hasNextInt()){
            temp=indexScanner.nextInt();
            if(temp<0 || temp>9){
                System.out.println("Integer must be between 0 and 9 inclusive.");
            }
            else{
                goodInput=true;
                break;
            }
        }
        else{
            System.out.println("Enter only integers.");
            indexScanner.next();
        }
    }
    index = temp;
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
  
}
