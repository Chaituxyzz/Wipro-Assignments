<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    session.invalidate(); // Clear session data
    response.sendRedirect("login.jsp"); // Redirect to login page
%>
