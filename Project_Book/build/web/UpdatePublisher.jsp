<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <h1>Register Publisher</h1>
            <form action="UpdatePublisherServlet">
                <table style="border: 2px solid black; padding: 10px">
                    <tr>
                        <td>Publisher Id: </td>
                        <td><input type="text" name="pu_id" value="<%=request.getParameter("id")%>" readonly="readonly"/></td>
                    </tr>
                    <tr>
                        <td>Publisher Name: </td>
                        <td><input type="text" name="pu_name" value="<%=request.getParameter("name")%>"/></td>
                    </tr>
                    <tr>
                        <td>Publisher Mobile No:  </td>
                        <td><input type="number" name="pu_mobile" value="<%=request.getParameter("mob")%>"/></td>
                    </tr>
                    <tr>
                        <td>Publisher Address: </td>
                        <td><input type="text" name="pu_add" value="<%=request.getParameter("add")%>"/></td>
                    </tr>
                    <tr>
                        <td>Publisher Aadhar Card No.: </td>
                        <td><input type="number" name="pu_aadharNo" value="<%=request.getParameter("aadhar")%>"/></td>
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
