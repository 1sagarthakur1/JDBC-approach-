package com.usecases;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImp;
import com.modle.Employee;

public class SaveEmployeeDetails {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Employee id : ");
		int eid = scanner.nextInt();
		System.out.print("Enter Employee name : ");
		String Ename = scanner.next();
		System.out.print("Enter Employee address : ");
		String Eaddress = scanner.next();
		System.out.print("Enter Employee salary : ");
		int Salary = scanner.nextInt();
		
		Employee employee = new Employee();
		employee.setEmpid(eid);
		employee.setEnameString(Ename);
		employee.setAddressString(Eaddress);
		employee.setSalary(Salary);
		
		EmployeeDao eDao = new EmployeeDaoImp();
		String string = eDao.saveEmployeeDetails(employee);
		System.out.println(string);
		scanner.close();
	}
}
