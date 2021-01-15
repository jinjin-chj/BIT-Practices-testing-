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
<h2>EMP 테이블 직원 목록</h2>
	<table border="1">
		<tr class="list">
			<td>사원번호</td>
			<td>사원이름</td>
			<td>직급(업무)</td>
			<td>상사(이름)</td>
			<td>입사일</td>
			<td>급여</td>
			<td>커미션</td>
			<td>부서번호</td>
			<td>부서이름</td>
			<td>부서위치</td>
			<td>관리</td>
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
			<td><a href=#>수정</a></td>
		</tr>
		</c:forEach>
		
	</table>
</body>
</html>