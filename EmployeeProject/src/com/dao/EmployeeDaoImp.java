package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Exceptions.EmployeeException;
import com.modle.Employee;
import com.utility.GetConnection;

public class EmployeeDaoImp implements EmployeeDao {

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee employee = new Employee();
		try(Connection connection = GetConnection.takeConnection()){
			PreparedStatement pStatement = connection.prepareStatement("Select * from employee where Epid = ?");
			pStatement.setInt(1, empId);
			
			ResultSet tSet = pStatement.executeQuery();
			if(tSet.next()) {
				int Epid = tSet.getInt("Epid");
				String Epname = tSet.getString("Epname");
				String Epadd  = tSet.getString("Epadd");
				int salary = tSet.getInt("salary");
				
				employee.setEmpid(Epid);
				employee.setEnameString(Epname);
				employee.setAddressString(Epadd);
				employee.setSalary(salary);
				
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new EmployeeException("This Employee is not there..");
		}
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<>();
		try(Connection connection = GetConnection.takeConnection()){
			PreparedStatement pStatement = connection.prepareStatement("Select * from employee");
			
			ResultSet tSet = pStatement.executeQuery();
			while(tSet.next()) {
				int Epid = tSet.getInt("Epid");
				String Epname = tSet.getString("Epname");
				String Epadd  = tSet.getString("Epadd");
				int salary = tSet.getInt("salary");
				
				Employee employee = new Employee();
				employee.setEmpid(Epid);
				employee.setEnameString(Epname);
				employee.setAddressString(Epadd);
				employee.setSalary(salary);
			
				list.add(employee);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			e.getMessage();
		}
		
		return list;
	}

	@Override
	public String saveEmployeeDetails(Employee employee) {
		String string = null;
		try(Connection connection = GetConnection.takeConnection()){
			PreparedStatement pStatement = connection.prepareStatement("insert into employee values(?,?,?,?)");
			pStatement.setInt(1, employee.getEmpid());
			pStatement.setString(2, employee.getEnameString());
			pStatement.setString(3, employee.getAddressString());
			pStatement.setInt(4, employee.getSalary());
			
			int i = pStatement.executeUpdate();
			if(i>0) {
				string = "Employee save successfuly";
			}
			else {
				string = "Emplouee not saved";
			}

			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			e.getMessage();
		}
		
		return string;
	}

	@Override
	public boolean deleteEmployeeById(int empId) throws EmployeeException {
		boolean boll = false;
		try(Connection connection = GetConnection.takeConnection()){
			PreparedStatement pStatement = connection.prepareStatement("delete from employee where Epid = ?");
			pStatement.setInt(1, empId);
			int i = pStatement.executeUpdate();
			if(i>0) {
				boll = true;
			}
			else {
				boll = false;
			}

			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		
		return boll;
	}

	@Override
	public String giveBonusToEmployee(int empId, int amount) throws EmployeeException {
		String string = null;
		try(Connection connection = GetConnection.takeConnection()){
			PreparedStatement pStatement = connection.prepareStatement("update employee set salary = salary + ? where Epid = ?");
			pStatement.setInt(1, amount);
			pStatement.setInt(2, empId);
			
			int i = pStatement.executeUpdate();
			if(i>0) {
				string = "Employee have got bonus";
			}
			else {
				string = "Emplouee have not got bonus";
			}

			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		
		return string;
	}

}
