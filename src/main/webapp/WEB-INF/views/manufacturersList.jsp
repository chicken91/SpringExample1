<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Manufacturer</title>
</head>
<body>
    <h2>List of Manufacturers</h2>
    <table>
        <tr>
            <td>Name</td><td>Id</td>
        </tr>
        <c:forEach items="${manufacturers}" var="manufacturer">
            <tr>
                <td>${manufacturer.name}</td>
                <td>${manufacturer.id}</td>
                <td><a href="<c:url value="/edit-${manufacturer.id}-manufacturer" />">edit</a> </td>
                <td><a href="<c:url value="/delete-${manufacturer.id}-manufacturer"/> ">delete</a> </td>
            </tr>
        </c:forEach>
    </table>
<br/>
<a href="<c:url value="/addM"/> ">Add New Manufacturer</a>

</body>
</html>
