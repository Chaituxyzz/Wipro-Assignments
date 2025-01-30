<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    String registeredUser = (String) session.getAttribute("registeredUser");
    String registeredPassword = (String) session.getAttribute("registeredPassword");

    if (username != null && password != null && username.equals(registeredUser) && password.equals(registeredPassword)) {
        session.setAttribute("user", username);
        response.sendRedirect("welcome.jsp"); // Redirect to welcome page
    } else {
        response.sendRedirect("error.jsp"); // Redirect to error page
    }
%>