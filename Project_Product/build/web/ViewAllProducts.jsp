<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View All Products JSP Page</title>
    </head>
    <body>
        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectproduct", "root", "");            
            Statement st = con.createStatement();
            String qry = "select * from productmaster";
            ResultSet rs= st.executeQuery(qry);
        %>
        <center>
            <h1>Product Details</h1>
            <table border="1">
                <thead>
                    <tr>
                        <td>Id</td>
                        <td>Name</td>
                        <td>Description</td>
                        <td>Price</td>
                        <td>Operation</td>                                            
                        <td>Quantity</td>
                        <td>Operation</td>
                    </tr>
                </thead>
                <tbody>
                    <%
                        while(rs.next()){                             
                    %>
                    <tr>                    
                        <td><%=rs.getInt(1)%></td>
                        <td><%=rs.getString(2)%></td>
                        <td><%=rs.getString(3)%></td>
                        <td><%=rs.getInt(4)%></td>
                        <td><a href="UpdateProduct.jsp?id=<%=rs.getInt(1)%>&name=<%=rs.getString(2)%>&desc=<%=rs.getString(3)%>&price=<%=rs.getInt(4)%>">Update</a></td>
                        <td><a href="DeleteProduct?id=<%=rs.getInt(1)%>">Delete</a></td>                                                                           
                        <td><a href="BuyProduct.jsp?id=<%=rs.getInt(1)%>&name=<%=rs.getString(2)%>&price=<%=rs.getInt(4)%>">
                            <input type="submit" value="Buy Now"</a>
                        </td>                        
                    </tr>
                    <%
                        }                        
                    %>
                </tbody>
            </table>
                <br><a href="index.html"><input type="submit" value="Home" /></a>                
        </center>
    </body>
</html>
