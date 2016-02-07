//Connor Schiff
//CSE 002 HW 02
//Arithmetic
//Computes price with sales tax.

public class Arithmetic {
    //main method
    public static void main(String[] args){
    	
        int numPants = 3; //Number of pairs of pants
        double pantsPrice = 34.98; //Cost per pair of pants
        int numShirts = 2; //Number of sweatshirts
        double shirtPrice = 24.99; //Cost per shirtPrice
        int numBelts = 1; //Number of belts
        double beltPrice = 33.99; //cost per box of envelopes
        double paSalesTax = 0.06; //the tax rate
        
        double dtotalCostOfPants = numPants*pantsPrice;   //total cost of pants
        double dtotalCostOfShirts = numShirts*shirtPrice; //total cost of shirts
        double dtotalCostOfBelts = numBelts*beltPrice; //total cost of belts
        double dsalesTaxPants = dtotalCostOfPants*paSalesTax; //tax on pants
        double dsalesTaxShirts = dtotalCostOfShirts*paSalesTax; //tax on shirts
        double dsalesTaxBelts = dtotalCostOfBelts*paSalesTax; //tax on belts
        double dtotalPreTax = dtotalCostOfPants+dtotalCostOfShirts+dtotalCostOfBelts; //total cost before tax
        double dtotalTax = dsalesTaxPants+dsalesTaxShirts+dsalesTaxBelts; //total amount of sales tax
        double dtotalWithTax = dtotalPreTax+dtotalTax; //total cost after tax

        double totalCostOfPants = (int)(dtotalCostOfPants*100)/100.0;
        double totalCostOfShirts = (int)(dtotalCostOfShirts*100)/100.0;
        double totalCostOfBelts = (int)(dtotalCostOfBelts*100)/100.0;
        double salesTaxPants = (int)(dsalesTaxPants*100)/100.0;
        double salesTaxShirts = (int)(dsalesTaxShirts*100)/100.0;
        double salesTaxBelts = (int)(dsalesTaxBelts*100)/100.0;
        double totalPreTax = (int)(dtotalPreTax*100)/100.0;
        double totalTax = (int)(dtotalTax*100)/100.0;
        double totalWithTax = (int)(dtotalWithTax*100)/100.0;

        System.out.println("The total cost of "+numPants+ " pairs of pants is $"+totalCostOfPants); //prints the number of pairs of pants and how much they cost.
        System.out.println("The total cost of "+numShirts+ " shirts is $"+totalCostOfShirts); //prints the number of shirts and how much they cost.
        System.out.println("The total cost of "+numBelts+ " belts is $"+totalCostOfBelts); //prints the number of belts and how much they cost.
        System.out.println("The total tax from "+numPants+ " pairs of pants is $"+salesTaxPants); //prints the number of pairs of pants and howm much tax there is.
        System.out.println("The total tax from "+numShirts+ " shirts is $"+salesTaxShirts); //prints the number of shirts and how much tax there is.
        System.out.println("The total tax from "+numBelts+ " belts is $"+salesTaxBelts); //prints the number of belts and how much tax there is.
        
        System.out.println(" The total cost before tax is $"+totalPreTax); //prints the total cost before tax.
        System.out.println(" The total tax is $"+totalTax); //prints the total tax.
        System.out.println(" The total with tax is $"+totalWithTax); //prints the total with tax.
        
    } //end of main method
} //end of class