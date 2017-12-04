<%-- 
    Document   : check
    Created on : Jun 28, 2017, 9:38:03 AM
    Author     : ACS
--%>

<%@page import="mypack.DBManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
        <%
        DBManager db=new DBManager();
        out.print(db.getCon());
       
        %>
        </h1>
    </body>
</html>
