//Cole Evans
//hw08
//String Analysis program
//program that checks to make sure all characters typed are letters
//or stops after a certain value is typed in


import java.util.Scanner;


public class StringAnalysis {
    
    public static void main(String[]args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("please a string of characters: ");//asks user to enter a list of letters
        String stringName = scan.next();
        stringName = stringName.toLowerCase();
        
        System.out.println("would you like to enter a value to stop at: ");//asks for an integer to stop checking after a certain point
        String q = scan.next();
        while(true) {
            if(q.equals("yes") || q.equals("no")) {//checks to make sure input is either 'yes' of 'no'
                break;
            } else {
                System.out.println("bad input please enter either yes or no");//if not yes or no asks user to enter again
                q = scan.next();
            }
        }
        String a = "";
        int b = 0;
        boolean name = false;
        if (q.equals("yes")) {//if user types yes. asks the user to enter an integer
            System.out.println("please enter value: ");
             b = scan.nextInt();
            name = charCount(stringName, b);//calling the character count with integer method
        } else {//if the user types no goes straight to method
            name = charCount(stringName);//calling the character count method without an integer
        }
        if (name == true) {//if name is true from character count methods it means all characters entered were letters
            System.out.println("all characters entered were letters");
        } else {//if name is false from character count methods it means not all characters entered were letters
            System.out.println("not all characters were letters");
        }
        
    }//end of main method
    
    public static boolean charCount(String a) {//boolean method checking characters without an integer
        
    for (int i = 0; i < a.length(); i++) {//for loop that checks each character in the list
        if (!Character.isLetter(a.charAt(i))) {
            return false;//if a character isn't a letter method returns false
        }
    } return true;//if all characters are letters method returns true
}//end of character count method without integer

    public static boolean charCount(String a, int b) {//boolean method checking characters with an integer
        
        for (int i = 0; i < b; i++) {//for loop that checks each character after a certain point(integer)
        if (!Character.isLetter(a.charAt(i))) {
            return false;//if a character isn't a letter method returns false
        }
    } return true;//if all characters are letters method returns true
    }//end of character count method with integer
}//end of class