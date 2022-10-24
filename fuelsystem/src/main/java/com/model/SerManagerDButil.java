package com.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SerManagerDButil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs = null;
	
	public static boolean insertSmanager(String name, String tel, String address, String branch, String password,
			String date, String email) {

		boolean isSuccess = false;

		try {

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "insert into sermanager values (0,'" + name + "','" + tel + "','" + address + "','" + branch
					+ "','" + password + "','" + date + "','" + email + "')";
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

	public static List<SerManagerAcc> getSerManDetails() {

		ArrayList<SerManagerAcc> sman = new ArrayList<>();

		try {

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from sermanager";
			rs = st.executeQuery(sql);

			while (rs.next()) {
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				String address = rs.getString(4);
				String branch = rs.getString(5);
				String password = rs.getString(6);
				String startdate = rs.getString(7);
				String email = rs.getString(8);

				SerManagerAcc sm = new SerManagerAcc(id, name, address, tel, password, branch, startdate, email);
				sman.add(sm);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("The size of the ArrayList is: " + sman.size());

		return sman;

	}

	public static boolean updateSerMan(String id, String name, String branch, String tel, String email,String address,String password,String startdate) {

		try {

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "update sermanager set name='" + name + "',tel='" + tel + "',address='" + address + "',branch='"+ branch + "',password='"+password+"',startdate='"+startdate+"',email='"+email+"' where mid='" + id + "'";
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
	
	public static List<SerManagerAcc> getSerManDetails(String id) {

		int newid = Integer.parseInt(id);

		ArrayList<SerManagerAcc> manager = new ArrayList<>();

		try {

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from sermanager where mid='" + newid + "'";
			rs = st.executeQuery(sql);

			while (rs.next()) {

				int id2 = rs.getInt(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				String address = rs.getString(4);
				String branch = rs.getString(5);
				String password = rs.getString(6);
				String startdate = rs.getString(7);
				String email = rs.getString(8);

				SerManagerAcc m = new SerManagerAcc(id2, name,address,tel,password,branch,startdate,email);
				manager.add(m);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return manager;
	}
	
	public static boolean deleteSerManager(String id) {

		int sqlid = Integer.parseInt(id);

		try {

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "delete from sermanager where mid='" + sqlid + "'";
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

}
