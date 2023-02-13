package com.interfaces;

import java.util.List;

import com.Beens.Department_Employee;
import com.Beens.Employee;
import com.execption.EmployeeException;

public interface EmployeeDao {
	public String forInsertEmployeeDetails(Employee employee) throws EmployeeException;
	
	public List<Department_Employee> forGetEmployeesinAccountDep(String string) throws EmployeeException;
	
	public String forDeletDepartmentByid(int did) throws EmployeeException;
	
	public List<Department_Employee> forgetEmpByAdd(String string) throws EmployeeException;
}
