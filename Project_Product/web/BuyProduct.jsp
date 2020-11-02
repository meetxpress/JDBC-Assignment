<%-- 
    Document   : BuyProduct
    Created on : Nov 2, 2020, 5:42:58 PM
    Author     : Meet Patel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
    </head>
    <body>
        <center>
            <h1>Product Details</h1>
            <form action="ProductInvoice.jsp">
                <table border="1">
                    <tbody>                        
                        <tr>
                            <td>Product Name: </td>
                            <td><input type="text" name="pname" value="<%=request.getParameter("name")%>" readonly="readonly"</td>
                        </tr>
                        <tr>
                            <td>Product Price </td>
                            <td><input type="text" name="price" value="<%=request.getParameter("price")%>" readonly="readonly"</td>
                        </tr>
                        <tr>                        
                            <td>Product Quantity </td>                        
                            <td><input type="text" name="qty" value="" placeholder="Enter Your Quantity"/></td>
                        </tr>                  
                        <tr>
                            <td></td>
                            <td><input type="submit" value="Checkout"/></td>
                        </tr>
                    </tbody>                
                </table>
            </form>
        </center>
        
    </body>
</html>
