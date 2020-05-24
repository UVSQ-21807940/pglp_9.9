package main;
import java.io.IOException;
import java.sql.SQLException;

public class NextCommande implements Commande {
	 DrawingTUI re;
	 

     public NextCommande(DrawingTUI re) {
  	   this.re=re;
     }
   public void execute() throws IOException, SQLException {
	    re.NextCommande();
}
	
}
