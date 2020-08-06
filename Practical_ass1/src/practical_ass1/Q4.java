package practical_ass1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        
        System.out.println("Menu");
        System.out.println("1. South Indian Dish");        
        System.out.println("2. North Indian Dish");
        System.out.println("3. Rajasthani Dish");
        System.out.println("4. Gujarati Dish");
        System.out.println("5. Bengoli Dish");
        System.out.println("6. Desert");
        System.out.println("7. Exit.");
        System.out.println("Your order: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1: System.out.println("You get:\nIdli : 2 Pieces\nButter Cheese Dosa : 1 Pieces\nVada : 2 Pieces");
            break;
            
            case 2: System.out.println("You get:\nPaneer Sabji : 1 Plate\n Mix Veg Sabji: 1 Plate\n Lassi: 1 Glass\nButter Naan: 4 Pieces");    
            break;
            
            case 3: System.out.println("You get:\nDaal Bati : 2 Pieces\nChura : 1 Plate");
            break;
            
            case 4: System.out.println("You get:\nSabji : 2 Pieces\nButter Roti : 5 Pieces\nButtermilk : 1 Glass");
            break;
            
            case 5: System.out.println("You get:\nRoti : 1 Plate\nShabji : 1 plate\nSweet : 2 Pieces");
            break;
            
            case 6: System.out.println("You get:\nIce Cream: 250 ml\n Brownie: 100 Grams");
            break;
            
            case 7: System.exit(0);
            break;            
            
            default: System.out.println("Invalid input");
        }    
    }
}
