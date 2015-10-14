//Cole Evans
//hw07
//Twisty Program
//program that takes in lenght and width and makes a zig-zag pattern with "#" and "/ or \"

import java.util.Scanner;

public class Twisty {
    
    public static void main(String[]args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("input your desired length: ");
        
        
        int length = 0;//the length of the pattern
          boolean t = true;//boolean used for the while loop
        while (t) {//loop that determines if input is valid
            if(myScanner.hasNextInt()) {
                length = myScanner.nextInt();
                if(length >= 0 && length <= 100) {
                    t = false;
                } else {
                    System.out.println("integer is out of range please enter a valid integer: ");
                     
                }
            } else {
                System.out.println("not an integer: ");
                myScanner.next(); 
            }
        } t = true;
        
       
        
        
        System.out.println("input your desired width: ");
        
        
        int width = 0;
          boolean y = true;
        while (y) {//same while loop for input above
            if(myScanner.hasNextInt()) {
                width = myScanner.nextInt();
                if(width >= 0 && width <= 100 && width < length) {//only difference is width has to be less than length
                    y = false;
                }else if (width > length) {
                    System.out.println("please enter an integer less than length");//if width is greater than length, it asks for another input
                
                } else {
                    System.out.println("integer is out of range please enter a valid integer: ");
                     
                }
            } else {
                System.out.println("not an integer: ");
                myScanner.next(); 
            }
        } y = true;
        
    
     for (int i = 0; i < width; i++) {//for loop for the rows of the pattern
         int counter = 0;//counter used to 
         int q = 0;//int used as a switch to change pattern
         while(counter < length) {//while looop to make sure columns doesn't go over length
            for (int j = 0; j < width; j++) {//for loop used for the columns of each line
                if(q == 0) {//if q equals 0 this if statement will go through
                if (i == j && counter <= length) {//if statement that prints out "#"
                    System.out.print("#");
                    counter++;
                } else if ((width - 1 - j == i && counter <= length)) {//if statement that prints out "/"
                    System.out.print("/");
                    counter++;
                    
                }
                else {
                    System.out.print(" ");//if statement that prints out " "
                    counter++;
                }
            }
              if(q == 1) {//if q equals 1 this if statement goes through
               if (i == j && counter <= length) {//if statement that prints out "\"
                    System.out.print("\\");
                    counter++;
                } else if ((width - 1 - j) == i && counter <= length) {//if statement that prints out "#"
                    System.out.print("#");
                    counter++;
                    
                }
                else {//if statement that prints out " "
                    System.out.print(" ");
                    counter++;
                }
            }
            }//end of inner for loop
            if (q == 0) {
                q = 1;
                } else {
                    q = 0;
                }
            }System.out.println();//end of while loop
        }//end of outer for loop
    }//end of main
    }//end of class

