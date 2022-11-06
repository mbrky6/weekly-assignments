<%-- 
    Document   : index
    Created on : Nov 4, 2022, 1:54:48 PM
    Author     : mbrky6
--%>

<%@page import = "webfiles.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Salary Information page</title>
    </head>
    <body>
        <div>
            <h2>Salary Info Submission Form</h2>
            <!-- Form to collect and submit info into the database -->
            <form method="GET" action="index.jsp">
                <p>First Name: <input type="text", name="firstName"></p>
                <p>Last Name: <input type="text", name="lastName"></p>
                <p>Rank: <input type="text", name="rank"></p>
                <p>Salary: $<input type="text", name="salary"></p>
                <p><input type="submit" value="Insert"></p>
            </form>
        </div>
        <div>
            <!-- Table to read and display info from the database -->
            <table name="gathered">
                <thead>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Rank</th>
                <th>Salary</th>
                </thead>
                <!-- Java: Add a new table row for every new set of data inserted -->
                <%
                String secretThing1 = "jdbc:mysql://localhost:3306/test";
                String secretThing2 = "root";
                String secretThing3 = "";
                // Yeah, I'm a cybersecurity expert. How could you tell?
                
                DBConnector db = new DBConnector(secretThing1, secretThing2, secretThing3);
                String[] fields = {"firstName", "lastName", "salary", "rank"};
                Object[] values = {request.getParameter("firstName"), request.getParameter("lastName"), request.getParameter("salary"), request.getParameter("rank")};
                
                int result = db.addData("salary", fields, values);
                %>
                
                <p>Result: <%= result%></p>
                <tbody>
                    <tr>
                        <td>
                            <p><%= request.getParameter("firstName")%></p>
                        </td>
                        <td>
                            <p><%= request.getParameter("lastName")%></p>
                        </td>
                        <td>
                            <p><%= request.getParameter("rank")%></p>
                        </td>
                        <td>
                            <p>$<%= request.getParameter("salary")%></p>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
