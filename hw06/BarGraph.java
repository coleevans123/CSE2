//Cole Evans
//hw06
//bar graph program
//takes the amount of dollars spent per week and makes a bar graph
//takes average spent in the week then adds it together over a 4 year period

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class BarGraph {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Enter amount spent on monday ($xx.xx): ");
        double monday = 0;
          boolean t = true;
        while (t) {
            if(myScanner.hasNextDouble()) {
                monday = myScanner.nextDouble();
                if(monday >= 0) {
                    t = false;
                } else {
                    System.out.println("input is a negative integer please enter correct input");
                     
                }
            } else {
                System.out.println("input is a negative integer please enter correct input");
                myScanner.next(); 
            }
        } t = true;
    
        System.out.print("Enter amount spent on tuesday ($xx.xx): ");
            double tuesday = 0;
        while (t) {
            if(myScanner.hasNextDouble()) {
                tuesday = myScanner.nextDouble();
                if(tuesday >= 0) {
                    t = false;
                } else {
                    System.out.println("input is a negative integer please enter correct input");
                }
            } else {
                System.out.println("input is a negative integer please enter correct input");
                myScanner.next(); 
            }
        } t = true;
            
        System.out.print("Enter amount spent on wednesday ($xx.xx): ");
            double wednesday = 0;
           t = true;
        while (t) {
            if(myScanner.hasNextDouble()) {
                wednesday = myScanner.nextDouble();
                if(wednesday >= 0) {
                    t = false;
                } else {
                    System.out.println("input is a negative integer please enter correct input");
                     
                }
            } else {
                System.out.println("input is a negative integer please enter correct input");
                myScanner.next(); 
            }
        } t = true;
            
        System.out.print("Enter amount spent on thursday ($xx.xx): ");
            double thursday = 0;
           t = true;
        while (t) {
            if(myScanner.hasNextDouble()) {
                thursday = myScanner.nextDouble();
                if(thursday >= 0) {
                    t = false;
                } else {
                    System.out.println("input is a negative integer please enter correct input");
                    
                }
            } else {
                System.out.println("input is a negative integer please enter correct input");
                myScanner.next();
            }
        } t = true;
            
        System.out.print("Enter amount spent on friday ($xx.xx): ");
            double friday = 0;
           t = true;
        while (t) {
            if(myScanner.hasNextDouble()) {
                friday = myScanner.nextDouble();
                if(friday >= 0) {
                    t = false;
                } else {
                    System.out.println("input is a negative integer please enter correct input");
                     
                }
            } else {
                System.out.println("input is a negative integer please enter correct input");
                myScanner.next();
            }
        } t = true;
            
        System.out.print("Enter amount spent on saturday ($xx.xx): ");
            double saturday = 0;
           t = true;
        while (t) {
            if(myScanner.hasNextDouble()) {
                saturday = myScanner.nextDouble();
                if(saturday >= 0) {
                    t = false;
                } else {
                    System.out.println("input is a negative integer please enter correct input");
                    
                }
            } else {
                System.out.println("input is a negative integer please enter correct input");
                myScanner.next(); 
            }
        } t = true;
            
        System.out.print("Enter amount spent on sunday ($xx.xx): ");
            double sunday = 0;
           t = true;
        while (t) {
            if(myScanner.hasNextDouble()) {
                sunday = myScanner.nextDouble();
                if(sunday >= 0) {
                    t = false;
                } else {
                    System.out.println("input is a negative integer please enter correct input");
                     
                }
            } else {
                System.out.println("input is a negative integer please enter correct input");
                myScanner.next();
            }
        } t = true;
            
            
    
            
            
        double averageSpent = (monday+tuesday+wednesday+thursday+friday+saturday+sunday)/7;
         averageSpent = averageSpent*100;
         double averageSpent1 = (int)averageSpent;
         double averageSpent2 = averageSpent1/100;
        
        
        double monday1 = ((int) monday + 1) - monday;
        double tuesday1 = ((int) tuesday + 1) - tuesday;
        double wednesday1 = ((int) wednesday + 1) - wednesday;
        double thursday1 = ((int) thursday + 1) - thursday;
        double friday1 = ((int) friday + 1) - friday;
        double saturday1 = ((int) saturday + 1) - saturday;
        double sunday1 = ((int) sunday + 1) - sunday;
        
        int monday2;
        int tuesday2;
        int wednesday2;
        int thursday2;
        int friday2;
        int saturday2;
        int sunday2;
        
        if (monday1 <= .5) {
            monday2 = (int) monday + 1;
        }
        else  {
            monday2 = (int) monday;
        }
        
        if (tuesday1 <= .5) {
            tuesday2 = (int) tuesday + 1;
        }
        else  {
            tuesday2 = (int) tuesday;
        }
        
        if (wednesday1 <= .5) {
            wednesday2 = (int) wednesday + 1;
        }
        else  {
            wednesday2 = (int) wednesday;
        }
        
        if (thursday1 <= .5) {
            thursday2 = (int) thursday + 1;
        }
        else  {
            thursday2 = (int) thursday;
        }
        
        if (friday1 <= .5) {
            friday2 = (int) friday + 1;
        }
        else  {
            friday2 = (int) friday;
        }
        
        if (saturday1 <= .5) {
            saturday2 = (int) saturday + 1;
        }
        else  {
            saturday2 = (int) saturday;
        }
        
        if (sunday1 <= .5) {
            sunday2 = (int) sunday + 1;
        }
        else  {
            sunday2 = (int) sunday;
        }
        
        
        System.out.print("expenses for monday: ");
        for(int i = 0; i < monday2; i++) {
            System.out.print("*");
        } System.out.println();
        
        System.out.print("expenses for tuesday: ");
        for(int i = 0; i < tuesday2; i++) {
            System.out.print("*");
        } System.out.println();
        
        System.out.print("expenses for wednesday: ");
        for(int i = 0; i < wednesday2; i++) {
            System.out.print("*");
        } System.out.println();
        
        System.out.print("expenses for thursday: ");
        for(int i = 0; i < thursday2; i++) {
            System.out.print("*");
        } System.out.println();
        
        System.out.print("expenses for friday: ");
        for(int i = 0; i < friday2; i++) {
            System.out.print("*");
        } System.out.println();
        
        System.out.print("expenses for saturday: ");
        for(int i = 0; i < saturday2; i++) {
            System.out.print("*");
        } System.out.println();
        
        System.out.print("expenses for sunday: ");
        for(int i = 0; i < sunday2; i++) {
            System.out.print("*");
        } System.out.println();
        
        System.out.println("the average weekly cost: " + averageSpent2);
        
        double increasingSpent = 0;
        for(int i = 0; i <= 52; i++) {
            double fluc = (int) (Math.random()*40) + 1;
            if (fluc < 20) {
                fluc = ((20 - fluc) + 80)/100;
            } else {
                fluc = (fluc + 80)/100;
            }increasingSpent += fluc * averageSpent2;
            
        }increasingSpent = increasingSpent*100;
            double increasingSpent1 = (int)increasingSpent;
            double increasingSpent2 = increasingSpent1/100; 
        System.out.println("Estimated expenditure for 4 years: " + increasingSpent2 * 4);
    }
}