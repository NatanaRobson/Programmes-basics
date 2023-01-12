package TESTING;

import java.util.Scanner;


public class App {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VARIABLES
		
		int indn = 0;
		int oc = 0;
		Scanner scs = new Scanner(System.in);
		
		// CREATION TABLEAU AVEC INITIALISATION DONNEES
		
/*		String[] Noms = new String[3];
		Noms[0] = "Kev";
		Noms[1] = "Flo";
		Noms[2] = "Nat";
*/
		String[] Noms = {"Kev","Flo", "Nat"};
		
		//PROG
		
		System.out.print("Nom du dealer recherche : ");
		String rch = scs.next();
		
		
		
		System.out.println("\n Vous avez demande a vous renseigner sur " + rch );
		
		
		 while(indn < Noms.length && oc == 0) {
			 
			 if(rch.equals(Noms[indn])) {
				 oc++;
			 }
			 else {
				 indn++;
			 }
		 
		}
		 
		if (oc != 0) {
			System.out.print(indn);
		}
		else {
			System.out.print("\n Votre dealer n'est pas repertorie...");
		}
		/*
		for(int i = 0; i < Noms.length;i++) {
			System.out.println("\n \n " + Noms[i]);
		}
		*/

		

	}

}
