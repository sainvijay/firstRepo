package com.first.FirstService.repositories;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;
import com.first.FirstService.input.Employee;

@Dependent
public class EmployeeRepository {
	@Inject
	@Named("Employee")
	private DataSource dataSource;

	public ArrayList<Object> getAllEmployee() {
		ArrayList<Object> list = new ArrayList<>();
		ResultSet rs = null;
		Map<String, Object> map = null;
		try (Connection conn = dataSource.getConnection();
				CallableStatement cstmt = conn.prepareCall("{Call GetAllEmployee}");) {
			rs = cstmt.executeQuery();
			while (rs.next()) {
				map = new HashMap<>();
				map.put("ID", rs.getInt("Id"));
				map.put("Name", rs.getString("Name"));
				map.put("Age", rs.getInt("Age"));
				map.put("Active", rs.getInt("Active"));
				list.add(map);
			}
			} catch (Exception ex) {
			ex.printStackTrace();

		}
		return list;

	}
	
	public String createEmployee(Employee emp) {
		try (Connection conn = dataSource.getConnection();
				CallableStatement cstmt = conn.prepareCall("{Call CreateEmployee(?,?,?,?)}");) {
			cstmt.setInt("id", emp.getId());
			cstmt.setString("Name", emp.getName());
			cstmt.setInt("Age", emp.getAge());
			cstmt.setInt("Active", emp.getActive());
			int j = cstmt.executeUpdate();
			System.out.println("exce   " + j);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}
	
	
	public int deleteEmployee(int id) {
		int a=5;
		try (Connection conn = dataSource.getConnection();
				CallableStatement cstmt = conn.prepareCall("{Call DeleteEmployee(?)}");) {
			cstmt.setInt("id", id);
		 a=	cstmt.executeUpdate();
		System.out.println("a is--->"+a);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return a;
	}
	public ArrayList<Object> findById(int id) {
		ArrayList<Object> list = new ArrayList<>();
		try (Connection conn = dataSource.getConnection();
				CallableStatement cstmt = conn.prepareCall("{Call findEmployee(?)}");) {
			cstmt.setInt("id", id);
		 ResultSet rs=	cstmt.executeQuery();
		Map<String,Object> map = new HashMap<>();
		while(rs.next()) {
			map.put("ID", rs.getInt("Id"));
			map.put("Name", rs.getString("Name"));
			map.put("Age", rs.getInt("Age"));
			map.put("Active", rs.getInt("Active"));
			list.add(map);
			}
		}catch (Exception ex) {
			ex.printStackTrace();
		
		
	}
		return list;
	}
	
	public int UpdateEmployee(Employee emp) {
		int j=0;
		try (Connection conn = dataSource.getConnection();
				CallableStatement cstmt = conn.prepareCall("{Call UpdateEmployee(?,?,?,?)}");) {
			cstmt.setInt("id", emp.getId());
			cstmt.setString("Name", emp.getName());
			cstmt.setInt("Age", emp.getAge());
			cstmt.setInt("Active", emp.getActive());
			 j = cstmt.executeUpdate();
			System.out.println("exce   " + j);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return j;
	}
	}	
