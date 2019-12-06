<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>

<title>List Regions</title>
<!-- Link reference to css -->>
<link type = "text/css"
	rel ="stylesheet"
	href = "${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>Release Management System</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
		<!-- Adding button to create regions -->>
		<input type="button" value = "Add Region"
			onclick = "window.location.href = 'showformforAdd'; return false;"
			class = "add-button"
			/>
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>S.No</th>
					<th>Region Code</th>
					<th>Region</th>
					<th>Add Projects</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempRegion" items="${region}">
				
					<tr>
						<td> ${tempRegion.id} </td>
						<td> ${tempRegion.regioncode} </td>
						<td> ${tempRegion.regiondesc} </td>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	
	
	
</body>

</html>