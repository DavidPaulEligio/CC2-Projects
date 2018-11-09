
package fibonacci_eligio;

import java.util.Scanner;

public class Fibonacci_Eligio {

    public static void main(String[] args){
        
        System.out.print("Enter a Number -> ");
        int number = new Scanner(System.in).nextInt();
        
        System.out.println("f(" + number + ")\n");
        
        for(int i = 0;i<=number;i++){
            System.out.print("f(" + i + ")\t");
        }
        System.out.println("\n");
        for(int i = 1;i<=number;i++){
            System.out.print("0\t");
            for(int j = 1;j<=i;j++){ 
                System.out.print(fibonacci2(j) + "\t");
            }
            System.out.println("\n");
        }
        
    }
    
    public static int fibonacci(int number){
        
        if(number ==1 || number == 2){
            return 1;
        }
        
        return fibonacci(number-1) + fibonacci(number -2); // tail recursion
        
    }
    
    
    public static int fibonacci2(int number){
        
        if(number ==1 || number == 2){
            return 1;
        }
        
        int fibo1=1, fibo2=1, fibonacci=1;
        
        for(int i = 3;i<=number;i++){
            
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            
        }
        return fibonacci;
        
    }
    
}
