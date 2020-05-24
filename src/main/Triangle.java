package main;

public class Triangle extends Obj {
	  int x,y;
	     int h;
	     
	     public Triangle(String nom,int x,int y,int h) {
	    	 super(nom,x,y,h);
	    	
	    	 
	     }
	     public String getNom() {
	    	 return nom;
	     }
	     
	     public String get_H() {
	    	 return "Rayon = "+h;
	     }
	     public String getCentre() {
	    	 return "("+x+","+y+")";
	     }
	     public String toString() {
	    	 return "("+getNom()+"( centre "+getCentre()+","+get_H()+"))";
	     }
		@Override
		public boolean isRep() {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public int get_x() {
			// TODO Auto-generated method stub
			return super.get_x();
		}
		@Override
		public int get_y() {
			// TODO Auto-generated method stub
			return super.get_y();
		}
		@Override
		public int get_h() {
			// TODO Auto-generated method stub
			return super.get_h();
		}
		@Override
		public int get_z() {
			// TODO Auto-generated method stub
			return 0;
		}
}
