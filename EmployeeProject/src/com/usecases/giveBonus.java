package com.usecases;

import java.util.Scanner;

import com.Exceptions.EmployeeException;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImp;

public class giveBonus {
	public static void main(String[] args) throws EmployeeException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Employee ID : ");
		int eid = scanner.nextInt();
		System.out.print("Enter Bonus : ");
		int bonus = scanner.nextInt();
		
		EmployeeDao eDao = new EmployeeDaoImp();
		String string = eDao.giveBonusToEmployee(eid, bonus);
		System.out.println(string);
		scanner.close();
	}
}
