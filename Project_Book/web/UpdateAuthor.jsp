<%-- 
    Document   : UpdateAuthor
    Created on : Nov 2, 2020, 2:13:01 PM
    Author     : Meet Patel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Author JSP Page</title>
    </head>
    <body>        
        <center>
            <h1>Register Author</h1>
            <form action="UpdateAuthorServlet">
                <table style="border: 2px solid black; padding: 10px">
                    <tr>
                        <td>Author Id: </td>
                        <td><input type="text" name="au_id" value="<%=request.getParameter("id")%>" readonly="readonly"/></td>
                    </tr>
                    <tr>
                        <td>Author Name: </td>
                        <td><input type="text" name="au_name" value="<%=request.getParameter("name")%>"/></td>
                    </tr>
                    <tr>
                        <td>Author Mobile No:  </td>
                        <td><input type="number" name="au_mobile" value="<%=request.getParameter("mob")%>"/></td>
                    </tr>
                    <tr>
                        <td>Author Address: </td>
                        <td><input type="text" name="au_add" value="<%=request.getParameter("add")%>"/></td>
                    </tr>
                    <tr>
                        <td>Author Aadhar Card No.: </td>
                        <td><input type="number" name="au_aadharNo" value="<%=request.getParameter("aadhar")%>"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Update Details"/></td>
                    </tr>
                </table>                            
            </form><br/>
            <a href="index.jsp"><input type="submit" value="Home"/></a>            
        </center>
    </body>
</html>
