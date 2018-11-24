<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
</head>
<body>

 <form action="doupdatesearch">
<table border="2">
<tr>
<th>Id</th>
<th>Name</th>
<th>Designation</th>
<th>Salary</th>
<th>Gender</th>
</tr>

<tr>
<td><input name="empId" value="${emp.empId}" readonly="readonly" /></td>

<td>${emp.empName}</td>
<td>${emp.empDesignation}</td>
<td>${emp.empSalary}</td>
<td>${emp.empGender}</td>
</tr>
</table><br>
<input type="submit" value="Update details">
</form>
</body>
</html>