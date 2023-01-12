 package sphere;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		DECLARATION DES VARIABLE
		
		DEBUT PROG		
		
		FIN PROGRAMME
		
		FORMULES
		
		double pi = math.pi;
		
		
		
		PSEUDO CODE :
		
		Afficher	"Calcule Aire & Volume d'une sphère
		Quel est le rayon?"
	Lire	R
	Aire	
	Volume	

		 */
		
	// DECLARATION DES VARIABLE
		
		System.out.println("");
		
		double pi = Math.PI;
		double rayon;
		
		double aire; 
		double volume;
		
		double Vrest;
		double Arest;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CALCUL DE L'AIRE D'UN CERCERCLE ET DU VOLUME D'UNE SPHERE");
		
		System.out.println("");
		
		System.out.println("Saisir le rayon en cm");
		rayon = sc.nextInt();
		
		aire = 4*pi*Math.pow(rayon,2);
		volume = 4/3*pi*Math.pow(rayon,3);

		System.out.println("L'aire est de " + aire + " cm2 et le volume est de " + volume + " cm3");
		
		Arest = Math.round(aire*100.0)/100.0;
		Vrest = Math.round(volume*100.0)/100.0;
	
		System.out.println("");
		
		System.out.println("L'aire est de " + Arest + " cm2 et le volume est de " + Vrest + " cm3");
	
		
		sc.close();
		
	}}
