<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>UploadFile</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  	
  	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet" type="text/css"></link>
</head>
<body>	
	<div align="center">
		<h1 class="title-color">Upload</h1>
        <table border="0" cellpadding="5" class="table table-fit">
            <tr>
                <th class="label-color">File Name</th>
                <th></th>
                <th class="label-color">Optimal</th>
            </tr>
            <c:forEach items="${lists}" var="map" >
            	<c:forEach items="${map}" var="entry">
        			<tr>
                    	<td class="text-color"><c:out value="${entry.key}" /></td>
                    	<td><button class="btn btn-success" type="button">Browser</button></td>
                    	<td class="text-color">
            				<c:if test = "${entry.value == '1'}">
         						<c:out value="(*)"/>
      						</c:if>
                    	</td>
                </tr>
    			</c:forEach>
            </c:forEach>
        </table>
        <br>
        <button type="button" class="btn btn-primary">OK</button>
    </div>
</body>
</html>