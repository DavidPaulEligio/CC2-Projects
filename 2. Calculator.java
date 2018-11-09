package calculator_eligio;

import java.util.Scanner;
public class Calculator_Eligio {
    
    public static void main(String[] args) {
        
        Scanner op = new Scanner(System.in);
        System.out.print("What operation do you want to use? \n"
                + "[+]Addition\n"
                + "[-]Subtraction\n"
                + "[*]Multiplication\n"
                + "[/]Division\n"
                + "[%]Modulo\n"
                + "-> ");
        String ope = op.nextLine();

        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        switch(ope){
            case "+":
                System.out.print("Enter 1st addend -> ");
                int add1 = n1.nextInt();
                System.out.print("Enter 2nd addend -> ");
                int add2 = n2.nextInt();
                int total = add1 + add2;
                System.out.println("Total: " + total);
                break;
            case "-":
                System.out.print("Enter minuend -> ");
                int sub1 = n1.nextInt();
                System.out.print("Enter subtrahend -> ");
                int sub2 = n2.nextInt();
                int diff = sub1 - sub2;
                System.out.println("Difference: " + diff);
                break;
            case "*":
                System.out.print("Enter 1st factor -> ");
                int mul1 = n1.nextInt();
                System.out.print("Enter 2nd  factor -> ");
                int mul2 = n2.nextInt();
                int prod = mul1 * mul2;
                System.out.println("Product: " + prod);
                break;
            case "/":
                try{
                    System.out.print("Enter dividend -> ");
                    int div1 = n1.nextInt();
                    System.out.print("Enter divisor -> ");
                    int div2 = n2.nextInt();

                    int quot = div1 / div2;
                    System.out.println("Quotient: " + quot);
                } catch(ArithmeticException e){
                    System.out.println("Syntax Error! Cannot be divide by zero");
                }

                break;
             case "%":
                System.out.print("Enter dividend -> ");
                int mod1 = n1.nextInt();
                System.out.print("Enter divisor -> ");
                int mod2 = n2.nextInt();
                int rem = mod1 % mod2;
                System.out.println("Remainder: " + rem);
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }
        
    }
    
}
