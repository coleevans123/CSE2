//Cole Evans
//hw12
//transpose program

import java.util.Scanner;

public class Transpose {
    
    public static void main(String[]args) {//main method
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("please enter a width ");
        
        int width = 0;
        boolean t = true;
        while (t) {//checks to make sure width is ant int and greater than zero
            if(myScanner.hasNextInt()) {
                width = myScanner.nextInt();
                if(width > 0) {
                    t = false;
                } else {
                    System.out.println("integer is out of range please enter a valid integer: ");
                     
                }
            } else {
                System.out.println("not an integer: ");
                myScanner.next(); 
            }
        } t = true;
        
        System.out.println("please enter a height ");
        
        int height = 0;
        t = true;
        while (t) {//checks to make sure height is an int and greater than zero
            if(myScanner.hasNextInt()) {
                height = myScanner.nextInt();
                if(height > 0) {
                    t = false;
                } else {
                    System.out.println("integer is out of range please enter a valid integer: ");
                     
                }
            } else {
                System.out.println("not an integer: ");
                myScanner.next(); 
            }
        } t = true;
        
        int [][] q = randomMatrix(width, height);//calls random matrix method 
        printMatrix(q);//calls print matrix method and prints it out
        System.out.println();
        int[][] z = transposeMatrix(q);//calls transpose method
        printMatrix(z);//prints new transposed matrix
        
    }
    
    public static int[][] randomMatrix(int a, int b) {//creates a random matrix using height and width
        
        
        int[][] array = new int[a][b];
        
        int i = 0;
        int j = 0;
        for(i = 0; i < array.length; i++) {//for loop that creates the matrix
            for(j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 21) - 10;
            }
        }
        return array;//returns the created matrix
        
    }//end of random matrix method
    
    public static void printMatrix(int[][] m) {//method that prints the matrix
        
        boolean isRect = true;
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
            if(m[0].length == m[i].length) {//checks to make sure matrix is not a square
                isRect = false;
            }
        }
        if(isRect == false) {
            System.out.println("not a rectangle matrix");
        }
    
    
    }//end of print matrix method
    
    public static int[][] transposeMatrix(int[][] b) {//transpose method
        
        int[][] array = new int[b[0].length][b.length];
        
        int i = 0;
        int j = 0;
        for(i = 0; i < array.length; i++) {
            for(j = 0; j < array[i].length; j++) {
                array[i][j] = b[j][i];
            }
        }
        return array;
    
        
    }//end of transpose method
    
}//end of class