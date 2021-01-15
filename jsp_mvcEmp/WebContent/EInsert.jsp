<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:useBean id="dao" class="edu.bit.ex.dao.EDao"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="success.jsp" method="get">
		<h1>사원 정보 입력</h1> 
		<hr/>
		<table>
			<tr>
				<td>사원번호</td> 
				<td><input type="number" name="empno"/></td>
			</tr> 
			<tr>
				<td>사원이름</td>  
				<td><input type="text" name="ename"/></td> 
			</tr>
			<tr>
				<td>사원직급</td> 
				<td><input type="text" name="job"/><td>
			</tr>
			<tr>
				<td>매니저</td> 
				<td><select name="mgr">
 			  <c:forEach var="mgr" items="${dao.mgrSelect()}">
      			 <option value="${mgr.empno}"> (${mgr.empno})${mgr.ename}</option>
    			</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>입사일</td> 
				<td><input type="text" name="hiredate"/></td>
			</tr>
			<tr>
				<td>급여</td> 
				<td><input type="number" name="sal"/></td>
			</tr>
			<tr>
				<td>커미션</td> 
				<td><input type="number" name="comm"/></td>
			</tr>
			<tr>
				<td>부서</td> 
				<td><select name="dept">
 			  <c:forEach var="dept" items="${dao.deptSelect()}">
      			 <option value="${dept.empno}"> (${dept.deptno})${dept.dname}</option>
    			</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align:center">
				<input type="submit" value="입력"/>
			</tr>
		</table>
	</form>
</body>
</html>