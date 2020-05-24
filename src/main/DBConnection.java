package main;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.derby.iapi.sql.PreparedStatement;
import org.apache.derby.iapi.sql.ResultSet;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;


public class DBConnection {
	
	private static final String Driver ="org.apache.derby.jdbc.EmbeddedDriver";
	private static final String JDBC_URL="jdbc:derby:DerbyDB;create=true";
	
	Connection conn ;
	
	public DBConnection() throws SQLException {
		try {
			    this.conn= DriverManager.getConnection(JDBC_URL);
				if(this.conn!=null) {
					System.out.println("connect�");
				}
		}catch(SQLException e) {
			System.out.println("nop");
		}
		  try {
			  
			  DatabaseMetaData dbmd = getConn().getMetaData();
		      java.sql.ResultSet rs = dbmd.getTables(null, null,
		              "formee".toUpperCase(), null);
		      
		      
		      
		           java.sql.Statement creation = getConn().createStatement();
		      
		      
		      
		          if (!((java.sql.ResultSet) rs).next()) {
		              ((java.sql.Statement) creation).executeUpdate("Create table formee"
		                      + " (nom varchar(30), type varchar(30))");
		              System.out.println("aa");
		          }
			    
			     System.out.println("ff");
		  }catch(SQLException e) {
			  System.out.println("nop2");
		  }
		
		 
		  try {
			  String updateString = ("insert into formee values ('hamid','simoh')");
	          java.sql.PreparedStatement update =
	                  getConn().prepareStatement(updateString);
	         
	          update.executeUpdate();
	          update.close();
	          
	          System.out.println("insert");
		  }catch(SQLException e) {
			  System.out.println("nop3");
		  }
		  
		  try {
			  java.sql.Statement stmt = getConn().createStatement();
			  java.sql.ResultSet rs = stmt.executeQuery("SELECT * FROM formee");
			  System.out.println("---Table formes:---\n");
              System.out.println("nom\t type");
		        	  while (rs.next()) {
			              System.out.printf("%s\t%s%n", rs.getString("nom"),
			                      rs.getString("type"));
			             
			         
			          }
		        	  rs.close();
		              stmt.close();
	        	  }catch(SQLException e) {
	        		  System.out.println("Nop5");
	        	  }
		          
		          
		        
		     
		  
		 
		
		  
		  
	}
	 public Connection getConn() {
	        return conn;
	    }
	

}
