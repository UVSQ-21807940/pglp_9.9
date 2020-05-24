package main;

import java.sql.SQLException;

public class DrawingTUI {
	Cercle c;
	Triangle t;
	Carre c1;
	Rectangle r;
	String hh0;
	String hh;
	int hh1;
	int hh2;

	
	public DrawingTUI(String hh0,String hh,int hh1,int hh2) {
		this.hh0=hh0;
		this.hh=hh;
		this.hh1=hh1;
		this.hh2=hh2;
		
	}
	public DrawingTUI(Cercle c,String hh0 ,String hh) {
		this.hh0=hh0;
		this.c=c;
		this.hh=hh;
	}
	public DrawingTUI(String hh0) {
		this.hh0=hh0;
	}
	public DrawingTUI(Carre c1,String hh0 ,String hh) {
		this.hh0=hh0;
		this.c1=c1;
		this.hh=hh;
	}
	public DrawingTUI(Triangle t,String hh0 ,String hh) {
		this.hh0=hh0;
		this.t=t;
		this.hh=hh;
	}
	public DrawingTUI(Rectangle r,String hh0 ,String hh) {
		this.hh0=hh0;
		this.r=r;
		this.hh=hh;
	}
	public DrawingTUI() {}
	
	public void NextCommande() throws SQLException {
		if(hh0.equals("create")) {
			Create ();
		}else if(hh0.equals("move")) {
			move();
		}else {
			affiche();
		}
		
	}
	
	
	public void Create() throws SQLException {
		if(hh.equals("Cercle")) {
			 DAO<Cercle> p=DaoFactry.getEtudiantDAO();
	         p.CreateCercle(c);
		}
		
		else if(hh.equals("Carre")) {
			 DAO<Carre> p=DaoFactry.getEtudiantDAO();
	         p.CreateCarre(c1);
		}
		
		
		else if(hh.equals("Triangle")) {
			DAO<Triangle> p=DaoFactry.getEtudiantDAO();
	         p.CreateTriangle(t);
		}
		
		else {
			DAO<Rectangle> p=DaoFactry.getEtudiantDAO();
	         p.CreateRectangle(r);
		}
		
	}
	
	public void move() {
		
			 DAO<Obj> p=DaoFactry.getEtudiantDAO();
	         p.MoveForme(hh,hh1,hh2);
		
	}
	public void affiche() {
		DAO<Obj> p=DaoFactry.getEtudiantDAO();
        p.Afficher();
	}
}
