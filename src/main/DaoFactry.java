package main;

public class DaoFactry {
	public static <T> DAO<T> getEtudiantDAO(){
	       
	    	   return (DAO<T>) new FormeDao();
	    	   
	       
	    	
	    }
}
