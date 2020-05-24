package main;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FormeDao extends DAO<Obj> {
	@Override
	public Obj CreateCercle(Obj c) throws SQLException {
     try {
			  
			  DatabaseMetaData dbmd = conn.getInstance().getMetaData();
		      java.sql.ResultSet rs = dbmd.getTables(null, null,
		              "forme3".toUpperCase(), null);
		      
		      
		      
		           java.sql.Statement creation = conn.getInstance().createStatement();
		      
		      
		      
		          if (!((java.sql.ResultSet) rs).next()) {
		              ((java.sql.Statement) creation).executeUpdate("Create table forme3"
		                      + " (type varchar(30),nom varchar(30), x int,y int ,h int ,z int)");
		              
		          }
			    
			     System.out.println("la table forme est cr�e");
		  }catch(SQLException e) {
			  System.out.println("n'est pas cr�e");
		  }
		    if(!verefie(c.getNom())) {

				  try {
					  String updateString = ("insert into forme3 values ('Un Cercle',?, ?, ?, ?,null)");
			          java.sql.PreparedStatement update =
			                  conn.getInstance().prepareStatement(updateString);
			          
			            update.setString(1, c.getNom());
						update.setInt(2, c.get_x());
						update.setInt(3, c.get_y());
						update.setInt(4, c.get_h());
			         
			          update.executeUpdate();
			          update.close();
			          
			          System.out.println("votre dessin est ajouter sur la base de donn�es ");
				  }catch(SQLException e) {
					  System.out.println("erreur d'insertion");
				  }
		    }else {
		    	System.out.println("ce nom existe deja dans la base de donn�es");
		    }
		
		  
		  return c;
	}
	
	
    
	@Override
	public Obj CreateCarre(Obj c) throws SQLException {
	 try {
			  
			  DatabaseMetaData dbmd = conn.getInstance().getMetaData();
		      java.sql.ResultSet rs = dbmd.getTables(null, null,
		              "forme3".toUpperCase(), null);
		      
		      
		      
		           java.sql.Statement creation = conn.getInstance().createStatement();
	      if (!((java.sql.ResultSet) rs).next()) {
		              ((java.sql.Statement) creation).executeUpdate("Create table forme3"
		                      + " (type varchar(30),nom varchar(30), x int,y int ,h int ,z int)");
		              
		          }
			    
			     System.out.println("la table forme est cr�e");
		  }catch(SQLException e) {
			  System.out.println("n'est pas cr�e");
		  }
	 if(!verefie(c.getNom())) {
		 try {
			  String updateString = ("insert into forme3 values ('Un Carre',?, ?, ?, ?,null)");
	          java.sql.PreparedStatement update =
	                  conn.getInstance().prepareStatement(updateString);
	          
	            update.setString(1, c.getNom());
				update.setInt(2, c.get_x());
				update.setInt(3, c.get_y());
				update.setInt(4, c.get_h());
	         
	          update.executeUpdate();
	          update.close();
	          
	          System.out.println("votre dessin est ajouter sur la base de donn�es ");
		  }catch(SQLException e) {
			  System.out.println("erreur d'insertion");
		  }
		  
	 }else {
		 System.out.println("ce nom existe deja la base de donn�es");
	 }
		
		 
		 
		  return c;
	}
	
	@Override
	public Obj CreateTriangle(Obj c) throws SQLException {
	 try {
			  
			  DatabaseMetaData dbmd = conn.getInstance().getMetaData();
		      java.sql.ResultSet rs = dbmd.getTables(null, null,
		              "forme3".toUpperCase(), null);
		      
		      
		      
		           java.sql.Statement creation = conn.getInstance().createStatement();
		      
		      
		      
		          if (!((java.sql.ResultSet) rs).next()) {
		              ((java.sql.Statement) creation).executeUpdate("Create table forme3"
		                      + " (type varchar(30),nom varchar(30), x int,y int ,h int ,z int)");
		              
		          }
			    
			     System.out.println("la table forme est cr�e");
		  }catch(SQLException e) {
			  System.out.println("n'est pas cr�e");
		  }
	 if(!verefie(c.getNom())) {

		  try {
			  String updateString = ("insert into forme3 values ('Un Triangle',?, ?, ?, ?,null)");
	          java.sql.PreparedStatement update =
	                  conn.getInstance().prepareStatement(updateString);
	          
	            update.setString(1, c.getNom());
				update.setInt(2, c.get_x());
				update.setInt(3, c.get_y());
				update.setInt(4, c.get_h());
	         
	          update.executeUpdate();
	          update.close();
	          
	          System.out.println("votre dessin est ajouter sur la base de donn�es ");
		  }catch(SQLException e) {
			  System.out.println("Erreur d'insertion");
		  }
	 }else {
		 System.out.println("ce nom existe deja la base de donn�es");
	 }
		
		  
		  return c;
	}
	
	public Obj CreateRectangle(Obj c) throws SQLException {
		 try {
				  
				  DatabaseMetaData dbmd = conn.getInstance().getMetaData();
			      java.sql.ResultSet rs = dbmd.getTables(null, null,
			              "forme3".toUpperCase(), null);
			      
			      
			      
			           java.sql.Statement creation = conn.getInstance().createStatement();
			      
			      
			      
			          if (!((java.sql.ResultSet) rs).next()) {
			              ((java.sql.Statement) creation).executeUpdate("Create table forme3"
			                      + " (type varchar(30),nom varchar(30), x int,y int ,h int ,z int)");
			              
			          }
				    
				     System.out.println("la table forme est cr�e");
			  }catch(SQLException e) {
				  System.out.println("n'est pas cr�e");
			  }
			
		 if(!verefie(c.getNom())) {

			  try {
				  String updateString = ("insert into forme3 values ('Un Rectangle',?, ?, ?, ?, ?)");
		          java.sql.PreparedStatement update =
		                  conn.getInstance().prepareStatement(updateString);
		          
		            update.setString(1, c.getNom());
					update.setInt(2, c.get_x());
					update.setInt(3, c.get_y());
					update.setInt(4, c.get_h());
					update.setInt(5, c.get_z());
		         
		          update.executeUpdate();
		          update.close();
		          
		          System.out.println("votre dessin est ajouter sur la base de donn�es ");
			  }catch(SQLException e) {
				  System.out.println("Erreur D'insertion");
			  }
			   
		 }else {
			 System.out.println("ce nom existe deja la base de donn�es");
		 }
			
			  return c;
		}


	
	
	
	
	
	
	@Override
	public Obj MoveForme(String hh,int hh1,int hh2) {
		try {
			PreparedStatement prepare =conn.getInstance().prepareStatement("update forme3 set x=?,y=? where nom=?");
			
			prepare.setInt(1, hh1);
			prepare.setInt(2, hh2);
			prepare.setString(3, hh);
			
			
			
			
			
			int result=prepare.executeUpdate();
			
			
		
            prepare.close();
		}catch(SQLException r) {
			r.printStackTrace();
			System.out.println("merde");
		}
		 Afficher();
		return null;
		
	}
  public void Afficher() {
	  try {
		  java.sql.Statement stmt = conn.getInstance().createStatement();
		  java.sql.ResultSet rs = stmt.executeQuery("SELECT * FROM forme3");
		  System.out.println("---Table formes:---\n");
          
          while (rs.next()) {
        	  if(!rs.getString("type").equals("Un Rectangle")) {
        		  System.out.printf("%s de nom %s et de centre(%d,%d)et de rayon %d%n",rs.getString("type"),rs.getString("nom"),
                          rs.getInt("x"),rs.getInt("y"),rs.getInt("h"));
        	  }else {
        		  System.out.printf("%s de nom %s et de centre(%d,%d)et de Longueur %d et de largeur %d%n",rs.getString("type"),rs.getString("nom"),
                          rs.getInt("x"),rs.getInt("y"),rs.getInt("h"),rs.getInt("z"));
        	  }
        	  
        	  
              
             
         
          }
	        	  rs.close();
	              stmt.close();
        	  }catch(SQLException e) {
        		  System.out.println("Nop5");
        	  }
  }
public boolean verefie(String h) throws SQLException {
	boolean si=false;
	
	  java.sql.Statement stmt = conn.getInstance().createStatement();
	  java.sql.ResultSet rs = stmt.executeQuery("SELECT * FROM forme3");
	  System.out.println("---Table formes:---\n");
  
  while (rs.next()) {
	  if(rs.getString("nom").equals(h)) {
			si=true;
		  
		  
		  
	  }
    
  }
      	  rs.close();
            stmt.close();
	 

return si;
}
	
	
	
	
}
