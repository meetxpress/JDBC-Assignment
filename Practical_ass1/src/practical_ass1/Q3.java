package practical_ass1;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Monday\n2. Tuesday\n3. Wednesday\n4. Thurday\n5. Friday\n6. Saturday\n7. Sunday\n0. Exit");        
        int day=0;        
        while (day != 8) {            
            System.out.println("Enter No of day: ");
            day = sc.nextInt();
            switch (day) {               
                case 1: System.out.println("First day of the week is Monday");
                    break;

                case 2: System.out.println("Second day of the week is Tuesday");
                    break;

                case 3: System.out.println("Third day of the week is Wednesday");
                    break;

                case 4: System.out.println("Fourth day of the week is Thurday");
                    break;

                case 5: System.out.println("Fifth day of the week is Friday");
                    break;

                case 6: System.out.println("Sixth day of the week is Saturday");
                    break;

                case 7: System.out.println("Seventh day of the week is Sunday");
                    break;
                    
                case 8: System.exit(0);
                    break;

                default: System.out.println("Invalid Input.");
            }            
        };
    }
}
