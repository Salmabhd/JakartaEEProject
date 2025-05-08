<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
     <head>
        <title>
            Liste des Inscriptions
        </title>
    </head>
     <body>
         <h2>Inscriptions</h2>
          <table border="1">
             <tr>
                <th>ID</th>
                <th>ID Étudiant</th>
                <th>ID Matière</th>
                <th>Date</th>
            </tr> 
            <c:forEach var="i" items="${inscriptions}">
                 <tr> <td>${i.id}</td>
                     <td>${i.idEtudiant}</td> 
                     <td>${i.idMatiere}</td>
                     
                     <td>${i.dateInscription}</td>
                 </tr> </c:forEach>
          </table>
     </body> 
</html>