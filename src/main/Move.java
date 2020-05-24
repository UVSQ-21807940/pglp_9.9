package main;
import java.io.IOException;

public class Move implements Commande{

	DrawingTUI re;
	 

	       public Move(DrawingTUI re) {
	    	   this.re=re;
	       }
	  /* public void execute() throws IOException {
		    re.move();
	}*/


		@Override
		public void execute() throws IOException {
			// TODO Auto-generated method stub
			re.move();
		}
		
	

}
