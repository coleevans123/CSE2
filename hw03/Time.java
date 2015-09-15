//Cole Evans
//hw02
//Time program
//program calculates the difference in time from current time to time at dinner

import java.util.Scanner;

    public class Time {
        
        public static void main(String[] args) {
            
            Scanner myScanner = new Scanner ( System.in);
            
            System.out.print("Enter the current time of day: ");
            double currentTime = myScanner.nextDouble();//prompting the user to input the current time of day
            
            System.out.print("Enter the time you will be eating dinner: ");
            double dinnerTime = myScanner.nextDouble();//prompting the user to input the time of the dinner
            
            double minuteTimeC;//variable used to convert current 24 hour time to minutes
            double minuteTimeD;//variable used to convert dinner 24 hour time to minutes
            
             minuteTimeC = ((((int)currentTime / 100) *60) + (currentTime % 100));// converts 24 hour time of current time into minutes
             minuteTimeD = ((((int)dinnerTime / 100) * 60) + (dinnerTime % 100));// converts 24 hour time of dinenr time into minutes
             
             double differenceInMinutes = minuteTimeD - minuteTimeC;//subjects dinner minutes by current minutes
             
             int hours =  (int)differenceInMinutes / 60;// takes total minutes and converts it to hours
             int minutes = (int)differenceInMinutes % 60;// remainder of minutes
            
            
            System.out.println("you have " + hours + " hours and " + minutes + " minutes until dinner");
        }// end of main method
        
    }// end of class