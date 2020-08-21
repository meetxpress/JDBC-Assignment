package Ass2;
import java.util.Scanner;
import java.sql.*;

public class Q2 {
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch(ClassNotFoundException ex){
            System.out.println(ex);
        }        
    }
    
    public static void DisplayData(Statement st, String qry){
        try{
          ResultSet rs = st.executeQuery(qry);
          System.out.println("************************Records************************");
            System.out.println("ID\t\tName\t\tAddress\t\tSalary");
            while(rs.next()){                        
                System.out.println("" + rs.getInt("eId") + "\t\t"+rs.getString("eName")+ "\t\t" + rs.getString("adds") + "\t\t" + rs.getString("sal"));                        
            }   
            System.out.println("*******************************************************");
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.println("==================MENU==================");            
                System.out.println("1. Insert employee details.");
                System.out.println("2. Display employee details.");
                System.out.println("3. Display employee details whos name starts from 'R'.");
                System.out.println("4. Display lowest salary.");
                System.out.println("5. Display highest salary.");
                System.out.println("6. Display total number of employees.");
                System.out.println("7. Display employee details accoeding to their salary in accesending order.");
                System.out.println("8. Display employee details accoeding to their salary in dessending order.");
                System.out.println("9. Exit.");
                System.out.println("========================================");
                System.out.print("Enter Your choice: ");
                int ch = sc.nextInt();   
                
                String qry = " ";
                ResultSet rs;
                int rowup = 0;                
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc programs", "root", "");
                Statement st =  con.createStatement();                
                switch(ch){
                    case 1: 
                        while(true){
                            sc.nextLine();
                            System.out.print("Enter Employee Name: ");
                            String eName = sc.nextLine();
                            System.out.print("Enter Employee Address: ");
                            String add = sc.nextLine();
                            System.out.print("Enter Employee Salary: ");
                            float sal = sc.nextFloat();                            
                            qry = "INSERT INTO empmaster(ename, adds, sal) VALUES('"+eName+"', '"+add+"', "+sal+")";
                            rowup = st.executeUpdate(qry);
                            if(rowup > 0){
                                System.out.println(rowup+" Row Inserted.");
                            } else {
                                System.out.println("Somethings Went Wrong.");
                            }                        
                            sc.nextLine();
                            System.out.print("Would you like to add new record?(Yes/No): ");
                            String c = sc.nextLine();                            
                            if(c.equalsIgnoreCase("no")){                                                           
                                break;
                            }                            
                        }    
                        break;
                    
                    case 2: 
                            sc.nextLine();
                            qry = "select * from empmaster";
                            rs = st.executeQuery(qry);
                            DisplayData(st, qry);                                                       
                        break;
                       
                    case 3: 
                            sc.nextLine();
                            qry = "select * from empmaster where ename like 'A%'";
                            rs = st.executeQuery(qry);
                            DisplayData(st, qry); 
                        break;    
                        
                    case 4: 
                            sc.nextLine();
                            qry = "select min(sal) from empmaster";
                            rs = st.executeQuery(qry);                            
                            rs.next();
                            System.out.println("Lowest salary is " + rs.getString(1));                             
                        break;
                        
                    case 5: 
                            sc.nextLine();
                            qry = "select max(sal) from empmaster";
                            rs = st.executeQuery(qry);                            
                            rs.next();
                            System.out.println("Highest salary is " + rs.getString(1));
                        break;
                        
                    case 6: 
                            sc.nextLine();
                            qry = "select count(*) from empmaster";
                            rs = st.executeQuery(qry);                            
                            rs.next();
                            System.out.println("Total number of employee is " + rs.getString(1));
                        break;
                        
                    case 7: 
                            sc.nextLine();
                            qry = "select * from empmaster order by sal";
                            rs = st.executeQuery(qry);                                                        
                            DisplayData(st, qry);
                        break;
                        
                    case 8: 
                            sc.nextLine();
                            qry = "select * from empmaster order by sal Desc";
                            rs = st.executeQuery(qry);                                                        
                            DisplayData(st, qry);
                        break;
                        
                    case 9: 
                        System.exit(0);
                        break;
                        
                    default: System.out.println("Invalid input. Please enter valid input.");                    
                }
            }
        } catch(Exception ex){
            System.out.println(ex);
        }
    }
}