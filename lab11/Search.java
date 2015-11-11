//Cole Evans
//lab11
//search program

import java.util.Scanner;

public class Search {
    
    public static void main(String[] args) {
        
        int[] array1 = new int[5000];
        int[] array2 = new int[5000];
        
        
        
        int i = 0;
        for(i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random()*100001);
        }
        int max1 = 0;
        for(int j = 1; j < array1.length; j++) {
            if (array1[j] > max1) {
                max1 = array1[j];
            }
        }System.out.println("The maximum of array1 is: " + max1);
        int min1 = 100001;
        for(int q = 1; q < array1.length; q++) {
            if (array1[q] < min1) {
                min1 = array1[q];
            }
        }System.out.println("The minimum of array1 is: " + min1);
        int t = 0;
        array2[0] = (int)(Math.random()*100001);
        for(t = 1; t < array2.length; t++) {
            array2[t] = (int)(Math.random()*100001);
            if(array2[t-1] > array2[t]) {
                for(; array2[t-1] > array2[t]; array2[t] = (int)(Math.random()*100001)) {
                }
            }
        }
        
        
        System.out.println("The maximum of array2 is: " + array2[4999]);
        
        System.out.println("The minimum of array2 is: " + array2[0]);
        
        Scanner scan = new Scanner(System.in);
        boolean b = true;
        System.out.println("please enter an integer greater than 0");
        int integer = scan.nextInt();
        while(b) {
            if(integer >= 0){
                b = false;
            } else {
                break;
            }
        }
        
        int first = 0;
        int last = array2.length - 1;
        int middle = (first + last)/2;
        while (first <= last) {
            if(array2[middle] < integer) {
                first = middle + 1;
            } else if (array2[middle] == integer){
                System.out.println(integer + " was found");
                break;
            } else {
                last = middle - 1;
            }middle = (first + last)/2;
        } if (first > last) {
            System.out.println(integer + " was not on the list");
            System.out.println("");
        }
    }
}