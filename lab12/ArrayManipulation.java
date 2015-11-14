//Cole Evans
//lab 12/
//Array Manipulation

public class ArrayManipulation {
    
    public static void main(String[]args) {
       
       int[][] array =  raggedArray();
       printArray(array);
       int x = findLargest(array);
       System.out.println(x + " is the max");
       int y = findSmallest(array);
       System.out.println(y + " is the min");
       int t = mostEven(array);
       System.out.println( + t + " evens");
        
    }
    
    public static int[][] raggedArray() {
        
        int x = (int)(Math.random() * 21) + 10;
        int[][] array = new int[x][];
        
        int i = 0;
        int j = 0;
        for(i = 0; i < array.length; i++) {
            int y = (int)(Math.random() * 21) + 10;
            array[i] = new int[y];
            for(j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 2001) - 1000;
            }
        }
        return array;
        
    }
    
    public static void printArray(int[][] m) {
        
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void printArray(int[] m) {
        
        for(int i = 0; i < m.length; i++) {
                System.out.print(m[i] + " ");
        }
    }
    
    public static int findSmallest(int[][] m) {
     
     int min1 = 100001;
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                if (m[i][j] < min1) {
                    min1 = m[i][j];
                }   
            }
        }
        return min1;
    }
    
    public static int findLargest(int[][] m) {
        
        int max1 = -1000;
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                if (m[i][j] > max1) {
                    max1 = m[i][j];
                }
            }
        }
        return max1;
    }
    
    


public static int mostEven(int[][] m) {
    
    int evenCounter1 = 0;
    for(int i = 0; i < 1; i++) {
            for(int j = 0; j < m[i].length; j++) {
                if(m[i][j] % 2 == 0) {
                    evenCounter1++;
                }
            }
        }
        int member = 0;
        
        int evenCounter2 = 0;
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                if(m[i][j] % 2 == 0) {
                    evenCounter2++;
                } 
            }
            if(evenCounter2 > evenCounter1) {
                evenCounter1 = evenCounter2;
                member = i;
            }
            evenCounter2 = 0;
        }
        
        System.out.print("member array " + member + " has ");
            
        return evenCounter1;
        
    
    }
}