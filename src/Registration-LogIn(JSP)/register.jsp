<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username != null && password != null) {
        session.setAttribute("registeredUser", username);
        session.setAttribute("registeredPassword", password);
        response.sendRedirect("login.jsp"); // Redirect to login page after registration
    } else {
        response.sendRedirect("index.jsp"); // Redirect back if registration fails
    }
%>
