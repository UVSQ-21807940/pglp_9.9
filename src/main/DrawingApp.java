package main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public enum DrawingApp {
ENVIRONNEMENT;

	public void run() throws IOException,
    SQLException, ClassNotFoundException {
		
		System.out.println("Tapez une Commande de format 'create c1 = Cercle((0, 0), 50)'pour cree et 'move (c1, (10, 20))' pour modifier");
	    Scanner sc=new Scanner (System.in);
	   String cmd=sc.nextLine();
	   
		   while(!cmd.equals("exit")) {
			  String cmd2=FormeDessin(cmd);
				  
				   if(cmd.equals("Affiche")) {
					   DrawingTUI rec=new DrawingTUI(cmd);
					    Commande cm=new NextCommande(rec);
				        Invoqueur tel=new Invoqueur();
				        tel.addnew("A", cm);
				        tel.inv("A");
				   }else {
					   if(cmd2.equals("Cercle")) {
						   String  cmd1=TypeCommande(cmd);
						   String cmd3=NomForme(cmd);
						   
						   
						   
						   try {
							   int cmd6=Logueur(cmd);
							   int cmd4=Centre_x(cmd);
							   int cmd5=Centre_y(cmd);
							   Cercle c=new Cercle(cmd3,cmd4,cmd5,cmd6);
							   DrawingTUI rec=new DrawingTUI(c,cmd1,cmd2);
							   Commande cm=new NextCommande(rec);
						        Invoqueur tel=new Invoqueur();
						        tel.addnew("A", cm);
						        tel.inv("A");
							  }catch(NumberFormatException e) {
								  System.out.println("veuillez respecter le format");
							  }
					
						   
					   }else if(cmd2.equals("Carre")) {
						   String  cmd1=TypeCommande(cmd);
						   String cmd3=NomForme(cmd);
						   
						   try {
							   int cmd6=Logueur(cmd);
							   int cmd7=largeur(cmd);
							   int cmd4=Centre_x(cmd);
							   int cmd5=Centre_y(cmd);
							   Carre c=new Carre(cmd3,cmd4,cmd5,cmd6);
							    DrawingTUI rec=new DrawingTUI(c,cmd1,cmd2);
							    Commande cm=new NextCommande(rec);
						        Invoqueur tel=new Invoqueur();
						        tel.addnew("A", cm);
						        tel.inv("A");
						   }catch(NumberFormatException e) {
							   System.out.println("veuillez respecter le format");
						   }
						   
					   }else if(cmd2.equals("Triangle")) {
						   String  cmd1=TypeCommande(cmd);
						   String cmd3=NomForme(cmd);
						   try {
							   int cmd4=Centre_x(cmd);
							   int cmd6=Logueur(cmd);
							   int cmd7=largeur(cmd);
						
							   int cmd5=Centre_y(cmd);
							   Triangle c=new Triangle(cmd3,cmd4,cmd5,cmd6);
							    DrawingTUI rec=new DrawingTUI(c,cmd1,cmd2);
							    Commande cm=new NextCommande(rec);
						        Invoqueur tel=new Invoqueur();
						        tel.addnew("A", cm);
						        tel.inv("A");
						   }catch(NumberFormatException e) {
							   System.out.println("veuillez respecter le format");
						   }
						   
						   
					   }else if(cmd2.equals("Rectangle")){
						   String  cmd1=TypeCommande(cmd);
						   String cmd3=NomForme(cmd);
						   try {
							   int cmd6=Logueur(cmd);
							   int cmd7=largeur(cmd);
							   int cmd4=Centre_x(cmd);
							   int cmd5=Centre_y(cmd);
							    Rectangle r=new Rectangle(cmd3,cmd4,cmd5,cmd6,cmd7);
							    DrawingTUI rec=new DrawingTUI(r,cmd1,cmd2);
							    Commande cm=new NextCommande(rec);
						        Invoqueur tel=new Invoqueur();
						        tel.addnew("A", cm);
						        tel.inv("A");
						   }catch(NumberFormatException e) {
							   System.out.println("veuillez respecter le format");
						   }
						
					   }else if(cmd2.equals("non")) {
						   System.out.println("veuillez respecter le format");
					   } else {
						   String  cmd1=TypeCommande(cmd);
						   String cmd3=NomForme(cmd);
						   if(cmd3.equals("non")) {
							   System.out.println("veuillez respecter le format");
						   }else {
						   try {
							   
							   System.out.println(cmd1);
							   System.out.println(move_nom(cmd));
							   System.out.println(move_y(cmd));
								   DrawingTUI rec=new DrawingTUI(cmd1,move_nom(cmd),move_x(cmd),move_y(cmd));
								    Commande cm=new NextCommande(rec);
							        Invoqueur tel=new Invoqueur();
							        tel.addnew("A", cm);
							        tel.inv("A");
						   }catch(NumberFormatException e) {
							   System.out.println("veuillez respecter le format");
						   }
					   }
					   }	
					   						   
				   }
				   System.out.println("Tapez une Commande de format 'create c1 = Cercle((0, 0), 50)'pour cree et 'move (c1, (10, 20))' pour modifier");
				   cmd=sc.nextLine();
				 
				   
				   

		   }
	 


			   
		   
			   System.out.println("************************fin du programme******************************");
			 
			   
		   
	}
	
	public static String TypeCommande(String mot) {
		String cmd2[]=mot.split(" ");
		return cmd2[0];
	}
	
	public static String FormeDessin(String mot) {
		  int n=mot.indexOf("Triangle");
		  int n1=mot.indexOf("Cercle");
		  int n2=mot.indexOf("Carre");
		  int n3=mot.indexOf("Rectangle");
		  int n4=mot.indexOf("move");
		   if(n!=-1 ) {
			   String hh =mot.substring(n);
			   String mot1="";
			   int i=0;
			   while (hh.charAt(i)!='(') {
				  
					   mot1+=hh.charAt(i);
					   i++;
				   
			   }
			   return mot1;
		   }else if(n1!=-1) {
			   String hh =mot.substring(n1);
			   String mot1="";
			   int i=0;
			   while (hh.charAt(i)!='(') {
				  
					   mot1+=hh.charAt(i);
					   i++;
				   
			   }
			   return mot1;
		   }else if(n2!=-1) {
			   String hh =mot.substring(n2);
			   String mot1="";
			   int i=0;
			   while (hh.charAt(i)!='(') {
				  
					   mot1+=hh.charAt(i);
					   i++;
				   
			   }
			   return mot1;
		   }else if(n3!=-1) {
			   String hh =mot.substring(n3);
			   String mot1="";
			   int i=0;
			   while (hh.charAt(i)!='(') {
				  
					   mot1+=hh.charAt(i);
					   i++;
				   
			 
			  
		   }  
			   return mot1;
			   }else if(n4!=-1) {
				   String hh =mot.substring(n4);
				   String mot1="";
				   int i=0;
				   while (hh.charAt(i)!='(' && hh.charAt(i)!=' '&& i <hh.length()-1) {
					  
						   mot1+=hh.charAt(i);
						   i++;
					   
				 
				   
			   }   
				   if(mot1.equals("move")) {
					   return mot1;
				   }
				   
		   }
			   return "non";
		   
		 
	}
public static String NomForme(String mot) {
	String cmd2[]=mot.split(" ");
	if(cmd2.length!=1) {
		return cmd2[1];
	}
	return "non";
	
}

public static int Centre_x(String mot) {
	    int k=0;
	    int y=0;
	    int i=0;
	    String x="";
	    while(mot.charAt(i)!='('&& mot.length()>=i) {
	    	
	    	if(mot.charAt(i+1)=='(') {
	    		 k=i+3;
	    		while(mot.charAt(k)!=','&&k<=mot.length()) {
	    			x+=mot.charAt(k);
	    			k++;
	    		}
	    		
	    		
	    		
	    	}
	    	i++;
	    }
	    if(mot.length()==i||mot.length()==k) {
	    	x="hh";
	    }
	    y=Integer.parseInt(x);
	    return y;
}
public static int Centre_y(String mot) {
	  int y=0;
	  int k=0;
	    int i=0;
	    String x="";
	    while(mot.charAt(i)!=','&& mot.length()>=i) {
	    	
	    	if(mot.charAt(i+1)==',') {
	    		 k=i+3;
	    		while(mot.charAt(k)!=')'&& mot.length()>=k) {
	    			x+=mot.charAt(k);
	    			k++;
	    		}
	    		
	    		
	    		
	    	}
	    	i++;
	    }
	    if(mot.length()==i||mot.length()==k) {
	    	x="hh";
	    }
	    y=Integer.parseInt(x);
	    return y;
}

public static int Logueur(String mot) {
	    int n3=mot.indexOf("Rectangle");
	    int y=0;
	    int i=0;
	    int k=0;
	   
	    String x="";
	    if(n3!=-1) {
	   	 while(mot.charAt(i)!=')'&& mot.length()>=i) {
	 	    	
	 	    	if(mot.charAt(i+1)==')') {
	 	    		 k=i+4;
	 	    		while(mot.charAt(k)!=','&& mot.length()>=k) {
	 	    			x+=mot.charAt(k);
	 	    			k++;
	 	    		}
	 	    		
	 	    		
	 	    		
	 	    	}
	 	    	i++;
	 	    }
	    }else {
	   	 while(mot.charAt(i)!=')'&& i<mot.length()-1) {
	 	    	
	 	    	if(mot.charAt(i+1)==')') {
	 	    		 k=i+4;
	 	    		while(mot.charAt(k)!=')'&& mot.length()>=k) {
	 	    			x+=mot.charAt(k);
	 	    			k++;
	 	    		}
	 	    		
	 	    		
	 	    		
	 	    	}
	 	    	i++;
	 	    }
	    }
	    
	    if(mot.length()==i-1||mot.length()==k) {
	    	x="hh";
	    }
	    
	    
	 	    y=Integer.parseInt(x);
	 	    return y;

	    }
public static int largeur(String mot) {
	int n3=mot.indexOf("Rectangle");
	String x="";
	System.out.println(n3);
	if(n3!=-1) {
		while(mot.charAt(n3)!=')'&& mot.length()>=n3) {
			n3++;
		}
		n3+=2;
		while(mot.charAt(n3)!=','&& mot.length()>=n3) {
			n3++;
		}
		n3++;
		while(mot.charAt(n3)!=')'&& mot.length()>=n3) {
			x+=mot.charAt(n3);
			n3++;
		}
		 if(mot.length()==n3) {
		    	x="hh";
		    }
		int y=Integer.parseInt(x);
		return y;
	}
	return 0;
	
}

public static int move_x(String mot) {
	int n=mot.indexOf("move");
	String x="";
	if(n!=-1) {
		while (mot.charAt(n)!=','&& mot.length()>=n) {
			n++;
		}
		n+=3;
		while(mot.charAt(n)!=','&& mot.length()>=n) {
			x+=mot.charAt(n);
			n++;
		}
		 if(mot.length()==n) {
		    	x="hh";
		    }
		int y=Integer.parseInt(x);
		return y;
	}
	System.out.println("Veuillez respecter le format");
	return 0;
}
public static int move_y(String mot) {
	String s=String.valueOf(move_x(mot));
	int n=mot.indexOf(s);
	String x="";
	if(n!=-1) {
		while (mot.charAt(n)!=','&& mot.length()>=n) {
			n++;
		}
		n+=2;
		while(mot.charAt(n)!=')'&& mot.length()>=n) {
			x+=mot.charAt(n);
			n++;
		}
		
		 if(mot.length()==n) {
		    	x="hh";
		    }
		int y=Integer.parseInt(x);
		
		return y;
		
	}
	System.out.println("Veuillez respecter le format");
	return 0;
}
public static String move_nom(String mot) {
	int n=mot.indexOf("move");
	String x="";
	if(n!=-1) {
		while (mot.charAt(n)!='('&& mot.length()>=n) {
			n++;
		}
		n++;
		while(mot.charAt(n)!=','&& mot.length()>=n) {
			x+=mot.charAt(n);
			n++;
		}
		System.out.println(x);
		return x;
	}
	System.out.println("Veuillez respecter le format");
	return null;
	
	
}

public static void main(final String[] args) throws SQLException,
ClassNotFoundException, IOException {
    ENVIRONNEMENT.run();
}
}
