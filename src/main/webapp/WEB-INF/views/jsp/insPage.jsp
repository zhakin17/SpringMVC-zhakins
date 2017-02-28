<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="backUrl" value="/" />
<c:url var="saveUrl" value="/add" />

<h1>ADD</h1>


<form:form modelAttribute="productAttribute" method="POST" action="${saveUrl}">
	<ul>
					<li>						
						<form:input path="name"  />
					</li>
					
					<li>						
						<form:input path="description"  />
					</li>
					
					<li>
						<input type="submit" value="SAVE ADD">
					</li>
		
	</ul>
	
</form:form>
</body>
</html>