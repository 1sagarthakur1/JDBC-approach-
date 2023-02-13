package com.Demos;

import java.util.Scanner;

import com.execption.EmployeeException;
import com.implementaion.EmployeeImplement;
import com.interfaces.EmployeeDao;

public class DemoDeleteEmpByid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Department id  : ");
		int did = scanner.nextInt();
		
	    EmployeeDao eDao = new EmployeeImplement();
	    try {
			String string = eDao.forDeletDepartmentByid(did);
			System.out.println(string);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	    scanner.close();
	    
	}
}
