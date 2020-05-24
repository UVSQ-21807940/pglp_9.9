package Lib;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Cercle;

public class TestCercle {

	 Cercle c=new Cercle("c2",1,2,3);
		
		@Test
		public void TestNom() {
			assertEquals(c.getNom(),"c2");
		}
		@Test
		public void Test_x() {
			assertEquals(c.get_x(),1);
		}
		@Test
		public void Test_y() {
			assertEquals(c.get_y(),2);
		}
		@Test
		public void Test_h() {
			assertEquals(c.get_h(),3);
		}

}
