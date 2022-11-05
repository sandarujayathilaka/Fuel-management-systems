package com.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FuelManDButil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs = null;
	
	public static boolean insertFuelmanager(String id,String name, String tel, String address, String password,
			String nic, String marit) {

		boolean isSuccess = false;

		try {

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "insert into fuelmanager values ('"+id+"','" + name + "','" + tel + "','" + address + "','" + password + "','" + nic + "','" + marit + "')";
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

	public static List<FuelManagerAcc> getFuelManDetails() {

		ArrayList<FuelManagerAcc> sman = new ArrayList<>();

		try {

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from fuelmanager";
			rs = st.executeQuery(sql);

			while (rs.next()) {
				
				String id = rs.getString(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				String address = rs.getString(4);
				String password = rs.getString(5);
				String nic = rs.getString(6);
				String marit = rs.getString(7);

				FuelManagerAcc sm = new FuelManagerAcc(id, name, address, tel, password, nic, marit);
				sman.add(sm);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("The size of the ArrayList is: " + sman.size());

		return sman;

	}

	public static boolean updateFuelMan(String id, String name, String tel, String address,String password,String nic,String marit) {

			boolean isSuccess = false;
		
		try {

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "update fuelmanager set name='" + name + "',tel='" + tel + "',address='" + address + "',password='"+password+"',nic='"+nic+"',maritalStatus='"+marit+"' where FID='" + id + "'";
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
	
	public static List<FuelManagerAcc> getFuelManDetails(String id) {

		

		ArrayList<FuelManagerAcc> manager = new ArrayList<>();

		try {

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from fuelmanager where FID='" + id + "'";
			rs = st.executeQuery(sql);

			while (rs.next()) {

				String id2 = rs.getString(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				String address = rs.getString(4);
				String password = rs.getString(5);
				String nic = rs.getString(6);
				String marit = rs.getString(7);

				FuelManagerAcc m = new FuelManagerAcc(id2, name, address, tel, password, nic, marit);
				manager.add(m);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return manager;
	}
	
	public static boolean deleteFuelManager(String id) {

		try {

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "delete from fuelmanager where FID='" + id + "'";
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
