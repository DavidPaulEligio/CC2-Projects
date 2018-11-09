package areas_eligio;

import java.util.Scanner;
public class Areas_Eligio {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle -> ");
        
        double radius = sc.nextDouble();
        double AreaCircle = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + AreaCircle);
        double circumference= Math.PI * 2*radius;
        System.out.println("The circumference of the circle is: " + circumference + "\n\n\n");
        
        
        double size, AreaSquare;
        System.out.print("Enter the size of square -> ");
        size = sc.nextDouble();
        AreaSquare = Math.pow(size, 2);
        System.out.println("Area of a Squre: " + AreaSquare + "\n\n\n");
        
        double height, base, AreaTriangle;
        System.out.print("Enter the height of the triangle -> ");
        height = sc.nextInt();
        System.out.print("Enter the base of the triangle -> ");
        base = sc.nextInt();
        AreaTriangle = ((height * base) / 2);
        System.out.println("Area of the triangle is : " + AreaTriangle);
        
    }
    
}
