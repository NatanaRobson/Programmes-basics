package JeuDeLaFourchette;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//VARIABLES
		
		Scanner sc = new Scanner(System.in);
		int nbr;
		int guess;
		int min = 0;
		int max = 100;
		int test = 0;
		
		//PROG
		
		nbr = (int) (Math.random()*100);
		
	
		
		do {
			test = test + 1;
			
			System.out.print ( "Deviner le nbr entre " + min + " et " + max +  " choisi aleatoirement par le PC : ");
			guess = sc.nextInt();
			
			if (guess < nbr) {
				System.out.println("Mmmhhhh Et NON ahaha Reessaye encore!");
				min = (min+nbr)/2;
			}
			else {
				System.out.println("Mmmhhhh Et NON ahaha Reessaye encore!");
				max = (max+nbr)/2;
			}
		}
	
		while(guess != nbr);
		
		if (test > 5) {
			if (test > 10) {
				System.out.print("\n Je plaisante ... Mais t'abuse...trouver en " + test + " essais c'est bien misérable ");
			}
			else {
				System.out.print("Je plaisante ..." + test + " coups...? Ouai bof, peux mieux faire ...");
			}
		}	
		else {
			System.out.print("Je plaisante ... Bravo Champion, apres seulement" + test + " tests, Wiiii !!!");
		}
			
		sc.close();	
			
	
	}
}