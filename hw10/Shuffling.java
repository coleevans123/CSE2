//Cole Evan
//hw 10
//Shuffling program

import java.util.Scanner;

public class Shuffling{
    
  public static void main(String[] args) {
      
     Scanner scan = new Scanner(System.in);
	//suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};//String Array for the card suit   
String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};//String Array for card ranks
String[] cards = new String[52];//number of cards in the card Array
String[] hand = new String[5];//number of cards picked to be placed in hand array

for (int i=0; i<52; i++){//for loop that places a rank and suit for a value: i
  cards[i]=rankNames[i%13]+suitNames[i/13];
}
printArray(cards);//calls print method and prints out cards in order.
System.out.println("shuffled");
shuffle(cards);//shuffle method that shuffles the cards in the Array
printArray(cards);//calls the print method and prints the new shuffled deeck
hand = randomizeHand(cards);
System.out.println("randomized hand");
printArray(hand);//calls the print method and prints the 5 randomly
  }
  
public static void printArray(String[] list) {
    for (int i = 0; i < list.length; i++) {
        System.out.print(list[i] + " ");
    }
}

public static void shuffle(String[] b) {
    int i = 0;
    String temp = "";
    for(i = 0; i < 60; i++) {
        int x = (int)(Math.random()*51);
        temp = b[x];
        b[x] = b[0];
        b[0] = temp;
    }
    
}
public static String[]  randomizeHand(String[] a) {
    String[] hand = new String[5];
    for (int q = 0; q < hand.length; q++){
        int rand = (int)(Math.random()*51);
        if (a[rand].equals(hand[0]) || a[rand].equals(hand[1]) || a[rand].equals(hand[2]) || a[rand].equals(hand[3]) || a[rand].equals(hand[4])) {
            rand = (int)(Math.random()*51);
        }
        hand[q] = a[rand];
        System.out.print(hand[q] + " ");
    }
    return hand;
}
}