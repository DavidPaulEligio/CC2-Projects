package factorialfibonacci;

import java.util.Scanner;
public class FactorialFibonacci {

    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        
        int app = 0;
        
        while(app!=1 || app!=2){
            try{
                System.out.print("What do you want?\n"
                + "[1] Fibonacci\n"
                + "[2] Factorial\n"
                + " -----------> ");
                app = in.nextInt();
                apps(app);
                
                System.out.println("\n");
                System.out.println("Would you like to do it again? yes/no");
                confirm(in.next());
                
                break;
                
            }catch(Exception e){
                System.out.println("Value must be interger");
                break;
            }
            
        }
        
        
   }
    
    
    static void confirm(String conf){
        
        Scanner sc = new Scanner(System.in);
        
        if(conf.equals("yes")){
            System.out.print("What do you want?\n"
                + "[1] Fibonacci\n"
                + "[2] Factorial\n"
                + " -----------> ");
            apps(sc.nextInt());
        } else if(conf.equals("no")){
            System.out.println("Thanks");
            return;
        }
        
    }
    static void apps(int app){
        Scanner sc = new Scanner(System.in);
        if(app == 1){

                // Fibonacci

                System.out.print("Enter Size of Array -> ");
                int size = sc.nextInt();
                int[] myArray = new int[size];

                for(int i = 0;i<myArray.length;i++){

                    System.out.print("number[" + i + "] = ");
                    myArray[i] = sc.nextInt();

                }
                System.out.println("\n\nFibonacci Results:\n");
                for(int i = 0;i<myArray.length;i++){
                    System.out.print("f(" + myArray[i] + ")\t");

                }
                System.out.println("\n");
                for(int i = 0;i<myArray.length;i++){
                    System.out.print(fibonacci(myArray[i]) + "\t");

                }
                // End

            } if(app == 2){

                System.out.print("Enter Size of Array -> ");
                int size = sc.nextInt();
                int[] myArray = new int[size];

                for(int i = 0;i<myArray.length;i++){

                    System.out.print("number[" + i + "] = ");
                    myArray[i] = sc.nextInt();

                }
                System.out.println("\n\nFactorial Results:\n");
                for(int i = 0;i<myArray.length;i++){
                    System.out.print("f(" + myArray[i] + ")\t");

                }
                System.out.println("\n");
                for(int i = 0;i<myArray.length;i++){
                    System.out.print(fact(myArray[i]) + "\t");

                }

            }
        
    }
    
    // method for Factorial
    static int fact(int n)
    {
        int output;
        if(n==1){
          return 1;
        }

        output = fact(n-1)* n;
        return output;
    }
    // end
    
    
    // Method for Fibonacci
    public static int fibonacci(int number){
        
        if(number ==1 || number == 2){
            return 1;
        }
        
        return fibonacci(number-1) + fibonacci(number -2); // tail recursion
        
    }
    // End
    
}
