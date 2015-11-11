//Cole Evans
//hw11
//CSE2Linear program
//asks user for 15 grades and then searches for a specific grade chosen by user

import java.util.Scanner;

public class CSE2Linear {
    
    public static void main(String[]args) {

    Scanner scan = new Scanner(System.in);
        
        System.out.println("please enter 15 integers between 0-100 for class grades: ");
        
        int[] grades = new int[15];//15 ints in grades array
        int var  = 0;
        for(int i = 0; i < 15; i++) {
            if(i == 0) {
                while(!scan.hasNextInt()) {//checks to make sure its an int
                    System.out.println("not an integer please try again");
                    scan.next();
                }
                var = scan.nextInt();
                while(true) {//checks to make sure int is within range
                    if(var >= 0 && var <= 100) {
                        grades[i] = var;
                        break;
                    } else {//checks again to make sure is int, and in range
                        System.out.println("not a valid integer please try again");
                        while(!scan.hasNextInt()) {
                    System.out.println("not an integer please try again");
                    scan.next();
                }
                }
            }
            } else {//checking for all array values besides zero
                while(!scan.hasNextInt()) {//checks to make sure its an int
                    System.out.println("not an integer please try again");
                    scan.next();
                }
                var = scan.nextInt();
                while(true) {//checks to make sure int is within range and is greater than previous grade
                    if(var >= 0 && var <= 100 && var > grades[i - 1]) {
                        grades[i] = var;
                        break;
                    } else { 
                        System.out.println("not a valid integer please try again");
                        while(!scan.hasNextInt()) {
                    System.out.println("not an integer please try again");
                    scan.next();
                }
                        var = scan.nextInt();
                }
            }
        }
    }
    System.out.print("sorted: ");//prints out the grades on one line in ascending order
    for(int e = 0; e < 15; e++) {
        System.out.print(grades[e] + " ");
    }
    System.out.println();
    
    System.out.println("please enter a grade to search for");
    int key = scan.nextInt();
    
    int j = 0;
    for(j = 0; j < grades.length; j++) {//loop that checks if "key" is found on the list
        if (grades[j] == key) {
            System.out.println(key + " was found after " + j + " iterations");
            break;
        }
    }
    if(j == (grades.length)) {
        System.out.println(key + " was not found");
    }
    
    
    int q = 0;
    int temp = 0;
    for(q = 0; q < 60; q++) {//loop that shuffles grades 
        int x = (int)(Math.random()*15);//swaps the first card with another card multiple times
        temp = grades[x];
        grades[x] = grades[0];
        grades[0] = temp;
    }
    System.out.print("shuffled: ");//prints out shuffled list of grades
    for(int w = 0; w < 15; w++) {//prints out shuffled grades
        System.out.print(grades[w] + " ");
    }
    
    System.out.println();
    System.out.println("please enter a grade to search for");
    key = scan.nextInt();
    
    
    for(j = 0; j < grades.length; j++) {//searches for "key" in shuffled grades list
        if (grades[j] == key) {
            System.out.println(key + " was found after " + j + " iterations");
            break;
        }
    }
    if(j == (grades.length)) {//if statement for if the grade wasn't found
        System.out.println(key + " was not found");
    }
    
}//end of method
}//edn of class