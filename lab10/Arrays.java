//Cole Evans
//lab10
//Arrays program

import java.util.Scanner;

public class Arrays {
    
    public static void main(String[]args) {
        
        Scanner scan = new Scanner(System.in);
        
        int x = (int) (Math.random()*6) + 5;
        String[] students = new String[x];
        
        System.out.println("please enter " + x + " names");
        for(int i = 0; i < x; i++) {
            students[i] = scan.next();
        }
        int[] midterm = new int[x];
        
        for(int j = 0; j < x; j++){
            midterm[j] = (int) (Math.random()*100);
        }
        for(int r = 0; r < x; r++){
            System.out.println(students[r] + ": " + midterm[r]);
        }
        
        
    }
}