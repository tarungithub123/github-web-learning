<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Region</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-style.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>Release Management System</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Customer</h3>
	
		<form:form action="saveRegion" modelAttribute="region" method="POST">
		
			<table>
				<tbody>
					
					<tr>
						<td><label>Region name:</label></td>
						<td><form:input path="regioncode" /></td>
					</tr>

					<tr>
						<td><label>Region Desc:</label></td>
						<td><form:input path="regiondesc" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/Region/list">Home</a>
		</p>
	
	</div>

</body>

</html>










