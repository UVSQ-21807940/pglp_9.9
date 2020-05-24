package Lib;
import  org.junit.jupiter.api.Assertions.*;

import main.Commande;
import main.DrawingTUI;
import main.Invoqueur;
import main.NextCommande;
import main.conn;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class TesteMove {

	@Test
	public void testmove() throws IOException, SQLException {
		
			    DrawingTUI rec=new DrawingTUI("move","cc1",20,20);
			    Commande cm=new NextCommande(rec);
		        Invoqueur tel=new Invoqueur();
		        tel.addnew("A", cm);
		        tel.inv("A");
		        assertTrue(verefier("cc1")==true);
		        
	} 
	
	public boolean verefier(String h) throws SQLException {
		boolean si=false;
		
		  java.sql.Statement stmt = conn.getInstance().createStatement();
		  java.sql.ResultSet rs = stmt.executeQuery("SELECT * FROM forme3");
		  System.out.println("---Table formes:---\n");
        
        while (rs.next()) {
      	  if(rs.getString("nom").equals(h)) {
      		  if(rs.getInt("x")==20 && rs.getInt("y")==20) {
      			si=true;
      		  }
      		  
      		  
      	  }
          
        }
	        	  rs.close();
	              stmt.close();
      	 
	
	return si;
	}

}
