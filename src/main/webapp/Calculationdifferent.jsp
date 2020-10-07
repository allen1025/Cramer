<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="Header" style="padding: 30px;">
		<h3 align="center">輸入各變數前面的係數，輸入完請按"計算" Ex:2/x，係數為2</h3>
	</div>
	<div>
		<form action="Calculation/Calculationdifferent" method="post">
			<table border=0 align="center"
				style="border-top: 3px #FFD382 solid; border-bottom: 3px #82FFFF solid;">
				<tr>
					<td colspan=7 align="center">example : a x+ b y+ c z = d
				<tr>
					<td><input type="text" name="a1">
					<td align="center">x+
					<td><input type="text" name="b1">
					<td align="center">y+
					<td><input type="text" name="c1">
					<td align="center">z=
					<td><input type="text" name="d1">
				<tr>
					<td><input type="text" name="a2">
					<td align="center">x+
					<td><input type="text" name="b2">
					<td align="center">y+
					<td><input type="text" name="c2">
					<td align="center">z=
					<td><input type="text" name="d2">
				<tr>
					<td><input type="text" name="a3">
					<td align="center">x+
					<td><input type="text" name="b3">
					<td align="center">y+
					<td><input type="text" name="c3">
					<td align="center">z=
					<td><input type="text" name="d3">
				<tr>
					<td colspan=7 align="right"><input type="submit" value="計算">
			</table>
		</form>
	</div>
	<div></div>
</body>
</html>