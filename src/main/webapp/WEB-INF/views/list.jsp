<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List Data</title>
</head>
<body>
<h2>Data List</h2>
<table border="1">
    <tr>
        <th>Details</th>
    </tr>
    <c:forEach items="${data}" var="item">
        <tr>
            <td>${item}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
