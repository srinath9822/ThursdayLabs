package com.labs;

import java.sql.*;
import java.sql.Statement;

public class DataRetrieve {
	void createConnection() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","root");
		Statement smt=con.createStatement();
		String sql="select * from authors where city LIKE 'S%'";
		ResultSet rs=smt.executeQuery(sql);
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String city=rs.getString("city");
			System.out.println(id+"\t"+name+"\t"+city);
		}
	} catch (ClassNotFoundException|SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataRetrieve d=new DataRetrieve();
		d.createConnection();

	}

}
