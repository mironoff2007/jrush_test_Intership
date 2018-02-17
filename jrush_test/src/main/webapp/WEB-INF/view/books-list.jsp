<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page  contentType="text/html;charset=utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>Список книг</h2>

<br></br>
						

		
		<!-- put new button: Add book -->
		
			<input type="button" value="Add Book"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		<!--  add our html table here -->
		
			<table>
			
				<tr>
					<th>Title </th>
					<th>Author </th>
					<th>Description </th>
					<th>Print year </th>
					<th>ISBN </th>
					<th>Read already </th>
					<th>Action </th>
				</tr>
				
				<!-- loop over and print our books -->
				<c:forEach var="tempBook" items="${books}">
				
					<!-- construct an "update" link with Book id -->
					<c:url var="updateLink" value="/book/showFormForUpdate">
						<c:param name="bookId" value="${tempBook.id}" />
					</c:url>					

					<!-- construct an "delete" link with book id -->
					<c:url var="deleteLink" value="/book/delete">
						<c:param name="bookId" value="${tempBook.id}" />
					</c:url>
					
					<!-- construct an "read" link with Book id -->
					<c:url var="readLink" value="/book/readBook">
						<c:param name="bookId" value="${tempBook.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempBook.title}  </td>
						<td>| ${tempBook.author}  </td>
						<td>| ${tempBook.description}  </td>
						<td>| ${tempBook.print_year}  </td>
						<td>| ${tempBook.isbn}  </td>
						<td>| ${tempBook.read_already}  </td>
						
						<td>
							<!-- display the update link -->
							<a href="${readLink}">Read</a>
							|
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this book?'))) return false">Delete</a>
						</td>
						
					</tr>
				
				</c:forEach>
				    		
			</table>
			
			<input type="button" value="Prev"
				   onclick="window.location.href='prevp'; return false;"
				   class="add-button"/>
			
			
		<input type="button" value="Next"
				   onclick="window.location.href='nextp'; return false;"
				   class="add-button"/>
			
			
			
				
<br></br>
</body>
</html>
