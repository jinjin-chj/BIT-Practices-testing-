<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="dao" class="edu.bit.ex.dao.EDao"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	.list {
	font-weight:bold;
	text-align:center;
	}
</style>
</head>
<body>
<h2>EMP ���̺� ���� ���</h2>
	<table border="1">
		<tr class="list">
			<td>�����ȣ</td>
			<td>����̸�</td>
			<td>����(����)</td>
			<td>���(�̸�)</td>
			<td>�Ի���</td>
			<td>�޿�</td>
			<td>Ŀ�̼�</td>
			<td>�μ���ȣ</td>
			<td>�μ��̸�</td>
			<td>�μ���ġ</td>
			<td>����</td>
		</tr>
		<c:forEach items ="${list}" var="dto">
		<tr>
			<td>${dto.empno}</td>
			<td>${dto.ename}</td>
			<td>${dto.job}</td>
			<td>${dto.mgr}</td>
			<td>${dto.hiredate}</td>
			<td>${dto.sal}</td>
			<td>${dto.comm}</td>
			<td>${dto.deptno}</td>
			<td>${dto.dname}</td>
			<td>${dto.loc}</td>
			<td><a href=#>����</a></td>
		</tr>
		</c:forEach>
		
	</table>
</body>
</html>