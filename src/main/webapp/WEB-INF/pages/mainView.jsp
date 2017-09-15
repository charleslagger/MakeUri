<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Model And View</title>
</head>
<body>
	<%
		String fName = (String) request.getAttribute("fName");
		String[] temp = fName.split(";");
		String[] tails = new String[temp.length];
		
		for(int i = 0; i < temp.length; i++){
			tails[i] = temp[i].substring(temp[i].indexOf("_") + 1);
		}
		
		pageContext.setAttribute("tails", tails);

	%>
	
	<div align="center">
		<h1>Upload</h1>
        <table border="1" cellpadding="5">
            <tr>
                <th>File Name</th>
                <th></th>
                <th>Optional</th>
            </tr>
            <c:forEach items="${lists}" var="map" >
            	<c:forEach items="${map}" var="entry">
        			<tr>
                    	<td><c:out value="${entry.key}" /></td>
                    	<td><button type="button">Browser</button></td>
                    	<td>
            				<c:if test = "${entry.value == '1'}">
         						<c:out value="(*)"/>
      						</c:if>
                    	</td>
                </tr>
    			</c:forEach>
            </c:forEach>
        </table>
        <br>
        <button type="button">OK</button>
    </div>
</body>
</html>