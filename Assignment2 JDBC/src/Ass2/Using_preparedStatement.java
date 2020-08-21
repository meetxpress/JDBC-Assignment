package Ass2;
import java.sql.*;
import java.util.Scanner;

public class Using_preparedStatement {
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");                
        }catch (ClassNotFoundException ex){
            System.out.println(ex);
        }
    }
    
    public static void displayData2(Connection con) {
        try {            
            String qry = "select * from moviemaster2";
            PreparedStatement ps = con.prepareStatement(qry);
            ResultSet rs = ps.executeQuery();
            System.out.println("************************Records************************");
            System.out.println("ID\t\tName\t\t\tActor\t\t\tActress");
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
                                       
                            qry = "INSERT INTO moviemaster2(mName, mActor, mActress) VALUES(?, ?, ?)";
                            PreparedStatement ps = con.prepareStatement(qry);
                            ps.setString(1, mName);
                            ps.setString(2, mActor);
                            ps.setString(3, mActress);
                            rowup = ps.executeUpdate();            
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
                        displayData2(con);                                                
                        sc.nextLine();    
                        System.out.print("Enter Id of the Movie want to Update: ");                   
                        int upSearch = sc.nextInt();  
                        sc.nextLine();    
                        System.out.print("Enter Name of the Movie: ");                   
                        String upName = sc.nextLine();

                        qry = "UPDATE moviemaster2 SET mName=? WHERE mId=?";
                        PreparedStatement psup = con.prepareStatement(qry);
                        psup.setString(1, upName);
                        psup.setInt(2, upSearch);                        
                        rowup = psup.executeUpdate();                                    
                        if(rowup > 0){
                            System.out.println(rowup+" Row Updated.");                        
                            displayData2(con);
                        } else {
                            System.out.println("Somethings Went Wrong.");
                        }
                    break;

                    case 3: 
                        displayData2(con);
                        System.out.print("Enter Id of the Movie want to delete: ");                   
                        int delId = sc.nextInt();                                            
                        
                        qry = "DELETE FROM moviemaster2 WHERE mId= ?";
                        PreparedStatement psdel = con.prepareStatement(qry);
                        psdel.setInt(1, delId);                                                
                        rowup = psdel.executeUpdate();            
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

                        qry = "SELECT * FROM moviemaster2 WHERE mName = ?";
                        PreparedStatement psdis = con.prepareStatement(qry);
                        psdis.setString(1, disName);                             
                        ResultSet rs2 = psdis.executeQuery();  
                        rs2.next();
                        System.out.println("************************Records************************");
                        //System.out.println("ID\t\tName\t\t\tActor\t\tActress");                        
                        System.out.println("" + rs2.getInt("mId") + "\t\t"+rs2.getString("mName")+ "\t\t" + rs2.getString("mActor") + "\t\t" + rs2.getString("mActress"));
                        System.out.println("*******************************************************");                        
                        break; 

                    case 5:                     
                        displayData2(con);
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
