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
        
    }
}