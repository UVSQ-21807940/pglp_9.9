package main;
import java.sql.Connection;
import java.sql.SQLException;

public abstract class DAO<T> {
	
	
    public abstract T CreateCercle(T c) throws SQLException;
    public abstract T CreateCarre(T c) throws SQLException;
    public abstract T CreateTriangle(T c) throws SQLException;
    public abstract T CreateRectangle(T c) throws SQLException;
   public abstract T MoveForme(String h,int x,int y);
   public abstract void Afficher();
	
   
    
}
