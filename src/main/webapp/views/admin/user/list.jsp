<%@ include file="/common/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
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
                        <c:if test="${param.typeUser=='student'}">
                            <a href="<c:url value='/quan-tri-edit-user?type=edit&typeUser=student&action=update'/>">
                                <i class="fa fa-refresh" aria-hidden="true"></i>
                            </a>
                        </c:if>
                        <c:if test="${param.typeUser=='teacher'}">
                            <a href="<c:url value='/quan-tri-edit-user?type=edit&typeUser=teacher&action=update'/>">
                                <i class="fa fa-refresh" aria-hidden="true"></i>
                            </a>
                        </c:if>
                    </button>

                </td>
            </tr>

        </c:forEach>

    </table>
    <button class="bt bt_black bt_delete" type="button">Delete</button>
    <c:if test="${param.typeUser=='teacher'}">
        <a href="<c:url value='/quan-tri-edit-user?type=edit&typeUser=teacher&action=add'/>">
            <button class="bt bt_green bt_add" type="button">Add User</button>
        </a>
    </c:if>
    <c:if test="${param.typeUser=='student'}">
        <a href="<c:url value='/quan-tri-edit-user?type=edit&typeUser=student&action=add'/>">
            <button class="bt bt_green bt_add" type="button">Add User</button>
        </a>
    </c:if>

</div>

</body>
</html>