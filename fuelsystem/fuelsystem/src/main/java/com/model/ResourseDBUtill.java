package com.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ResourseDBUtill {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs = null;
	
	public static boolean insertSuperDieselData(String cate,String date,String tcost, String tax, String dispenser, String initqun,
			String dprice, String rqun,String share) {

	isSuccess = false;
	String category = cate;

		try {
			
			con = DbConnect.getConnection();
			st = con.createStatement();
			
			if (category.equalsIgnoreCase("diesel")) {
			String sql = "insert into supdiesel values (0,'"+date+"','"+ tcost+"','"+tax+"','"+dispenser+"','"+initqun+"','"+dprice+"','"+rqun+"','"+share+"')";
			int count = st.executeUpdate(sql);

			if (count > 0) {
				isSuccess = true;
			}

			else {
				isSuccess = false;
			}
			
			}
			
			else if (category.equalsIgnoreCase("petrol")) {
				String sql = "insert into petrol values (0,'"+date+"','"+ tcost+"','"+tax+"','"+dispenser+"','"+initqun+"','"+dprice+"','"+rqun+"','"+share+"')";
				int count = st.executeUpdate(sql);

				if (count > 0) {
					isSuccess = true;
				}

				else {
					isSuccess = false;
				}
				
				}	

		} 
		
		catch (Exception e) {

			e.printStackTrace();
		}

		return isSuccess;

	
	}
	
	public static List<Diesel> getDieselData() {

		ArrayList<Diesel> dieselInfo = new ArrayList<>();

		try {
      
			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from supdiesel";
			rs = st.executeQuery(sql);

			while (rs.next()) {
				
				String id = rs.getString(1);
				String date = rs.getString(2);
				double tcost = Double.parseDouble(rs.getString(3));
				double tax = Double.parseDouble(rs.getString(4));
				double dispenser = Double.parseDouble(rs.getString(5));;
				double initqun = Double.parseDouble(rs.getString(6));;
				double dprice = Double.parseDouble(rs.getString(7));;
				double rqun = Double.parseDouble(rs.getString(8));;
				double share = Double.parseDouble(rs.getString(9));;

				Diesel dieselob = new Diesel(id,date,tcost, tax, dispenser, initqun, dprice, rqun,share);
				dieselInfo.add(dieselob);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	

		return dieselInfo;

	}
	

	public static List<Petrol> getPetrolData() {

		ArrayList<Petrol> petrolInfo = new ArrayList<>();

		try {
      
			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from petrol";
			rs = st.executeQuery(sql);

			while (rs.next()) {
				
				String id = rs.getString(1);
				String date = rs.getString(2);
				double tcost = Double.parseDouble(rs.getString(3));
				double tax = Double.parseDouble(rs.getString(4));
				double dispenser = Double.parseDouble(rs.getString(5));;
				double initqun = Double.parseDouble(rs.getString(6));;
				double dprice = Double.parseDouble(rs.getString(7));;
				double rqun = Double.parseDouble(rs.getString(8));;
				double share = Double.parseDouble(rs.getString(9));;

				Petrol petrolob = new Petrol(id,date,tcost, tax, dispenser, initqun, dprice, rqun,share);
				petrolInfo.add(petrolob);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return petrolInfo;

	}
	
	
	public static boolean updateDiesel(String id,String date,String tcost, String tax, String dispenser, String initqun,
			String dprice, String rqun,String share) {

		try {
			
			int newid =Integer.parseInt(id);

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "update supdiesel set date='" + date + "',tcost='" + tcost + "',tax='" + tax + "',dispenser='"+ dispenser+ "',initqun='"+initqun+"',dprice='"+dprice+"',rqun='"+rqun+"',share='" +share+ "' where id ='"+newid+"'";
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
	
	public static boolean updatePetrol(String id,String date,String tcost, String tax, String dispenser, String initqun,
			String dprice, String rqun,String share) {

		try {
			
			int newid =Integer.parseInt(id);

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "update petrol set date='" + date + "',tcost='" + tcost + "',tax='" + tax + "',dispenser='"+ dispenser+ "',initqun='"+initqun+"',dprice='"+dprice+"',rqun='"+rqun+"',share='" +share+ "' where id ='"+newid+"'";
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
	
	
public static List<Diesel> getDieselData(String date) {

		

		ArrayList<Diesel> diesel = new ArrayList<>();

		try {

			con = DbConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from supdiesel where date='" + date + "'";
			rs = st.executeQuery(sql);

			while (rs.next()) {
				
				
				String id = rs.getString(1);
				String dates = rs.getString(2);
				double tcost = Double.parseDouble(rs.getString(3));
				double tax = Double.parseDouble(rs.getString(4));
				double dispenser = Double.parseDouble(rs.getString(5));;
				double initqun = Double.parseDouble(rs.getString(6));;
				double dprice = Double.parseDouble(rs.getString(7));;
				double rqun = Double.parseDouble(rs.getString(8));;
				double share = Double.parseDouble(rs.getString(9));;

				Diesel dieselob = new Diesel(id,dates,tcost, tax, dispenser, initqun, dprice, rqun,share);
				diesel.add(dieselob);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return diesel;
	}

public static List<Petrol> getPetrolData(String date) {

	

	ArrayList<Petrol> petrol = new ArrayList<>();

	try {

		con = DbConnect.getConnection();
		st = con.createStatement();
		String sql = "select * from petrol where date='" + date + "'";
		rs = st.executeQuery(sql);

		while (rs.next()) {
			
			
			String id = rs.getString(1);
			String dates = rs.getString(2);
			double tcost = Double.parseDouble(rs.getString(3));
			double tax = Double.parseDouble(rs.getString(4));
			double dispenser = Double.parseDouble(rs.getString(5));;
			double initqun = Double.parseDouble(rs.getString(6));;
			double dprice = Double.parseDouble(rs.getString(7));;
			double rqun = Double.parseDouble(rs.getString(8));;
			double share = Double.parseDouble(rs.getString(9));;

			Petrol petrolob = new Petrol(id,dates,tcost, tax, dispenser, initqun, dprice, rqun,share);
			petrol.add(petrolob);
		}

	} catch (Exception e) {

		e.printStackTrace();
	}

	return petrol;
}

	
public static boolean deleteDiesel(String id) {

	try {

		con = DbConnect.getConnection();
		st = con.createStatement();
		String sql = "delete from supdiesel where id='" + id + "'";
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

public static boolean deletePetrol(String id) {

	try {

		con = DbConnect.getConnection();
		st = con.createStatement();
		String sql = "delete from petrol where id='" + id + "'";
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

public static Diesel getDieselcal(String id) {

	    Diesel dieselob = new Diesel();

	try {

		con = DbConnect.getConnection();
		st = con.createStatement();
		String sql = "select * from supdiesel where id='" + id + "'";
		rs = st.executeQuery(sql);

		while (rs.next()) {
			
			
			String id1 = rs.getString(1);
			String dates = rs.getString(2);
			double tcost = Double.parseDouble(rs.getString(3));
			double tax = Double.parseDouble(rs.getString(4));
			double dispenser = Double.parseDouble(rs.getString(5));;
			double initqun = Double.parseDouble(rs.getString(6));;
			double dprice = Double.parseDouble(rs.getString(7));;
			double rqun = Double.parseDouble(rs.getString(8));;
			double share = Double.parseDouble(rs.getString(9));;

			dieselob = new Diesel(id1,dates,tcost, tax, dispenser, initqun, dprice, rqun,share);
			
		}

	} catch (Exception e) {

		e.printStackTrace();
	}

	return dieselob;
}

public static Petrol getPetrolcal(String id) {

    Petrol petrolob = new Petrol();

try {

	con = DbConnect.getConnection();
	st = con.createStatement();
	String sql = "select * from petrol where id='" + id + "'";
	rs = st.executeQuery(sql);

	while (rs.next()) {
		
		
		String id1 = rs.getString(1);
		String dates = rs.getString(2);
		double tcost = Double.parseDouble(rs.getString(3));
		double tax = Double.parseDouble(rs.getString(4));
		double dispenser = Double.parseDouble(rs.getString(5));;
		double initqun = Double.parseDouble(rs.getString(6));;
		double dprice = Double.parseDouble(rs.getString(7));;
		double rqun = Double.parseDouble(rs.getString(8));;
		double share = Double.parseDouble(rs.getString(9));;

		petrolob = new Petrol(id1,dates,tcost, tax, dispenser, initqun, dprice, rqun,share);
		
	}

} catch (Exception e) {

	e.printStackTrace();
}

return petrolob;
}
	
	





	
	
}
