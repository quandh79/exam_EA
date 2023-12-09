<!-- /WEB-INF/views/sale-list.jsp -->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Sale List</title>
</head>
<body>
<h2>Sale List</h2>
<table border="1">
    <thead>
    <tr>
        <th>Sale ID</th>
        <th>Salesman ID</th>
        <th>Product Name</th>
        <th>Salesman Name</th>
        <th>Date of Sale</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="sale" items="${sales}">
        <tr>
            <td>${sale.slNo}</td>
            <td>${sale.salesmanID}</td>
            <td>${sale.product.prodName}</td>
            <td>${sale.salesmanName}</td>
            <td>${sale.dos}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
