<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:url var="addUrl" value="add"/>

<html>
<head>
<meta >
	<title>Home1</title>
</head>
<body>
<h1>
	List Product
	<a href="${addUrl}">Add Product</a>
</h1>


<%-- <c:forEach items="products" var="prod" >

	<c:out value="${prod.name}"></c:out>
	
</c:forEach> --%>

</body>
</html>
