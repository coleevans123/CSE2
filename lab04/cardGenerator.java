//Cole Evans
//lab-03 cardGenerator
// random card generator
// picks random card from a 52-deck

import java.lang.Math;

public class cardGenerator {
    
    public static void main(String[] args) {
        
        String suits;// the suit of the card
        String cardNum;// the number of the card: 2-10, jack, queen, king, ace
        
        int card = (int) (Math.random()*13) + 2;//numbers between 2 and 14
        
        
        switch(card) {// switch loop for card number identification

            case 14: cardNum = "Ace";// number 14 is equal to ace
                break;
            case 13: cardNum = "King";// number 13 is equal to king
                break;
            case 12: cardNum = "Queen";// number 12 is equal to queen
                break;
            case 11: cardNum = "Jack";// number 11 is equal to jack
                break;
            default: cardNum = Integer.toString(card);
            
        }
        int suit = (int) (Math.random()*4);
        
        if (suit == 1) { //if statement for suit identification 
            suits = "Spades";
        }
        else if (suit == 2) {
            suits = "clubs";
        }
        else if (suit == 3) {
            suits = "hearts";
        }
        else {
            suits = "Diamonds";
        }
        System.out.println("you picked the " + cardNum + " of " + suits);
    }
}