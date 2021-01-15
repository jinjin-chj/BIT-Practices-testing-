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
		<h1>��� ���� �Է�</h1> 
		<hr/>
		<table>
			<tr>
				<td>�����ȣ</td> 
				<td><input type="number" name="empno"/></td>
			</tr> 
			<tr>
				<td>����̸�</td>  
				<td><input type="text" name="ename"/></td> 
			</tr>
			<tr>
				<td>�������</td> 
				<td><input type="text" name="job"/><td>
			</tr>
			<tr>
				<td>�Ŵ���</td> 
				<td><select name="mgr">
 			  <c:forEach var="mgr" items="${dao.mgrSelect()}">
      			 <option value="${mgr.empno}"> (${mgr.empno})${mgr.ename}</option>
    			</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>�Ի���</td> 
				<td><input type="text" name="hiredate"/></td>
			</tr>
			<tr>
				<td>�޿�</td> 
				<td><input type="number" name="sal"/></td>
			</tr>
			<tr>
				<td>Ŀ�̼�</td> 
				<td><input type="number" name="comm"/></td>
			</tr>
			<tr>
				<td>�μ�</td> 
				<td><select name="dept">
 			  <c:forEach var="dept" items="${dao.deptSelect()}">
      			 <option value="${dept.empno}"> (${dept.deptno})${dept.dname}</option>
    			</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align:center">
				<input type="submit" value="�Է�"/>
			</tr>
		</table>
	</form>
</body>
</html>