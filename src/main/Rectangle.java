package main;

public class Rectangle extends Obj {
	int x,y;
    int h,z;
    
    public Rectangle(String nom,int x,int y,int h,int z) {
    	super(nom,x,y,h,z);
    	
    }
    public String getRectangle() {
    	if(h>z) {
    		return "Longueur "+h+", Largeur "+z;
    	}else {
    		return "Longueur ="+z+", Largeur ="+h;
    	}
    	 
    }
    
    public String getNom() {
    	return nom;
    }
    public String getCentre() {
   	 return "("+x+","+y+")";
    }
    public String toString() {
   	 return "("+getNom()+"( centre "+getCentre()+","+getRectangle()+"))";
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
		return super.get_z();
	}
}