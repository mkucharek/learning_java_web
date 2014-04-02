<%@ include file="/WEB-INF/jsp/include.jsp"%>

<html>
<head>
<title><fmt:message key="title" /></title>
</head>
<body>
	<h1>
		<fmt:message key="title" />
	</h1>
	<h3>
		<fmt:message key="students" />
	</h3>
	<c:forEach items="${students}" var="student">
		<c:out value="${student.firstName}" />
		<c:out value="${student.surName}" />
		<br>
		<br>
	</c:forEach>
	<a href="<c:url value="addstudent.htm" />">Add student</a>
</body>
</html>