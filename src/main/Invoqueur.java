package main;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Invoqueur {
	 private Map<String,Commande>com=new HashMap<String,Commande>();
     public void addnew(String ref,Commande cmd) {
    	 com.put(ref,cmd);
     }
     public void inv(String ref) throws IOException, SQLException {
    	 Commande cmd=com.get(ref); 
         if(cmd!=null) cmd.execute();
     }
}
