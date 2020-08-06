package practical_ass1;
import java.util.Scanner;

public class Q2 {   
    static int one(int n1, int n2){
        return n1 + n2;
    }
    
    static int two(int n1, int n2){
        return n1 - n2;
    }
    
    static int three(int n1, int n2){
        return n1 * n2;
    }
    
    static int four(int n1, int n2){
        return (n1 * n2) - n1;
    }
    
    static int five(int n1, int n2){
        return n1 / n2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. 1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter No. 2: ");
        int n2 = sc.nextInt();
        
        System.out.println("1. Sum of two number.");
        System.out.println("2. Subtraction of two numbers");
        System.out.println("3. Multiplication of two numbers");
        System.out.println("4. Multiplication of two numbers and subtract first number from it");
        System.out.println("5. Division of number1 and number2");
        System.out.println("6. Exit.");
        System.out.println("Choose your operation: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1: System.out.println("Sum of two numbers: "+(one(n1, n2)));
            break;
            
            case 2: System.out.println("Subtraction of two numbers: "+(two(n1, n2)));
            break;
            
            case 3: System.out.println("Multiplication of two numbers: "+(three(n1, n2)));
            break;
            
            case 4: System.out.println("Multiplication of two numbers and subtract first number: "+(four(n1, n2)));
            break;
            
            case 5: System.out.println("Division of number1 and number2: "+(five(n1, n2)));
            break;
            
            case 6: System.exit(0);
            break;            
            
            default: System.out.println("Invalid input");
        }
    }
    
}
