<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ViewAllPublisher jsp</title>
    </head>
    <body>
         <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectbook", "root", "");                        
            Statement st = con.createStatement(); 
            String qry = "select * from publishermaster";
            ResultSet rs = st.executeQuery(qry);            
        %>
        <center>
            <h1>View All Publisher</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Mobile No.</th>
                        <th>Address</th>
                        <th>AadharCard No.</th>
                        <th>Operation</th>
                        <th>Operation</th>
                    </tr>
                </thead>               
                <tbody>
                    <%
                        while(rs.next()){
                            int id = rs.getInt(1);
                            String name = rs.getString(2);
                            int mob = rs.getInt(3);
                            String add = rs.getString(4);
                            int aadhar = rs.getInt(5);                                
                    %>
                    <tr>
                        <td><%=id%></td>
                        <td><%=name%></td>
                        <td><%=mob%></td>
                        <td><%=add%></td>
                        <td><%=aadhar%></td>
                        <td><a href="UpdatePublisher.jsp?id=<%=id%>&name=<%=name%>&mob=<%=mob%>&add=<%=add%>&aadhar=<%=aadhar%>">Update</a></td>
                        <td><a href="DeletePublisher?id=<%=id%>">Delete</a></td>
                    </tr>
                    <%
                        }
                    %>                    
                </tbody>
            </table><br>
            <a href="index.jsp"><input type="submit" value="Home"/></a>                     
        </center> 
    </body>
</html>
