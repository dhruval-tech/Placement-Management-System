<%-- 
    Document   : logout
    Created on : 22 Apr, 2020, 3:57:31 AM
    Author     : Dhruval
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    session.invalidate();
     RequestDispatcher rs=request.getRequestDispatcher("Home.html");
     rs.forward(request, response);
%>
        
