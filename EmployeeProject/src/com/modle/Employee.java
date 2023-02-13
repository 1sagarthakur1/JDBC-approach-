package com.modle;

public class Employee {
	private int  empid;
	private String enameString;
	private String addressString;
	private int salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String enameString, String addressString, int salary) {
		super();
		this.empid = empid;
		this.enameString = enameString;
		this.addressString = addressString;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEnameString() {
		return enameString;
	}
	public void setEnameString(String enameString) {
		this.enameString = enameString;
	}
	public String getAddressString() {
		return addressString;
	}
	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", enameString=" + enameString + ", addressString=" + addressString
				+ ", salary=" + salary + "]";
	}
	
	
}
