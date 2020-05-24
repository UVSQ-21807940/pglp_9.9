package Lib;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Rectangle;

public class TestRectangle {

	 Rectangle c=new Rectangle("t1",1,3,4,5);
		
		@Test
		public void TestNom() {
			assertEquals(c.getNom(),"t1");
		}
		@Test
		public void Test_x() {
			assertEquals(c.get_x(),1);
		}
		@Test
		public void Test_y() {
			assertEquals(c.get_y(),3);
		}
		@Test
		public void Test_h() {
			assertEquals(c.get_h(),4);
		}
		@Test
		public void Test_z() {
			assertEquals(c.get_z(),5);
		}
}
