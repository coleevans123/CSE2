//Cole Evans
//hw08
//Area program
//Calculates the area of a circle, rectangle or a triangle

import java.util.Scanner;

public class Area {
    
    public static void main(String[]args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        String name = "";
        double b = 0;
        double c = 0;
        input(name, b, c);//takes the name of the shape, and the two dimensions
        
    
    }//end of main method
        
        public static void input(String name, double x, double y) {//method that takes in input and checks to make sure its a shape
                                                                   //then takes the two dimensions
            Scanner scan = new Scanner(System.in);
            
        System.out.println("please enter either rectangle, circle or triangle");//asks for one of the three shapes
        String response = scan.next();
        response = response.toLowerCase();
            
            boolean t = true;//boolean used for the while loop
        while (t) {//loop that determines if input is valid
            if(response.equals("circle") || response.equals("rectangle") || response.equals("triangle")) {//if statement that checks for one of the three shapes
                if (response.equals("rectangle")) {
                        System.out.println("you chose rectangle");
                        name = "you chose rectangle";
                        t = false;
                 } else if (response.equals("circle")) {
                     System.out.println("you chose circle");
                     name = "circle";
                     t = false;
                 } else if (response.equals("triangle")) {
                     System.out.println("you chose triangle");
                     name = "triangle";
                     t = false;
                 } 
            } else {//if input is not one of the three shapes it asks to enter another shape
                System.out.println("bad input. please enter either rectangle, circle or triangle");
                response = scan.next();
            }
                
        
        } 
        
        
        
        
        double ans = 0;
        if (response.equals("circle")) {//if statement that asks for the radius of the circle
            System.out.println("please enter the radius of the circle: ");
            double dim = 0;
            while (!scan.hasNextDouble()) {//checks to make sure input is a double
                System.out.println("bad input");
                scan.next();
            } 
            double pi = 3.14;
            dim = scan.nextDouble();
            ans = circleArea(dim, pi);//calls the method for finding the area of circle
            System.out.println("the area of the circle is " + ans);//prints the area of a circle
        }
        
        if (response.equals("rectangle")) {//if statement that takes the dimensions of the rectangle
        System.out.println("please enter the base: ");
            double base = 0;
            while (!scan.hasNextDouble()) {//checks to make sure input is a double
                System.out.println("bad input");
                scan.next();
            }
            base = scan.nextDouble();
        
            System.out.println("please enter the height: ");
            double height = 0;
            while (!scan.hasNextDouble()) {//checks to make sure input is a double
                System.out.println("bad input");
                scan.next();
            } 
            height = scan.nextDouble();
            ans = rectangleArea(base, height);//calls method for finding the area of a rectangle
            System.out.println("the area of the rectangle is " + ans);//prints out the area of the rectangle
        }
            if (response.equals("triangle")) {//if statement that takes the dimensions for the triangle
        System.out.println("please enter the base: ");
            double base = 0;
            while (!scan.hasNextDouble()) {//checks to make sure input is a double
                System.out.println("bad input");
                scan.next();
            } 
            base = scan.nextDouble();
        
            System.out.println("please enter the height: ");
            double height = 0;
            while (!scan.hasNextDouble()) {//checks to make sure input is a double
                System.out.println("bad input");
                scan.next();
            } 
            height = scan.nextDouble();
            ans = triangleArea(base, height);//calls the method to find the area of a triangle
            System.out.println("the area of the triangle is " + ans);//prints out the area of the triangle
        }
        }//end of input method
        
        
        
    
    
    public static double triangleArea(double x, double y) {//method that calculates the area of the triangle
        double calcArea = ((x * y) * .5);//calclation to find the area of a triangle
        return calcArea;
    }//end of triangle method
    
    public static double rectangleArea(double x, double y) {//method that calculates the area of the rectangle
        double calcArea = (x * y);//calculation to find the area of a rectangle
        return calcArea;
    }//end of rectangle method
    
    public static double circleArea(double x, double y) {//method that calculates the area of the circle
        double pi = 3.14;//constant value pi used in calculations that never changes
        double calcArea = ((x*x) * pi);//calculation to find the area of the circle
        return calcArea;
    }//end of circle area method

}//end of class
