package com.Beens;

public class Employee {
	private int emid;
	private String ename;
	private String eaddress;
	private long mobile;
	private int deptid;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int emid, String ename, String eaddress, Long mobile, int deptid) {
		super();
		this.emid = emid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.mobile = mobile;
		this.deptid = deptid;
	}
	public int getEmid() {
		return emid;
	}
	public void setEmid(int emid) {
		this.emid = emid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	@Override
	public String toString() {
		return "Employee [emid=" + emid + ", ename=" + ename + ", eaddress=" + eaddress + ", mobile=" + mobile
				+ ", deptid=" + deptid + "]";
	}
	
}
