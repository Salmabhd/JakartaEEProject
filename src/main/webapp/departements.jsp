<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Liste des Départements</title></head>
<body>
<h2>Départements</h2>
<table border="1">
    <tr><th>ID</th><th>Nom</th></tr>
    <c:forEach var="d" items="${departements}">
        <tr>
            <td>${d.id}</td>
            <td>${d.nom}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
