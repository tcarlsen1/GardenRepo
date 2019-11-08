<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.tcarlsen.web.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Garden Size Result</title>
</head>
<body>
<H1>Hello World</H1>


<% 
String output = request.getAttribute("output").toString();

out.println(output);


%>

</body>
</html>