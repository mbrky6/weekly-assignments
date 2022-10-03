<%-- 
    Document   : index
    Created on : Oct 2, 2022, 12:36:10 PM
    Author     : mbrky6
--%>
<%@page import = "webfiles.Triangle"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Triangle Calculator</title>
    </head>
    <body>
        <h1>Triangle Calculator</h1>
        <%
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(3.0,6.0,7.0);
        %>
        <h3>On this page are 2 triangles:</h3>
        <ul>
            <li>The 1st <%=triangle1.toString()%></li>
            <li>Area: <%=triangle1.getArea()%></li>
            <li>Perimeter: <%=triangle1.getPerimeter()%></li>
        </ul>
        <ul>
            <li>The 2nd <%=triangle2.toString()%></li>
            <li>Area: <%=triangle2.getArea()%></li>
            <li>Perimeter: <%=triangle2.getPerimeter()%></li>
        </ul>
    </body>
</html>
