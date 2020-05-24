package Lib;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Carre;

public class TestCarre {

	 Carre c=new Carre("c1",1,1,1);
		
		@Test
		public void TestNom() {
			assertEquals(c.getNom(),"c1");
		}
		@Test
		public void Test_x() {
			assertEquals(c.get_x(),1);
		}
		@Test
		public void Test_y() {
			assertEquals(c.get_y(),1);
		}
		@Test
		public void Test_h() {
			assertEquals(c.get_h(),1);
		}

}
