package Ass2;

import java.util.*;
import java.sql.*;

public class Scrollable_Resultset {
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    public static void main(String[] args) {
        try{            
            Scanner sc = new Scanner(System.in);
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc programs", "root", "");        
            Statement st2 = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);                
            ResultSet r = st2.executeQuery("select * from function_master");    
            
            while(true){
                System.out.println("==================MENU==================");            
                System.out.println("01. Firt");
                System.out.println("02. Last");
                System.out.println("03. Next");
                System.out.println("04. Previous");
                System.out.println("05. Relative");
                System.out.println("06. Absolute");
                System.out.println("07. AfterLast");
                System.out.println("08. BeforeFirt");
                System.out.println("09. GetRow");
                System.out.println("10. Exit");
                System.out.println("========================================");
                System.out.print("Enter Your choice: ");
                int ch = sc.nextInt(); 
                
                switch(ch){
                    case 1:                             
                        r.first();
                        System.out.println("************************Records************************");
                        System.out.println("Id\t\tLabel-1\t\tLabel-2");
                        System.out.println("" + r.getInt("id") + "\t\t"+r.getString("label1")+ "\t\t" + r.getString("label2"));                        
                        System.out.println("*******************************************************");                        
                    break;
                    
                    case 2:                                                
                        r.last();
                        System.out.println("************************Records************************");
                        System.out.println("Id\t\tLabel-1\t\tLabel-2");
                        System.out.println("" + r.getInt("id") + "\t\t"+r.getString("label1")+ "\t\t" + r.getString("label2"));                        
                        System.out.println("*******************************************************"); 
                    break;
                        
                    case 3:                        
                        r.next();
                        System.out.println("************************Records************************");
                        System.out.println("Id\t\tLabel-1\t\tLabel-2");
                        System.out.println("" + r.getInt("id") + "\t\t"+r.getString("label1")+ "\t\t" + r.getString("label2"));                        
                        System.out.println("*******************************************************"); 
                    break;
                     
                    case 4:                          
                        r.previous();
                        System.out.println("************************Records************************");
                        System.out.println("Id\t\tLabel-1\t\tLabel-2");
                        System.out.println("" + r.getInt("id") + "\t\t"+r.getString("label1")+ "\t\t" + r.getString("label2"));                        
                        System.out.println("*******************************************************"); 
                    break;
                        
                    case 5:                         
                        sc.nextLine();
                        System.out.print("Enter Position: ");
                        int p5 = sc.nextInt();
                                                
                        if(r.relative(p5)){
                            System.out.println("************************Records************************");
                            System.out.println("Id\t\tLabel-1\t\tLabel-2");
                            System.out.println("" + r.getInt("id") + "\t\t"+r.getString("label1")+ "\t\t" + r.getString("label2"));                        
                            System.out.println("*******************************************************"); 
                        }                        
                    break;
                    
                    case 6: 
                        sc.nextLine();
                        System.out.print("Enter Position: ");
                        int p6 = sc.nextInt();                                                
                        if(r.absolute(p6)){
                            System.out.println("************************Records************************");
                            System.out.println("Id\t\tLabel-1\t\tLabel-2");
                            System.out.println("" + r.getInt("id") + "\t\t"+r.getString("label1")+ "\t\t" + r.getString("label2"));                        
                            System.out.println("*******************************************************"); 
                        }                        
                    break;                    
                        
                    case 7:                         
                        r.afterLast();
                        if(r.isAfterLast()){
                            System.out.println("The Resultset curor is pointing next to last record.");
                        }                        
                    break;
                    
                    case 8:                                               
                        r.beforeFirst();
                        if(r.isBeforeFirst()){
                            System.out.println("The Resultset curor is pointing before the firt record.");
                        }
                    break;
                    
                    case 9:                                            
                        System.out.println("The current location of Resultset pointer: " + r.getRow());
                        break;
                    
                    case 10: System.exit(0);
                        break;
                       
                    default: System.out.println("Invalid Input.");
                }
            }
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
}