package com.usecases;

import java.util.Scanner;

import com.Exceptions.EmployeeException;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImp;
import com.modle.Employee;

public class GetEmployeeByID {
	public static void main(String[] args) throws EmployeeException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Employee ID : ");
		int Empid = scanner.nextInt();
		
		EmployeeDao eDao = new EmployeeDaoImp();
		Employee employee = eDao.getEmployeeById(Empid);
		if(employee.getEnameString()==null) {
			System.out.println("This Employee is not there..");
		}
		else {
			System.out.println(employee.getEmpid()+" "+employee.getEnameString()+" "+employee.getAddressString()+" "+employee.getSalary());
		}
		scanner.close();
	}
}
