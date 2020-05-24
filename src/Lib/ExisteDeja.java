package Lib;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import main.Carre;
import main.Commande;
import main.DrawingTUI;
import main.Invoqueur;
import main.NextCommande;
import main.conn;



class ExisteDeja {

	@Test
	public void existedeja() throws IOException, SQLException {
		  Carre c=new Carre("carre",12,10,30);
		  DrawingTUI rec=new DrawingTUI(c,"create","Carre");
		    Commande cm=new NextCommande(rec);
	        Invoqueur tel=new Invoqueur();
	        tel.addnew("A", cm);
	        tel.inv("A");
	      Carre c1=new Carre("carre",12,10,30);
		 DrawingTUI rec1=new DrawingTUI(c1,"create","Carre");
			    Commande cm1=new NextCommande(rec1);
		        Invoqueur tel1=new Invoqueur();
		        tel1.addnew("A", cm1);
		        tel1.inv("A");
		        
		        assertEquals(verefie(),1);
	        
	}
	
	public int verefie() throws SQLException {
		int i=0;
		
		  java.sql.Statement stmt = conn.getInstance().createStatement();
		  java.sql.ResultSet rs = stmt.executeQuery("SELECT * FROM forme3");
		  System.out.println("---Table formes:---\n");
        
        while (rs.next()) {
      	
      	  if(rs.getString("nom").equals("carre")) {
      		 i++;
      		  
      	  }
          
        }
	        	  rs.close();
	              stmt.close();
      	 
	
	return i;
	}

}
