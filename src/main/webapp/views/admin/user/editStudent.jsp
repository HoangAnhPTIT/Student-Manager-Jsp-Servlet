<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/common/taglib.jsp"%>
<c:url var="APIurl" value="/api/student" />
<c:url var="redirectUrl" value="quan-tri/list" />
<html>

<head>
<title>Chỉnh sửa bài viết</title>
</head>

<body>
    <div class="main">
        <div class="container">
            <form action="">
                <div class="row">
                    <div class="col-25">
                        <label for="fname">
                            Full Name
                        </label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="fname" name="fullName" placeholder="Full Name">
                    </div>
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="address">
                            Address
                        </label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="address" name="address" placeholder="Address">
                    </div>
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="gender">
                            Gender
                        </label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="gender" name="gender" placeholder="Gender">
                    </div>
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="age">
                            Age
                        </label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="age" name="age" placeholder="Age">
                    </div>
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="svNam">
                            SvNam
                        </label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="svNam" name="svNam" placeholder="SvNam">
                    </div>
                </div>
                <div>
                    <c:if test="${param.action=='update'}">
                        <button type="submit">Update student</button>
                    </c:if>
                    <c:if test="${param.action=='add'}">
                        <button type="submit">Add student</button>
                    </c:if>

                </div>
            </form>
        </div>
    </div>
	
</body>
</div>
</html>