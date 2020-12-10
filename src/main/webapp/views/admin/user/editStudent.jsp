<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/common/taglib.jsp"%>
<c:url var="APIurl" value="/api/student" />
<c:url var="redirectUrl" value="quan-tri/list" />
<html>

<head>
<title>Chỉnh sửa bài viết</title>
</head>

<body>
	<div class="containerTableUser">
		<form action="/action_page.php">
			<div class="row">
				<div class="col-25">
					<label for="fname">First Name</label>
				</div>
				<div class="col-75">
					<input type="text" id="fname" name="firstname"
						placeholder="Your name..">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="lname">Last Name</label>
				</div>
				<div class="col-75">
					<input type="text" id="lname" name="lastname"
						placeholder="Your last name..">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="country">Country</label>
				</div>
				<div class="col-75">
					<select id="country" name="country">
						<option value="australia">Australia</option>
						<option value="canada">Canada</option>
						<option value="usa">USA</option>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="subject">Subject</label>
				</div>
				<div class="col-75">
					<textarea id="subject" name="subject"
						placeholder="Write something.." style="height: 200px"></textarea>
				</div>
			</div>
			<div class="row">
				<input type="submit" value="Submit">
			</div>
		</form>
</body>
</div>
</html>