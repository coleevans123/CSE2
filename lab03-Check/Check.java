//Cole Evans
//lab03 Check
//Check program
// Program takes bill from user
// takes the tip percentage from user
// splits bill between how many people there are

import java.util.Scanner;

    public class Check {
        // method required for every program
        public static void main(String[] args) {
            
            Scanner myScanner = new Scanner( System.in);
            
            System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx.xx):  ");
            double tipPercent = myScanner.nextDouble();//prompting the user to input the tip percentage 
            
            System.out.print("Enter the original cost of the check (in the form of xx.xx):   ");
            double checkCost = myScanner.nextDouble();//promtping the user to input the cost of the check
            
            System.out.print("Enter the number of people who went out to dinner: ");
            int numPeople = myScanner.nextInt();//prompting the user to input the amount of people out to dinner
            tipPercent /= 100; //We want to convert the percentage into a decimal value
            
            double totalCost;// the total cost of check including the tip
            double costPerPerson;//how much each person has to pay including tip
            int dollars,   //whole dollar amount of cost 
             dimes, pennies; //for storing digits
          //to the right of the decimal point 
          //for the cost$ 
totalCost = checkCost * (1 + tipPercent);//cost of check times the tip percentage + the orginal cost of check
costPerPerson = totalCost / numPeople;//get the whole amount, dropping decimal fraction

dollars=(int)costPerPerson;// the dollars that each person must pay not including cents

dimes=(int)(costPerPerson * 10) % 10;// the tenth place of cents for the total cost
pennies=(int)(costPerPerson * 100) % 10;// the ones place of cents for the total cost
System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);


            
            
            
        }//end of class
        
    }// end of program