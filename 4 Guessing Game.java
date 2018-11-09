
package guessinggameeligio;

import java.util.Scanner;
public class GuessingGameEligio {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to be guess -> ");
        int tbg = sc.nextInt();
        
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Guess the number -> ");
        int ans = sc2.nextInt();
        
         
        if(ans < tbg && tbg%2!=0){
                System.out.println("The number you entered is LOWER than the correct answer"
                        + "\nThe number to be guess is ODD number");         
            }
            else if(ans < tbg && tbg%2==0){
                System.out.println("The number you entered is LOWER than the correct answer"
                        + "\nThe number to be guess is EVEN number");         
            }
            else if(ans > tbg && tbg%2==0){
                System.out.println("The number you entered is HIGHER than the correct answer"
                        + "\nThe number to be guess is EVEN number");
            }
            else if(ans > tbg && tbg%2!=0){
                System.out.println("The number you entered is HIGHER than the correct answer"
                        + "\nThe number to be guess is ODD number");
            }
        
        while(ans != tbg){
            System.out.print("\nGuess the number -> ");
            ans = sc2.nextInt();
            
            if(ans < tbg && tbg%2!=0){
                System.out.println("The number you entered is LOWER than the correct answer"
                        + "\nThe number to be guess is ODD number");         
            }
            else if(ans < tbg && tbg%2==0){
                System.out.println("The number you entered is LOWER than the correct answer"
                        + "\nThe number to be guess is EVEN number");         
            }
            else if(ans > tbg && tbg%2==0){
                System.out.println("The number you entered is HIGHER than the correct answer"
                        + "\nThe number to be guess is EVEN number");
            }
            else if(ans > tbg && tbg%2!=0){
                System.out.println("The number you entered is HIGHER than the correct answer"
                        + "\nThe number to be guess is ODD number");
            }
            
        }
        
        System.out.println("\n\nCorrect!, the answer is " + tbg);
        
        
    }
    
}