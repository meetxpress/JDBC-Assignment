
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <h1>Update Product Details</h1>
            <form action="UpdateProduct">
                <table border="1"> 
                    <tbody>
                        <tr>
                            <td>Enter Product Name: </td>
                            <td><input type="text" name="pd_id" value="<%=request.getParameter("id")%>" readonly="readonly"/></td>
                        </tr>  
                        <tr>
                            <td>Enter Product Name: </td>
                            <td><input type="text" name="pd_name" value="<%=request.getParameter("name")%>"/></td>
                        </tr>                        
                        <tr>
                            <td>Enter Product Description: </td>
                            <td><input type="text" name="pd_desc" value="<%=request.getParameter("desc")%>"/></td>
                        </tr>
                        <tr>
                            <td>Enter Product Price: </td>
                            <td><input type="number" name="pd_price" value="<%=request.getParameter("price")%>"/></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input type="submit" value="Update Product"/></td>
                        </tr>
                    </tbody>
                </table>
            </form>
            <br><a href="index.html"><input type="submit" value="Home"/></a>
        </center>
    </body>
</html>
