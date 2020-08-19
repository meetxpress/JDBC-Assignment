package Ass2;
import java.sql.*;
import java.util.Scanner;

public class Q1 {          
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");                
        }catch (ClassNotFoundException ex){
            System.out.println(ex);
        }
    }
    
    public static void display(Statement st, String qry) {
        try {
            ResultSet rs = st.executeQuery(qry);
            System.out.println("************************Records************************");
            System.out.println("ID\t\tName\t\t\tActor\t\tActress");
            while(rs.next()){                        
                System.out.println("" + rs.getInt("mId") + "\t\t"+rs.getString("mName")+ "\t\t" + rs.getString("mActor") + "\t\t" + rs.getString("mActress"));                        
            }   
            System.out.println("*******************************************************");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);          
            while(true){
                System.out.println("==================MENU==================");            
                System.out.println("1. Insert Movie Details.");
                System.out.println("2. Update Movie Details.");
                System.out.println("3. Delete Movie Details.");
                System.out.println("4. Display specific Movie Detail.");
                System.out.println("5. Display all Movies.");
                System.out.println("6. Exit.");
                System.out.println("========================================");
                System.out.print("Enter Your choice: ");
                int ch = sc.nextInt();                   

                String qry = " ";
                int rowup = 0;
                ResultSet rs;

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc programs", "root", "");        
                Statement st = con.createStatement();

                switch(ch){
                    case 1:
                        while(true){
                            sc.nextLine();
                            System.out.print("Enter Movie Name: ");
                            String mName = sc.nextLine();                                                           
                            System.out.print("Enter Actor's Name: ");
                            String mActor = sc.nextLine();                    
                            System.out.print("Enter Actress's Name: ");
                            String mActress = sc.nextLine();

                            qry = "INSERT INTO moviemaster(mName, mActor, mActress) VALUES('"+mName+"','"+mActor+"','"+mActress+"')";
                            rowup = st.executeUpdate(qry);                     
                            if(rowup > 0){
                                System.out.println(rowup+" Row Inserted.");
                            } else {
                                System.out.println("Somethings Went Wrong.");
                            }
                            
                            System.out.println("You want to add another data?");
                            String c = sc.nextLine();
                            if(c.equalsIgnoreCase("No")){
                                break;
                            }
                        }
                    break;

                    case 2:                     
                        sc.nextLine();                    
                        qry = "SELECT * FROM moviemaster";
                        rs = st.executeQuery(qry);
                        display(st,qry);

                        System.out.print("Enter Id of the Movie want to Update: ");                   
                        String upSearch = sc.nextLine();                    
                        System.out.print("Enter Name of the Movie: ");                   
                        String upName = sc.nextLine();

                        qry = "UPDATE moviemaster SET mName='"+upName+"' WHERE mId='"+upSearch+"'";
                        rowup = st.executeUpdate(qry);
                        if(rowup > 0){
                            System.out.println(rowup+" Row Updated.");                        
                            qry = "SELECT * FROM moviemaster WHERE mId = '"+upSearch+"'";
                            rs = st.executeQuery(qry);
                            display(st,qry);
                        } else {
                            System.out.println("Somethings Went Wrong.");
                        }
                    break;

                    case 3: 
                        System.out.print("Enter Id of the Movie want to delete: ");                   
                        int delId = sc.nextInt();                    

                        qry = "SELECT * FROM moviemaster";
                        rs = st.executeQuery(qry);
                        display(st,qry);

                        qry = "DELETE FROM moviemaster WHERE mId='"+delId+"'";
                        rowup = st.executeUpdate(qry);
                        if(rowup > 0){
                            System.out.println(rowup+" Row deleted.");
                        } else {
                            System.out.println("Somethings Went Wrong.");
                        }
                    break;

                    case 4:
                        sc.nextLine();                  
                        System.out.print("Enter the movie name you want to display the details: ");
                        String disName = sc.nextLine();                    

                        qry = "SELECT * FROM moviemaster WHERE mName = '"+disName+"'";
                        rs = st.executeQuery(qry);
                        display(st,qry);
                        break; 

                    case 5:                     
                        qry = "SELECT * FROM moviemaster";
                        rs = st.executeQuery(qry);
                        display(st,qry);
                        break; 

                    case 6:
                        System.exit(0);
                    break;

                    default: System.out.println("Invalid Input.");
                }
            }                                  
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}