<%-- 
    Document   : AddPublisher
    Created on : Oct 28, 2020, 5:17:06 PM
    Author     : Meet Patel
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AddPublisher jsp</title>
    </head>
    <body>
        <center>
            <%                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectbook", "root", "");
                Statement st = con.createStatement();
                String name = request.getParameter("pu_name");
                int mob = Integer.parseInt(request.getParameter("pu_mobile"));
                String add = request.getParameter("pu_add");
                int aadh = Integer.parseInt(request.getParameter("pu_aadharNo"));
                String qry = "insert into publishermaster (Pub_name, Pub_Mobile, Pub_Add, Pub_AadharNo) values('"+name+"', "+mob+", '"+add+"', "+aadh+")";              
                int d = st.executeUpdate(qry);
                if(d > 0){                     
                    response.sendRedirect("ViewAllPublisher.jsp");
                }
            %>                
        </center>
    </body>
</html>
