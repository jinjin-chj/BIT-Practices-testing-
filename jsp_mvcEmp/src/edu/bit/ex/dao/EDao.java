package edu.bit.ex.dao;

import java.sql.*;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.bit.ex.dto.EDto;
/*import edu.bit.ex.dto.EDto2;*/

public class EDao {
	private DataSource dataSource;

	public EDao() {
		
		try {
			Context ct = new InitialContext();
			dataSource = (DataSource)ct.lookup("java:comp/env/jdbc/oracle");	
		} catch (Exception e) {
	         e.printStackTrace();
	      }
	}

	public ArrayList<EDto> list() {
		
		ArrayList<EDto> dtos = new ArrayList<EDto>();
		
		Connection connection = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
		
	    try {
	    	connection = dataSource.getConnection();
	    	
			String query = "select e.*,d.dname, d.loc from emp e, dept d where e.deptno=d.deptno order by e.ename asc";
	    	
	    	preparedStatement = connection.prepareStatement(query);
	        resultSet = preparedStatement.executeQuery();
	    	
	        while (resultSet.next()) {
	        	int empno = resultSet.getInt("empno");
				String ename = resultSet.getString("ename");
				String job = resultSet.getString("job");
				int mgr = resultSet.getInt("mgr");
				String hiredate = resultSet.getString("hiredate");
				int sal = resultSet.getInt("sal");
				int comm = resultSet.getInt("comm");
				int deptno = resultSet.getInt("deptno");
				String dname = resultSet.getString("dname"); 
				String loc = resultSet.getString("loc");
				 
				EDto dto = new EDto(empno, ename, job, mgr, hiredate, 
						sal, comm, deptno, dname, loc);
				dtos.add(dto);
	        }
	    }catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if(resultSet != null) resultSet.close();
	            if(preparedStatement != null) preparedStatement.close();
	            if(connection != null) connection.close();
	         } catch (Exception e2) {
	            e2.printStackTrace();
	         }
	      }

		return dtos;
	}
	
	public void write(int empno, String ename, String job, int mgr, 
			String hiredate, int sal, int comm, int deptno) {
	
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "insert into emp (String empno, String ename, String job, String mgr, "
					+ "String hiredate, String sal, String comm, String deptno) "
					+ "values (?, ?, ?, ?, ?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, empno);
			preparedStatement.setString(2, ename);
			preparedStatement.setString(3, job);
			preparedStatement.setInt(4, mgr);
			preparedStatement.setString(5, hiredate);
			preparedStatement.setInt(6, sal);
			preparedStatement.setInt(7, comm);
			preparedStatement.setInt(8, deptno);
		
			int rn = preparedStatement.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
	}
	
public ArrayList<EDto> mgrSelect() {
		
		ArrayList<EDto> dtos = new ArrayList<EDto>();
		
		Connection connection = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
		
	    try {
	    	connection = dataSource.getConnection();
	    	
			String query = "select m.empno ,m.ename as manage from emp e , emp m where e.mgr = m.empno group by m.ename ,m.empno";
	    	
	    	preparedStatement = connection.prepareStatement(query);
	        resultSet = preparedStatement.executeQuery();
	    	
	        while (resultSet.next()) {
	        	int empno = resultSet.getInt("empno");
				String name = resultSet.getString("manage");
				
				EDto dto = new EDto(empno, name);
				dtos.add(dto);
	        }
	    }catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if(resultSet != null) resultSet.close();
	            if(preparedStatement != null) preparedStatement.close();
	            if(connection != null) connection.close();
	         } catch (Exception e2) {
	            e2.printStackTrace();
	         }
	      }

		return dtos;
	}

public ArrayList<EDto> deptSelect() {
	
	ArrayList<EDto> dtos = new ArrayList<EDto>();
	
	Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
	
    try {
    	connection = dataSource.getConnection();
    	
		String query = "select dname,deptno from dept group by dname,deptno";
    	
    	preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();
    	
        while (resultSet.next()) {
        	String name = resultSet.getString("dname");
        	int deptno = resultSet.getInt("deptno2");
			
			EDto dto = new EDto(dname, deptno2);
			dtos.add(dto);
        }
    }catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) resultSet.close();
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
         } catch (Exception e2) {
            e2.printStackTrace();
         }
      }

	return dtos;
}
}








