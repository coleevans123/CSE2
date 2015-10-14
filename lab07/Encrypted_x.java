//Cole Evans
//lab07
//encrypted x program


import java.util.Scanner;

public class Encrypted_x {
    
    public static void main(String[]args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("please enter an integer between 0-100: ");
        
        
        int integer = 0;
          boolean t = true;
        while (t) {
            if(myScanner.hasNextInt()) {
                integer = myScanner.nextInt();
                if(integer >= 0 && integer <= 100) {
                    t = false;
                } else {
                    System.out.println("integer is out of range please enter a valid integer: ");
                     
                }
            } else {
                System.out.println("not an integer: ");
                myScanner.next(); 
            }
        } t = true;
        
        
        for (int i = 0; i < integer; i++) {
            for (int j = 0; j < integer; j++) {
                if (i == j) {
                    System.out.print(" ");
                } else if ((integer - 1 - i) == j) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
                //System.out.print("*");
            }System.out.println();
        }System.out.println();
    }
}