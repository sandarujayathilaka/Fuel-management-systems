package com.fuelsystem;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Executable;
import java.sql.*;

public class employerDButil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement st =null;
	private static ResultSet rs =null;
	
	public static List<Employer> validate(int empid){
		
		ArrayList<Employer> emp = new ArrayList<>();
		
		try {
			
			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from fuelemployer where empid ='"+empid+"'";
			rs = st.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name =rs.getString(2);
				String tel = rs.getString(3);
				String address = rs.getString(4);
				String nic = rs.getString(5);
				
				Employer e = new Employer(id, name, address, tel, nic);
				emp.add(e);
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		return emp;
		
		}
	
	
	
	public static boolean insertEmp(String name,String tel,String address,String nic ) {
		
		boolean isSuccess = false;
	
		try {
			
			
			con = DbConnect.getConnection();
			st=con.createStatement();
			String sql = "insert into fuelemployer values (0,'"+name+"','"+tel+"','"+address+"','"+nic+"')";
			int count =st.executeUpdate(sql);
			
			if(count>0) {
				isSuccess =true;
			}
			
			else {
				isSuccess =false;
			}
			
		
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		return isSuccess;
		
	}
	
	
	
	public static boolean updateemp(String id,String name,String tel,String address,String nic) {
		
		try {
			
			con = DbConnect.getConnection();
			st=con.createStatement();
			String sql = "update fuelemployer set name='"+name+"',tel='"+tel+"',address='"+address+"',nic='"+nic+"' where empid='"+id+"'";
			int count =st.executeUpdate(sql);
			
			if(count>0) {
				isSuccess =true;
			}
			
			else {
				isSuccess =false;
			}
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	
	public static List<Employer> getEmpDetails(String id){
		
		int newid = Integer.parseInt(id);
		
		ArrayList<Employer> emp = new ArrayList<>();
		
		try {
			
			con = DbConnect.getConnection();
			st =con.createStatement();
			String sql ="select * from fuelemployer where empid='"+newid+"'";
			rs =st.executeQuery(sql);
			
			while(rs.next()) {
				
				int id1 = rs.getInt(1);
				String name =rs.getString(2);
				String tel = rs.getString(3);
				String address = rs.getString(4);
				String nic = rs.getString(5);
				
				Employer e = new Employer(id1, name, address, tel, nic);
				emp.add(e);
			}
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	
		return emp;	
	}
	
	
	
	public static boolean deleteEmp(String id) {
		
		int sqlid = Integer.parseInt(id);
		
		try {
			
			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "delete from fuelemployer where empid='"+sqlid+"'";
			int count = st.executeUpdate(sql);
			
			if(count>0) {
				isSuccess =true;
			}
			
			else {
				isSuccess =false;
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
			
	}
	
	public static List<Employer> getallemp(){
		
		ArrayList<Employer> emp = new ArrayList<>();
		
		try {
			
			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from fuelemployer";
			rs = st.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name =rs.getString(2);
				String tel = rs.getString(3);
				String address = rs.getString(4);
				String nic = rs.getString(5);
				
				Employer e = new Employer(id, name, address, tel, nic);
				emp.add(e);
				
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return emp;
			
	}
	
	
	

}
