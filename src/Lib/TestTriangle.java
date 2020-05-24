package Lib;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Triangle;

public class TestTriangle {

	 Triangle c=new Triangle("t1",1,2,4);
		
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
			assertEquals(c.get_y(),2);
		}
		@Test
		public void Test_h() {
			assertEquals(c.get_h(),4);
		}

}
