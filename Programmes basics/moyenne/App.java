package moyenne;

import java.util.Scanner;

public class App {

	/*
	DECLARATION DES VARIABLE
	
	DEBUT PROGRAMME
	
	FIN PROGRAMME
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//VARIABLE
		
		double nbr1;
		double nbr2;
		
	//DEBUT PROG	
		Scanner sc = new Scanner(System.in); //permet de lire les saisies utilisateur

		
		System.out.println("PROG CAL MOY 2 NBR");
		System.out.println("veuillez choisir nbr 1");
		
		nbr1  = sc.nextInt();

		System.out.println("Vous avez saisi nbr 1 => " + nbr1);
		
		System.out.println("Veuillez saisir nbr 2");
		nbr2 = sc.nextInt();
		
		System.out.println("Vous avez saisi nbr 2 => " + nbr2);
		
		System.out.println("La moyenne est de " + (nbr1 + nbr2)/2d);
		
		sc.close();
	
		
	//FIN PROG	
		
		
	}


}
