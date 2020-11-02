<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
    </head>
    <body>
        <center>
            <h1>Product Invoice</h1>
            <table border="1">
                <tr>
                    <td>Product Name: </td>
                    <td><%=request.getParameter("pname")%></td>
                </tr>                
                <tr>
                    <td>Product Quantity: </td>
                    <td><%=request.getParameter("qty")%></td>
                </tr>                
                <tr>
                    <td>Product Price </td>
                    <td><%=request.getParameter("price")%></td>
                </tr> 
                <tr>
                    <% int tot= (Integer.parseInt(request.getParameter("price")) * Integer.parseInt(request.getParameter("qty"))); %>
                    <td>Total Amount </td>
                    <td><%= tot %></td>
                </tr>
                <tr>
                    <td></td>
                    <td><a href="ViewAllProducts.jsp"><input type="submit" value="Checkout" /></a></td>
                </tr>
            </table>
        </center>   
    </body>
</html>
