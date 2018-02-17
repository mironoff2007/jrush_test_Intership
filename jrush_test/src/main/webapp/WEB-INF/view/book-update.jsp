<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page  contentType="text/html;charset=utf-8" %>
<!DOCTYPE html>
<html>

<head>
	<title>Update Book</title>
</head>
<body>
	<div id="container">
		<h3>Update book</h3>
	
		<form:form action="saveBook" modelAttribute="book" method="POST">
		<form:hidden path="author" />
		<form:hidden path="read_already" />
		<form:hidden path="id" />
			<table>
				<tbody>
					<tr>
						<td><label>Title:</label></td>
						<td><form:input path="title" /></td>
					</tr>
				    <tr>
						<td><label>Description:</label></td>
						<td><form:input path="description" /></td>
					</tr>
					
					<tr>
						<td><label>Print year:</label></td>
						<td><form:input path="print_year" /></td>
					</tr>
					<tr>
						<td><label>ISBN:</label></td>
						<td><form:input path="isbn" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
	
		<p>
			<a href="${pageContext.request.contextPath}/book/list">Back to List</a>
		</p>
	</div>
</body>
</html>



		






