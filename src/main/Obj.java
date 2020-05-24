package main;

public abstract class Obj {
	protected String nom;
	protected int x;
	protected int y;
	protected int h;
	protected int z;
	
	
	public Obj(String nom){
		this.nom = nom;
	}
	public Obj(String nom,int x,int y,int h){
		this.nom = nom;
		this.x=x;
		this.y=y;
		this.h=h;
	}
	public Obj(String nom,int x,int y,int h,int z){
		this.nom = nom;
		this.x=x;
		this.y=y;
		this.h=h;
		this.z=z;
	}
    public String getNom() {
    	return nom;
    }
    
    public int get_x() {
    	return x;
    }
    public int get_y() {
    	return y;
    }
    public int get_h() {
    	return h;
    }
    public int get_z() {
    	return z;
    }
	public String toString () {
		return this.nom;
	}
	public abstract boolean isRep();
}
