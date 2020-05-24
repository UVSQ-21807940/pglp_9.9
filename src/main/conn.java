package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conn {
	private static final String Driver ="org .apache.derby.jdbc.EmbeddedDriver";
	private static final String JDBC_URL="jdbc:derby:DerbyDB;create=true";
	
	static Connection connt ;
	int i;
	public conn(int i) throws SQLException {
		
		try {
			    this.connt= DriverManager.getConnection(JDBC_URL);
				if(this.connt!=null) {
					System.out.println("connect�");
					this.i=1;
					
					
				}
		}catch(SQLException e) {
			System.out.println("nop");
		}
	}
		public static  Connection getInstance() throws SQLException {
			
			if (connt == null) {
				new conn(3); 
				System.out.println("instanciation de connexion");
				
				}
			else {
				
				System.out.println("connexion d�ja �tabli");
				
				
			}
			return connt ; 
			
		}
		public static Connection getConn() {
	        return connt;
	    }
		
		public int get_i() {
			return i;
		}
		
		
}
