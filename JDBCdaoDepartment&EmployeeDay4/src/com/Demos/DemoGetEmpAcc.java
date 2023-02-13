package com.Demos;

import java.util.List;
import java.util.Scanner;

import com.Beens.Department_Employee;
import com.execption.EmployeeException;
import com.implementaion.EmployeeImplement;
import com.interfaces.EmployeeDao;

public class DemoGetEmpAcc {
	public static void main(String[] args) {
		Scanner scanne = new Scanner(System.in);
		System.out.print("Enter Department : ");
		String string = scanne.next();
		
		EmployeeDao eDao = new EmployeeImplement();
		try {
			List<Department_Employee> list = eDao.forGetEmployeesinAccountDep(string);
			list.forEach((l) -> System.out.println(l));
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		scanne.close();
		
	}
}
