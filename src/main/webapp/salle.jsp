<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Liste des Salles</title></head>
<body>
<h2>Salles</h2>
<table border="1">
    <tr><th>ID</th><th>Numéro</th><th>Capacité</th></tr>
    <c:forEach var="s" items="${salles}">
        <tr>
            <td>${s.id}</td>
            <td>${s.numeroSalle}</td>
            <td>${s.capacite}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
