package practical_ass1;

import java.awt.BorderLayout;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Area of right triangle.");
        System.out.println("2. Area of Square.");
        System.out.println("3. Area of Rectangle.");
        System.out.println("4. Area of Circle.");
        System.out.println("5. Exit.");
        System.out.println("Your Operation: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Height: ");
                double h = sc.nextDouble();
                System.out.println("Enter Breadth: ");
                double b = sc.nextDouble();
                System.out.println("The area of right Triangle: " + (0.51*b*h));
                break;

            case 2:
                System.out.println("Enter length: ");
                double l = sc.nextDouble();              
                System.out.println("The area of Square: " + (l*l));
                break;
                
            case 3:
                System.out.println("Enter Length: ");
                double len = sc.nextDouble();
                System.out.println("Enter Breadth: ");
                double bre = sc.nextDouble();
                System.out.println("The area of Rectangle: " + (len * bre));
                break;
            
            case 4:
                System.out.println("Enter Radius: ");
                double r = sc.nextDouble();                
                System.out.println("The area of Circle: " + (3.14*r*r));
                break;
            
            case 5: System.exit(0);
            break;
            
            default: System.out.println("Invalid Input.");            
        }
    }
}
