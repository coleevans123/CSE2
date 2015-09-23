//Cole Evans
//Poker hand check program
//deals 5 cards
//analyzes if there is a pair, 2 pair, 3 of a kind, or high card

//import Java.lang.Math;

public class PokerHandCheck {
    
    public static void main(String[] args) {
        
        String suits;// the suit of the card
        String cardNum1;// the number of the card: 2-10, jack, queen, king, ace
        
        int card = (int) (Math.random()*13) + 2;//numbers between 2 and 14
        
        
        switch(card) {// switch loop for card number identification

            case 14: cardNum1= "Ace";// number 14 is equal to ace
                break;
            case 13: cardNum1= "King";// number 13 is equal to king
                break;
            case 12: cardNum1= "Queen";// number 12 is equal to queen
                break;
            case 11: cardNum1= "Jack";// number 11 is equal to jack
                break;
            default: cardNum1= Integer.toString(card);
            
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
        
         String suits1;// the suit of the card
        String cardNum2;// the number of the card: 2-10, jack, queen, king, ace
        
        int card1 = (int) (Math.random()*13) + 2;//numbers between 2 and 14
        
        
        switch(card1) {// switch loop for second card number identification

            case 14: cardNum2 = "Ace";// number 14 is equal to ace
                break;
            case 13: cardNum2 = "King";// number 13 is equal to king
                break;
            case 12: cardNum2 = "Queen";// number 12 is equal to queen
                break;
            case 11: cardNum2 = "Jack";// number 11 is equal to jack
                break;
            default: cardNum2 = Integer.toString(card1);
            
        }
        int suit1 = (int) (Math.random()*4);
        
        if (suit1 == 1) { //if statement for suit identification 
            suits1 = "Spades";
        }
        else if (suit1 == 2) {
            suits1 = "clubs";
        }
        else if (suit1 == 3) {
            suits1 = "hearts";
        }
        else {
            suits1 = "Diamonds";
        }
        
        String suits2;// the suit of the card
        String cardNum3;// the number of the card: 2-10, jack, queen, king, ace
        
        int card2 = (int) (Math.random()*13) + 2;//numbers between 2 and 14
        
        
        switch(card2) {// switch loop for third card number identification

            case 14: cardNum3 = "Ace";// number 14 is equal to ace
                break;
            case 13: cardNum3 = "King";// number 13 is equal to king
                break;
            case 12: cardNum3 = "Queen";// number 12 is equal to queen
                break;
            case 11: cardNum3 = "Jack";// number 11 is equal to jack
                break;
            default: cardNum3 = Integer.toString(card2);
            
        }
        int suit2 = (int) (Math.random()*4);
        
        if (suit2 == 1) { //if statement for suit identification 
            suits2 = "Spades";
        }
        else if (suit2 == 2) {
            suits2 = "clubs";
        }
        else if (suit2 == 3) {
            suits2 = "hearts";
        }
        else {
            suits2 = "Diamonds";
        }
        
        String suits3;// the suit of the card
        String cardNum4;// the number of the card: 2-10, jack, queen, king, ace
        
        int card3 = (int) (Math.random()*13) + 2;//numbers between 2 and 14
        
        
        switch(card3) {// switch loop for fourth card number identification

            case 14: cardNum4 = "Ace";// number 14 is equal to ace
                break;
            case 13: cardNum4 = "King";// number 13 is equal to king
                break;
            case 12: cardNum4 = "Queen";// number 12 is equal to queen
                break;
            case 11: cardNum4 = "Jack";// number 11 is equal to jack
                break;
            default: cardNum4 = Integer.toString(card3);
            
        }
        int suit3 = (int) (Math.random()*4);
        
        if (suit3 == 1) { //if statement for suit identification 
            suits3 = "Spades";
        }
        else if (suit3 == 2) {
            suits3 = "clubs";
        }
        else if (suit3 == 3) {
            suits3 = "hearts";
        }
        else {
            suits3 = "Diamonds";
        }
        
        String suits4;// the suit of the card
        String cardNum5;// the number of the card: 2-10, jack, queen, king, ace
        
        int card4 = (int) (Math.random()*13) + 2;//numbers between 2 and 14
        
        
        switch(card4) {// switch loop for fifth card number identification

            case 14: cardNum5 = "Ace";// number 14 is equal to ace
                break;
            case 13: cardNum5 = "King";// number 13 is equal to king
                break;
            case 12: cardNum5 = "Queen";// number 12 is equal to queen
                break;
            case 11: cardNum5 = "Jack";// number 11 is equal to jack
                break;
            default: cardNum5 = Integer.toString(card4);
            
        }
        int suit4 = (int) (Math.random()*4);
        
        if (suit4 == 1) { //if statement for suit identification 
            suits4 = "Spades";
        }
        else if (suit4 == 2) {
            suits4 = "clubs";
        }
        else if (suit4 == 3) {
            suits4 = "hearts";
        }
        else {
            suits4 = "Diamonds";
        }
        //prints out your 5 cards
        System.out.println("these are your 5 random cards");
        System.out.println(cardNum1+ " of " + suits);
        System.out.println(cardNum2 + " of " + suits1);
        System.out.println(cardNum3 + " of " + suits2);
        System.out.println(cardNum4 + " of " + suits3);
        System.out.println(cardNum5 + " of " + suits4);
        System.out.println("");
        
        //boolean statements used to match two cards into one expression
        Boolean cardNum12 = cardNum1.equals(cardNum2);
        Boolean cardNum13 = cardNum1.equals(cardNum3);
        Boolean cardNum14 = cardNum1.equals(cardNum4);
        Boolean cardNum15 = cardNum1.equals(cardNum5);
        Boolean cardNum23 = cardNum2.equals(cardNum3);
        Boolean cardNum24 = cardNum2.equals(cardNum4);
        Boolean cardNum25 = cardNum2.equals(cardNum5);
        Boolean cardNum34 = cardNum3.equals(cardNum4);
        Boolean cardNum35 = cardNum3.equals(cardNum5);
        Boolean cardNum45 = cardNum4.equals(cardNum5);
        
        //if statements that prints either two pair, three of a kind, a pair, or high card
        if (cardNum12 && cardNum34) {
            System.out.println("You have a two pair");
        }
        else if (cardNum12 && cardNum35) {
            System.out.println("You have a two pair");
        }
         else if (cardNum12 && cardNum45) {
            System.out.println("You have a two pair");
        }
        
        else if (cardNum13 && cardNum24) {
            System.out.println("You have a two pair");
        }
        else if (cardNum13 &&cardNum25) {
            System.out.println("You have a two pair");
        }
        else if (cardNum13 && cardNum45) {
            System.out.println("You have a two pair");
        }
        
         else if (cardNum14 && cardNum23) {
            System.out.println("You have a two pair");
        }
        else if (cardNum14 && cardNum25) {
            System.out.println("You have a two pair");
        }
        else if (cardNum14 && cardNum35) {
            System.out.println("You have a two pair");
        }
        
        else if (cardNum15 && cardNum23) {
            System.out.println("You have a two pair");
        }
        else if (cardNum15 && cardNum24) {
            System.out.println("You have a two pair");
        }
        else if (cardNum15 && cardNum34) {
            System.out.println("You have a two pair");
        }
     
        else if (cardNum23 && cardNum45) {
            System.out.println("You have a two pair");
        }
     
        else if (cardNum24 && cardNum45) {
            System.out.println("You have a two pair");
        }
      
        else if (cardNum25 && cardNum34) {
            System.out.println("You have a two pair");
         }
         else if (cardNum12 && cardNum13) {
            System.out.println("You have a three of a kind");
        }
        else if (cardNum12 && cardNum14) {
            System.out.println("You have a three of a kind");
        }
        else if (cardNum12 && cardNum15) {
            System.out.println("You have a three of a kind");
        }
        
        else if (cardNum13 && cardNum14) {
            System.out.println("You have a three of a kind");
        }
        else if (cardNum13 && cardNum15) {
            System.out.println("You have a three of a kind");
        }
        
        else if (cardNum14 && cardNum15) {
            System.out.println("You have a three of a kind");
        }
        
        else if (cardNum23 && cardNum24) {
            System.out.println("You have a three of a kind");
        }
        else if (cardNum23 && cardNum25) {
            System.out.println("You have a three of a kind");
        }
        
        else if (cardNum24 && cardNum25) {
            System.out.println("You have a three of a kind");
        }
        
        else if (cardNum34 && cardNum35) {
            System.out.println("You have a three of a kind");
        }
        
        else if (cardNum1.equals(cardNum2)) {
            System.out.println("You have a pair");
        }
        else if (cardNum1.equals(cardNum3)) {
            System.out.println("You have a pair");
        }
        else if (cardNum1.equals(cardNum4)) {
            System.out.println("You have a pair");
        }
        else if (cardNum1.equals(cardNum5)) {
            System.out.println("You have a pair");
        }
        
        else if (cardNum2.equals(cardNum3)) {
            System.out.println("You have a pair");
        }
        else if (cardNum2.equals(cardNum4)) {
            System.out.println("You have a pair");
        }
        else if (cardNum2.equals(cardNum5)) {
            System.out.println("You have a pair");
        }
        
        else if (cardNum3.equals(cardNum4)) {
            System.out.println("You have a pair");
        }
        else if (cardNum3.equals(cardNum5)) {
            System.out.println("You have a pair");
        }
        
        else if (cardNum4.equals(cardNum5)) {
            System.out.println("You have a pair");
        }
        else {
            System.out.println("you have a high card");
        }
        
        
        
        
        
    }//end of method
    
}//end of class