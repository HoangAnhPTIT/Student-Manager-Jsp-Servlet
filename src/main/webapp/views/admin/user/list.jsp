
<%@ include file="/common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
	<div class="main">
		<table class="tableUser">
			<tr>
				<th>UserName</th>
				<th>Adress</th>
				<th>Age</th>
				<th>Gender</th>
				<th>Action</th>
			</tr>

			</tr>
			<c:forEach var="item" items="${model.listUser}">
				<tr>
					<td>${item.fullName}</td>
					<td>${item.address}</td>
					<td>${item.age}</td>
					<td>${item.gender}</td>
					<td>
						<button>
							<a href="<c:url value='/quan-tri-edit-user?type=edit&typeUser=student'/>">
								<i class="fa fa-refresh" aria-hidden="true"></i> 
							</a>
						</button>
						<button>
							<a href="">
								<i class="fas fa-trash-alt"></i> 
							</a>
						</button>
		
					</td>
				</tr>

			</c:forEach>
		</table>


	</div>

</body>
</html>