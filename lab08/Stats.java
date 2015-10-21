//Cole Evans
//lab08
//Stats program

import java.util.Scanner;

public class Stats {
    
    public static void main(String[]args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter frist value: ");
        double value1 = myScanner.nextDouble();
        
        System.out.println("enter second value: ");
        double value2 = myScanner.nextDouble();;//the length of the pattern
          boolean t = true;//boolean used for the while loop
        while (t) {
                if(value1 < value2) {
                    t = false;
                } else {
                    System.out.println("value is less than first number enter another: ");
                     myScanner.next();
                }   t = false;
            } 
            
            System.out.println("enter third value: ");
            double value3 = myScanner.nextDouble();;//the length of the pattern
            t = true;
        while (t) {
                if(value2 < value3) {
                    t = false;
                } else {
                    System.out.println("value is less than second number enter another: ");
                     myScanner.next();
                } t = false;
            } 
            
            System.out.println("enter fourth value: ");
            double value4 = myScanner.nextDouble();;//the length of the pattern
            t = true;
        while (t) {
                if(value3 < value4) {
                    t = false;
                } else {
                    System.out.println("value is less than third number enter another: ");
                     myScanner.next(); 
                } t = false;
            } 
            
            System.out.println("enter fifth value: ");
        double value5 = myScanner.nextDouble();;
          t = true;
        while (t) {
                if(value4 < value5) {
                    t = false;
                } else {
                    System.out.println("value is less than fourth number enter another: ");
                     myScanner.next();
                }  t = false;
            } 
            
            double mean = mean(value1, value2, value3, value4, value5);
            double median = median(value1, value2, value3, value4, value5);
            print(mean, median);
        }
        
        public static double mean(double value1, double value2, double value3, double value4, double value5) {
            double meanCalc = (value1 + value2 + value3 + value4 + value5)/5;
             return meanCalc;
        }
        
        public static double median(double value1, double value2, double value3, double value4, double value5) {
            return value3;
        }
        public static void print(double a, double b) {
            System.out.println(a);
            System.out.println(b);
        }
    }
