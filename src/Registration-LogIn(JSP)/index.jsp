<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <title>Register</title>
</head>
<body>
    <h2>User Registration</h2>
    <form action="register.jsp" method="post">
        <label>Username:</label>
        <input type="text" name="username" required><br><br>
        <label>Password:</label>
        <input type="password" name="password" required><br><br>
        <input type="submit" value="Register">
    </form>
    <a href="login.jsp">Already registered? Login here</a>

</body>
</html>