<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Add Manufacturer</title>
</head>
<body>
    <h2>Add new Manufacturer</h2>
        <form:form method="post" modelAttribute="manufacturer">
            <form:input type="hidden" path="id" id="id"/>
            <table>
                <tr>
                    <td><label for="name">Name: </label> </td>
                    <td><form:input path="name" id="name"/></td>
                    <
                </tr>
                <tr>
                    <td colspan="3">
                        <c:choose>
                            <c:when test="${edit}">
                                <input type="submit" value="Update">
                            </c:when>
                            <c:otherwise>
                                <input type="submit" value="Add">
                            </c:otherwise>
                        </c:choose>
                    </td>
                </tr>
            </table>
        </form:form>
<br/>
<br/>
Go back to  <a href="<c:url value="/listM" />">List of All Manufacturer</a>

</body>
</html>
