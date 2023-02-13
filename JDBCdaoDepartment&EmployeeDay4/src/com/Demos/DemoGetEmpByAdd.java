package com.Demos;

import java.util.List;
import java.util.Scanner;

import com.Beens.Department_Employee;
import com.execption.EmployeeException;
import com.implementaion.EmployeeImplement;
import com.interfaces.EmployeeDao;

public class DemoGetEmpByAdd {
	public static void main(String[] args) {
		Scanner scanne = new Scanner(System.in);
		System.out.print("Enter Address : ");
		String string = scanne.next();
		
		EmployeeDao eDao = new EmployeeImplement();
		try {
			List<Department_Employee> list = eDao.forgetEmpByAdd(string);
			if(list.size()>0) {
				list.forEach((l) -> System.out.println(l));				
			}
			else {
				System.out.println("Any Employee Dose not exist in "+ string);
			}
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		scanne.close();
	}
}
