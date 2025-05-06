<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Liste des Filières</title>
</head>
<body>
    <h2>Filières</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nom</th>
            <th>Département</th>
        </tr>
        <c:forEach var="f" items="${filieres}">
            <tr>
                <td>${f.id}</td>
                <td>${f.nom}</td>
                <td>${f.departementId}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>