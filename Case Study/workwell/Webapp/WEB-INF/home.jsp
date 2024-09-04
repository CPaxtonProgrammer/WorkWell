
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WORK WELL</title>
</head>
<body>
    <h1>WORK WELL</h1>
    <form action="/addEmployee" method="post">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required>
        <br>
        <label for="middleName">Middle Name:</label>
        <input type="text" id="middleName" name="middleName">
        <br>
        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required>
        <br>
        <label for="birthDate">Birth Date:</label>
        <input type="date" id="birthDate" name="birthDate" required>
        <br>
        <label for="position">Position:</label>
        <input type="text" id="position" name="position" required>
        <br>
        <button type="submit">Add Employee</button>
    </form>
    <br>
    <form action="/searchEmployees" method="get">
        <label for="searchTerm">Search Term:</label>
        <input type="text" id="searchTerm" name="searchTerm" required>
        <br>
        <button type="submit">Search Employees</button>
    </form>
</body>
</html>
