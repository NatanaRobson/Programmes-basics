package surface_secteur_circulaire;


//IMPORT OBJET UTIL :
	import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
						
				
//DECLARATION VAR :
		double aire;
		double pi = Math.PI;
		double rayon;
		double angle;
		double A;
		Scanner sc = new Scanner (System.in);
		
//DEBUT DU PROG
		
		System.out.println("CALCUL DE LA SURFACE D'UN SECTEUR CIRCULAIRE");
		
		System.out.println("Saisir le rayon :");
			rayon = sc.nextDouble();
			
		System.out.println("Saisir l'angle :");	
			angle = sc.nextDouble();
			
			aire = (pi*Math.pow(rayon, 2)*angle)/360;
			
			A = Math.round(aire*100.00)/100.00;
				
		System.out.println("L'aire du secteur circulaire est de : " + aire + " soit :" + A);
			
	sc.close();
	
	}

}
