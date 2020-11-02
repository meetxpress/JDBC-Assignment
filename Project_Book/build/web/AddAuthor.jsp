<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AddAuthor jsp</title>
    </head>
    <body>
        <center>
            <%                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectbook", "root", "");
                Statement st = con.createStatement();
                String name = request.getParameter("au_name");
                int mob = Integer.parseInt(request.getParameter("au_mobile"));
                String add = request.getParameter("au_add");
                int aadh = Integer.parseInt(request.getParameter("au_aadharNo"));
                String qry = "insert into authormaster (Auth_name, Auth_Mobile, Auth_Add, Auth_AadharNo) values('"+name+"', "+mob+", '"+add+"', "+aadh+")";              
                int d = st.executeUpdate(qry);
                if(d > 0){                     
                    response.sendRedirect("index.jsp");
                }
            %>                
        </center>
    </body>
</html>
