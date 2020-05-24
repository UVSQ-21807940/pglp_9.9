package Lib;


import static org.junit.jupiter.api.Assertions.*;

import java.beans.Statement;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import main.conn;

class TestConnexion {
      
int i=0;
  
	
	
    @Test
	public void test() throws SQLException {
    	
        conn cn=new conn(i);
    	assertEquals(1, cn.get_i());
    }
	
}
