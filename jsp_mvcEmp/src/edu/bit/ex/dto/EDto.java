package edu.bit.ex.dto;

/*EMPNO    NOT NULL NUMBER(4)    
ENAME             VARCHAR2(10) 
JOB               VARCHAR2(9)  
MGR               NUMBER(4)    
HIREDATE          DATE         
SAL               NUMBER(7,2)  
COMM              NUMBER(7,2)  
DEPTNO            NUMBER(2) */
public class EDto {

	private int empno, mgr, sal, comm, deptno;
	private String ename, job, hiredate, dname, loc;

	public EDto() {}
	
	
	public EDto(int empno, int mgr, int sal, int comm, int deptno, 
			String ename, String job, String hiredate) {
		super();
		this.empno = empno;
		this.mgr = mgr;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
	}


	public EDto(int empno, String ename, String job, int mgr, String hiredate, 
			int sal, int comm, int deptno, String dname, String loc) {
		super();
		this.empno = empno;
		this.mgr = mgr;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.dname=dname;
		this.loc = loc;
		
	}


	public EDto(int empno, String name) {
		this.empno = empno;
		this.ename= name;
	}

	public EDto(String dname, int deptno2) {
		this.dname = dname;
		this.deptno = deptno2;
	}

	public int getEmpno() {
		return empno;
	}


	public int getMgr() {
		return mgr;
	}


	public int getSal() {
		return sal;
	}


	public int getComm() {
		return comm;
	}


	public int getDeptno() {
		return deptno;
	}


	public String getEname() {
		return ename;
	}


	public String getJob() {
		return job;
	}


	public String getHiredate() {
		return hiredate;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public void setMgr(int mgr) {
		this.mgr = mgr;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}


	public void setComm(int comm) {
		this.comm = comm;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}


	public String getDname() {
		return dname;
	}


	public String getLoc() {
		return loc;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
