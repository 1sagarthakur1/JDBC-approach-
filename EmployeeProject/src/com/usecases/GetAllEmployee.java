package com.usecases;

import java.util.List;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImp;
import com.modle.Employee;

public class GetAllEmployee {
	public static void main(String[] args) {
		
		EmployeeDao eDao = new EmployeeDaoImp();
		List<Employee> list = eDao.getAllEmployee();
		list.forEach((l) -> System.out.println(l));
	}
}
