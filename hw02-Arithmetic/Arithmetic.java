// Cole Evans
// hw02
// Arithmetic


 public class Arithmetic {
 
    public static void main(String[] args) {
    
//inputs   
    
    //Number of pairs of socks
int nSocks=3;
//Cost per pair of socks
//(‘$’ is part of the variable name)
double sockCost$=2.58;

//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost$=2.29;

//Number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25;
//the sales tax
double taxPercent=0.06;
//easier to use tax that includes original price
double taxPercentAll=1.06;
//calculations

//total cost for socks
double totalCostSocks$ = nSocks*sockCost$;
// total amount of sales tax for socks
double totalSocksTax = totalCostSocks$*taxPercent;

//total cost for drinking glasses
double totalGlassesCost$ = nGlasses*glassCost$;
//total sales tax for drinking glasses
double totalGlassesTax = totalGlassesCost$*taxPercent;

//total cost for box of envelopes
double totalEnvelopeCost$ = nEnvelopes*envelopeCost$;
//total sales tax for box of envelopes
double totalEnvelopeTax = totalEnvelopeCost$*taxPercent;

//total cost of all items before taxes
double totalCostAllItems = totalCostSocks$+totalEnvelopeCost$+totalGlassesCost$;
    totalCostAllItems = totalCostAllItems*100;
    double totalCostAllItems1 = (int)totalCostAllItems;
    double totalCostAllItems2 = totalCostAllItems1/100;

//total cost of all items including tax
double totalCostWithTax = totalCostAllItems2*taxPercentAll;
    totalCostWithTax = totalCostWithTax*100;
    double totalCostWithTax1 = (int)totalCostWithTax;
    double totalCostWithTax2 = totalCostWithTax1/100;
    
    double totalSalesTax = totalCostAllItems2*taxPercent;
    double totalSalesTax1 = totalSalesTax*10;
    double totalSalesTax2 = (int)totalSalesTax;
//print out the output data

int tSalesTax = (int)(totalSalesTax*100);
totalSalesTax = ((double)tSalesTax)/100.0;

    System.out.println("The amount of socks bought was " + nSocks + " and each cost " + sockCost$ + "$");
    
    System.out.println("The amount of drinking glasses bought was " + nGlasses + " and each cost " + glassCost$ + "$");
    System.out.println("The amount of boxes of envelopes bought was " + nEnvelopes + " and each cost " + envelopeCost$ + "$");
    
    System.out.println("The total cost for all socks is " + totalCostSocks$ + "$ and the sales tax is " + totalCostSocks$*taxPercentAll);
    
    System.out.println("The total cost for all drinking glasses is " + totalGlassesCost$ + "$ and the sales tax is " + totalGlassesCost$*taxPercentAll);
    System.out.println("The total cost for all envelopes is " + totalEnvelopeCost$ + "$ and the sales tax is " + totalEnvelopeCost$*taxPercentAll);
    
    System.out.println("The total cost for all items before tax is " + totalCostAllItems2 + "$");
    System.out.println("The total sales tax for all items is " + totalSalesTax + "$");
    System.out.println("The total cost for all items with tax is " + totalCostWithTax2 + "$");
    
    }
 }