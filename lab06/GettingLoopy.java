//Cole Evans
//10/2/2015
//lab06
//program runs different loops with different purposes


public class GettingLoopy {
    
    public static void main(String[] args) {
        
        int number = 1;
        while(number < 8) {
            System.out.print(number);
            number++;
        } //System.out.println();
        int num = 0;
        while(num < 4) {
            System.out.print(7);
            num++;
        } System.out.println();
        int factor = 2;
        int inputValue = 10;
        System.out.print("while loop: ");
        while (inputValue <= 100) {
            while(inputValue > factor) {
                if (inputValue % factor == 0) {
                inputValue++;
            }
            factor++;
            
            }System.out.print(inputValue + " ");
            inputValue++;
            factor = 2;
        
       } System.out.println();
       factor = 2;
       System.out.print("for loop: ");
       for(inputValue = 10; inputValue <= 100; System.out.print(inputValue + " "), inputValue++, factor = 2) {
           for(factor = 2; inputValue > factor; factor++) {
               if (inputValue % factor == 0) {
                   inputValue++;
               }
           }
       }
       System.out.println();
       int smiley = (int)(Math.random()*201) + 5;
       for(int i = 1; i < smiley; i++) {
           if(i % 20 == 0) {
               System.out.println();
           }
           System.out.print(":)");
       }
        
    }
}