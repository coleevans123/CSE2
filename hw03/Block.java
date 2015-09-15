//Cole Evans
//hw03-Block
// program takes input from user: height, width, length
// calculates surface area and vloume

import java.util.Scanner;

    public class Block {
        
        public static void main(String[] args) {
            
            Scanner myScanner = new Scanner( System.in);
            
            System.out.print("Enter the width: ");
            double width = myScanner.nextDouble();// prompting the user to input the width
            
            System.out.print("Enter the length: ");
            double length = myScanner.nextDouble();//prompting the user to input the width
            
            System.out.print("Enter the height: ");
            double height = myScanner.nextDouble();//prompting the user to inout the height
            
            double volume;// the value of multiplying each variable
            double surfaceArea;//the value of adding up all sides of the square
            
            
            volume = height * length * width;//calculates volume using three inputs provided by user
            surfaceArea = ((height * 2) + (length * 2) + (width * 2));//calculates surface area using three inputs provided by the user
            
            System.out.println("the volume of the block of dimensions " + width + " x " + length + " x " + height + " equals " + volume);// prints out volume of the cube
            System.out.println("the surface area of the block is " + surfaceArea);// prints out surface area of cube
            
        }//end of main method
        
    }//end of class