package com.usecases;

import java.util.Scanner;

import com.Exceptions.EmployeeException;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImp;

public class DeleteEmployee {
	public static void main(String[] args) throws EmployeeException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Employee ID : ");
		int eid = scanner.nextInt();
		
		EmployeeDao eDao = new EmployeeDaoImp();
		Boolean boolean1 = eDao.deleteEmployeeById(eid);
		if(boolean1==true) {
			System.out.println("Employee Deleted");
		}
		else {
			System.out.println("Employee Dose not Delete");
		}
		scanner.close();
	}
}
