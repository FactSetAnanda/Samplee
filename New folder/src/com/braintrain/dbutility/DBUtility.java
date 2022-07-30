package com.braintrain.dbutility;
import java.sql.*;
import java.sql.Connection;

public class DBUtility {

		public static Connection getConnection( ) throws ClassNotFoundException, SQLException{
		        Connection con = null;

		            Class.forName("oracle.jdbc.driver.OracleDriver");
		            con =DriverManager.getConnection("jdbc:oracle:thin:@172.16.153.233:1521:xe","user3","techm123");
		            return con;

		        }

		     public static void closeConnection(Connection con) throws SQLException{
		         con.close( );
		    }
}