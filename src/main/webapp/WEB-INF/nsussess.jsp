<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.Cramer" import="Dao.CramerDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Object[] n = (Object[]) session.getAttribute("N");
	%>
	<div id="Header" style="padding: 30px;">
		<h3 align="center">有解，答案如下</h3>
	</div>
	<div>
		<table border=0 align="center"
			style="border-top: 3px #FFD382 solid; border-bottom: 3px #82FFFF solid;">
			<tr>
				<td>x=
				<td><%=n[0]%>
			<tr>
				<td>y=
				<td><%=n[1]%>
			<tr>
				<td>z=
				<td><%=n[2]%>
			<tr>
				<td colspan=2 align="center"><a href="../index.jsp">回計算機首頁</a>
		</table>

	</div>


</body>
</html>