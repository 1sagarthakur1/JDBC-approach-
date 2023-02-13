package com.Beens;

public class Department_Employee {
	int empid;
	String enameString;
	String addString;
	long mobile;
	int depid;
	int did;
	String dnameString;
	String locationString;
	
	public Department_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department_Employee(int empid, String enameString, String addString, long mobile, int depid, int did,
			String dnameString, String locationString) {
		super();
		this.empid = empid;
		this.enameString = enameString;
		this.addString = addString;
		this.mobile = mobile;
		this.depid = depid;
		this.did = did;
		this.dnameString = dnameString;
		this.locationString = locationString;
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

	public String getAddString() {
		return addString;
	}

	public void setAddString(String addString) {
		this.addString = addString;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getDepid() {
		return depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDnameString() {
		return dnameString;
	}

	public void setDnameString(String dnameString) {
		this.dnameString = dnameString;
	}

	public String getLocationString() {
		return locationString;
	}

	public void setLocationString(String locationString) {
		this.locationString = locationString;
	}

	@Override
	public String toString() {
		return "Department_Employee [empid=" + empid + ", enameString=" + enameString + ", addString=" + addString
				+ ", mobile=" + mobile + ", depid=" + depid + ", did=" + did + ", dnameString=" + dnameString
				+ ", locationString=" + locationString + "]";
	}
	
}
