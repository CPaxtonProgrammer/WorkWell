
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Results</title>
</head>
<body>
    <h1>Search Results</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Position</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="employee" items="${employees}">
                <tr>
                    <td>${employee.employeeId}</td>
                    <td>${employee.firstName}</td>
                    <td>${employee.lastName}</td>
                    <td>${employee.position}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
