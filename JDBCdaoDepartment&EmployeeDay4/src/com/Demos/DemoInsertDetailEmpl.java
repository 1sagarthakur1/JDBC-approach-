package com.Demos;

import java.util.Scanner;

import com.Beens.Employee;
import com.execption.EmployeeException;
import com.implementaion.EmployeeImplement;
import com.interfaces.EmployeeDao;

public class DemoInsertDetailEmpl {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Employee id : ");
		int eid = scanner.nextInt();
		
		System.out.print("Enter Employee Name : ");
		String ename = scanner.next();
		
		System.out.print("Enter Employee address : ");
		String eadd = scanner.next();
		
		System.out.print("Enter Employee Mobile : ");
		long mobile = scanner.nextLong();
		
		System.out.print("Enter Employee DepartmentId : ");
		int depid = scanner.nextInt();
		
		Employee employee = new Employee();
		employee.setEmid(eid);
		employee.setEname(ename);
		employee.setEaddress(eadd);
		employee.setMobile(mobile);
		employee.setDeptid(depid);
		
		EmployeeDao eDao = new EmployeeImplement();
		try {
		 String string = eDao.forInsertEmployeeDetails(employee);
		 System.out.println(string);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		scanner.close();
		
	}
}
