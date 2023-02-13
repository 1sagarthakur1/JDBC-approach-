package com.implementaion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Beens.Department_Employee;
import com.Beens.Employee;
import com.execption.DepartmentException;
import com.execption.EmployeeException;
import com.interfaces.EmployeeDao;
import com.utility.GetConnectionFromDbms;

public class EmployeeImplement implements EmployeeDao{

	@Override
	public String forInsertEmployeeDetails(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		String string = "Employee Details have not inserted...";
		try(Connection connection = GetConnectionFromDbms.takeConnection()){
			PreparedStatement pStatement = connection.prepareStatement("INSERT INTO employee VALUES(?,?,?,?,?)");
			pStatement.setInt(1, employee.getDeptid());
			pStatement.setString(2, employee.getEname());
			pStatement.setString(3, employee.getEaddress());
			pStatement.setLong(4, employee.getMobile());
			pStatement.setInt(5, employee.getDeptid());
			
			int x = pStatement.executeUpdate();
			if(x>0) {
				string = "Employee Details insert Successfully...";
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		
		return string;
	}

	@Override
	public List<Department_Employee> forGetEmployeesinAccountDep(String string) throws EmployeeException {
		List<Department_Employee> list = new ArrayList<>();
		try(Connection connection = GetConnectionFromDbms.takeConnection()){
			PreparedStatement pStatement = connection.prepareStatement("select * from employee e inner join department d on d.did = e.deptid and d.dname = ?");
			pStatement.setString(1,string);
			
			ResultSet rSet = pStatement.executeQuery();
			while(rSet.next()){
			    int eid = rSet.getInt("empid");
			    String Ename = rSet.getString("ename");
			    String Eaddress = rSet.getString("address");
			    long mobile = rSet.getLong("mobile");
			    int depid = rSet.getInt("deptid");
			    int did = rSet.getInt("did");
			    String Dname = rSet.getString("dname");
			    String location = rSet.getString("location");
			    
//			    System.out.println(Ename+" "+Eaddress+" "+mobile+" "+Dname+" "+location);
			    Department_Employee dEmployee = new Department_Employee();
			    dEmployee.setEmpid(eid);
			    dEmployee.setEnameString(Ename);
			    dEmployee.setAddString(Eaddress);
			    dEmployee.setMobile(mobile);
			    dEmployee.setDepid(depid);
			    dEmployee.setDid(did);
			    dEmployee.setDnameString(Dname);
			    dEmployee.setLocationString(location);
			    
			    list.add(dEmployee);
				
			};
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		
		
		
		return list;
	}

	@Override
	public String forDeletDepartmentByid(int did) throws EmployeeException {
		String string = "Departmend have not Deleted..";
		// TODO Auto-generated method stub
		try(Connection connection = GetConnectionFromDbms.takeConnection()){
			PreparedStatement pStatement = connection.prepareStatement("DELETE e FROM employee e INNER JOIN department d on d.did = e.deptid and d.did = ?");
			pStatement.setInt(1, did);
			int i = pStatement.executeUpdate();
			if(i>0) {
				string = "Employee has deleted successfully...";
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		
		return string;
	}

	@Override
	public List<Department_Employee> forgetEmpByAdd(String string) throws EmployeeException {
		// TODO Auto-generated method stub
		List<Department_Employee> list = new ArrayList<>();
		try(Connection connection = GetConnectionFromDbms.takeConnection()){
			PreparedStatement pStatement = connection.prepareStatement("select * from employee e inner join department d on d.did = e.deptid and e.address = ?");
			pStatement.setString(1,string);
			
			ResultSet rSet = pStatement.executeQuery();
			while(rSet.next()){
			    int eid = rSet.getInt("empid");
			    String Ename = rSet.getString("ename");
			    String Eaddress = rSet.getString("address");
			    long mobile = rSet.getLong("mobile");
			    int depid = rSet.getInt("deptid");
			    int did = rSet.getInt("did");
			    String Dname = rSet.getString("dname");
			    String location = rSet.getString("location");
			    
//			    System.out.println(Ename+" "+Eaddress+" "+mobile+" "+Dname+" "+location);
			    Department_Employee dEmployee = new Department_Employee();
			    dEmployee.setEmpid(eid);
			    dEmployee.setEnameString(Ename);
			    dEmployee.setAddString(Eaddress);
			    dEmployee.setMobile(mobile);
			    dEmployee.setDepid(depid);
			    dEmployee.setDid(did);
			    dEmployee.setDnameString(Dname);
			    dEmployee.setLocationString(location);
			    
			    list.add(dEmployee);
				
			};
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		
		return list;
	}
	
}
