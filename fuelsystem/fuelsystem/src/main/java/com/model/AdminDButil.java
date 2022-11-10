package com.model;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class AdminDButil {

	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs = null;

	public static List<Admin> validate(int empid) {

		ArrayList<Admin> admin = new ArrayList<>();

		try {

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from admin where empid ='" + empid + "'";
			rs = st.executeQuery(sql);

			if (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				String address = rs.getString(4);
				String nic = rs.getString(5);
				String uname = rs.getString(6);
				String pass = rs.getString(7);

				Admin e = new Admin(id, name, address, tel, nic,uname,pass);
				admin.add(e);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return admin;

	}

	public static boolean insertAdmin(String name, String tel, String address, String nic,String uname,String pass) {

		boolean isSuccess = false;

		try {

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "insert into admin values (0,'" + name + "','" + tel + "','" + address + "','" + nic
					+ "','"+uname+"','"+pass+"')";
			int count = st.executeUpdate(sql);

			if (count > 0) {
				isSuccess = true;
			}

			else {
				isSuccess = false;
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return isSuccess;

	}

	public static boolean updateAdmin(String id, String name, String tel, String address, String nic,String uname,String pass) {

		try {

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "update admin set name='" + name + "',tel='" + tel + "',address='" + address + "',nic='"
					+ nic + "',username='"+uname+"',password='"+pass+"' where empid='" + id + "'";
			int count = st.executeUpdate(sql);

			if (count > 0) {
				isSuccess = true;
			}

			else {
				isSuccess = false;
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return isSuccess;
	}

	public static List<Admin> getAdminDetails(String id) {

		int newid = Integer.parseInt(id);

		ArrayList<Admin> admin = new ArrayList<>();

		try {

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from admin where empid='" + newid + "'";
			rs = st.executeQuery(sql);

			while (rs.next()) {

				int id1 = rs.getInt(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				String address = rs.getString(4);
				String nic = rs.getString(5);
				String uname = rs.getString(6);
				String pass = rs.getString(7);

				Admin e = new Admin(id1, name, address, tel, nic,uname,pass);
				admin.add(e);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return admin;
	}

	public static boolean deleteadmin(String id) {

		int sqlid = Integer.parseInt(id);

		try {

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "delete from admin where empid='" + sqlid + "'";
			int count = st.executeUpdate(sql);

			if (count > 0) {
				isSuccess = true;
			}

			else {
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;

	}

	public static List<Admin> getallemp() {

		ArrayList<Admin> admin = new ArrayList<>();

		try {

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from admin";
			rs = st.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				String address = rs.getString(4);
				String nic = rs.getString(5);
				String uname = rs.getString(6);
				String pass = rs.getString(7);

				Admin e = new Admin(id, name, address, tel, nic,uname,pass);
				admin.add(e);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("The size of the ArrayList is: " + admin.size());

		return admin;

	}

	

}
