<%@ include file="/WEB-INF/jsp/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
	<head>
	<title><fmt:message key="title" /> &bull; <fmt:message key="addstudent.heading" /></title>
	<style>
		.error {
			color: red;
		}
	</style>
	</head>
	<body>
		<h1>
			<fmt:message key="addstudent.heading" />
		</h1>
		<form:form method="post" modelAttribute="addStudent">
			<table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
				<tr>
					<td align="right" width="25%">First Name:</td>
					<td width="25%"><form:input path="firstName" /></td>
					<td width="50%"><form:errors path="firstName" cssClass="error" />
				</tr>
				<tr>
					<td align="right" width="25%">Sur Name:</td>
					<td width="25%"><form:input path="surName" /></td>
					<td width="50%"><form:errors path="surName" cssClass="error" />
				</tr>
			</table>
			<br />
			<input type="submit" align="center" value="Add">
		</form:form>
		<a href="<c:url value="hello.htm" />">Home</a>
	</body>
</html>