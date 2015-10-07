//Cole Evans
//hw06
//check digit program
//checks if a ISBN is valid

import java.util.Scanner;

public class CheckDigit {
    
    public static void main(String[]args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Please enter valid a 10 digit barcode: ");
            
            long barcode = 0;
            int length = 0;
            boolean z = true;
            while(z) {
                if(myScanner.hasNextLong()) {
                 barcode = myScanner.nextLong(); 
                 length = String.valueOf(barcode).length();
                if (length == 10) {
                    z = false;
                }  else {
                    System.out.println("ISBN is not valid");
                }
                } else {
                    System.out.println("ISBN is not valid");
                    myScanner.next();
                }
            }
            long first = barcode/1000000000;
            long second = barcode/100000000 - (first*10);
            long third = barcode/10000000 - (first*100) - (second*10);
            long fourth = barcode/1000000 - (first*1000) - (second*100) - (third*10);
            long fifth = barcode/100000 - (first*10000) - (second*1000) - (third*100) - (fourth*10);
            long sixth = barcode/10000 - (first*100000) - (second*10000) - (third*1000) - (fourth*100) - (fifth*10);
            long seventh = barcode/1000 - (first*1000000) - (second*100000) - (third*10000) - (fourth*1000) - (fifth*100) - (sixth*10);
            long eigth = barcode/100 - (first*10000000) - (second*1000000) - (third*100000) - (fourth*10000) - (fifth*1000) - (sixth*100) - (seventh*10);
            long nineth = barcode/10 - (first*100000000) - (second*10000000) - (third*1000000) - (fourth*100000) - (fifth*10000) - (sixth*1000) - (seventh*100) - (eigth*10);
            long tenth = barcode - (first*1000000000) - (second*100000000) - (third*10000000) - (fourth*1000000) - (fifth*100000) - (sixth*10000) - (seventh*1000) - (eigth*100) - (nineth*10);
            
            long sum = (first*10) + (second*9) + (third*8) + (fourth*7) + (fifth*6) + (sixth*5) + (seventh*4) + (eigth*3) + (nineth*2);
            long remainder = sum % 11;
            
            if (remainder == tenth) {
                System.out.println(barcode + " is a valid ISBN");
            } else {
                System.out.println(barcode + " is not a valid ISBN");
            }
        
    }
}