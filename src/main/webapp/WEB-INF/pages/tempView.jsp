<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Make Uri</title>
</head>
<body>
	<h1>Upload</h1>
	
	<jsp:scriptlet>
			String[] tail = (String[]) request.getAttribute("tail");
			pageContext.setAttribute("tail", tail);
			
            String[] splitSemicolon = (String[]) request.getAttribute("splitSemicolon");
            pageContext.setAttribute("splitSemicolon", splitSemicolon);
    </jsp:scriptlet>
		
		<table>
			<tbody>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
			</tbody>
		</table>
        <%-- JSTL foreach tag example to loop an array in jsp --%>
        <c:forEach var="splitSemicolon" items="${pageScope.splitSemicolon}"> 
            <c:out value="${splitSemicolon}"/>
            
        	
            <button type="button">Browser</button>
            
   			<br>
        </c:forEach>
        
        <c:forEach var="tail" items="${pageScope.tail}"> 
            
            <c:if test = "${tail== '1'}">
         		<c:out value="(*)"/>
      		</c:if>
        
   			<br>
        </c:forEach>
        
     
   
   <button type="button">Upload</button>
 
</body>
</html>