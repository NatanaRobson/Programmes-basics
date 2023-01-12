package NbrPrimierWHILE;

import java.util.Scanner;

public class NbrPrimierWHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//DECLARATION DES VARIABLES
		
		int i = 2;
		int n;
		int oc = 0;
		Scanner sc = new Scanner(System.in);
		
		//PROG
		
		System.out.print("Le nombre est-il premier ou compose ? \n \n Saisir le nombre n : ");
		n = sc.nextInt();
		
		while (i < n && oc == 0) { // CONDITION : Tant que i n'a pas atteint n ET QUE aucun diviseur n'ait été trouvé
			if(n%i == 0) { // Si n est divisible par i
				oc = oc + 1; // On augmente l'occurence de 1
			}
			i = i + 1; // i est incrémenté de 1
		}
		
		if (oc != 0) { // Si on a trouvé au moins un diviseur
			System.out.print(" \n Nbr compose");
		}
		else { // Si aucun diviseur n'a été trouvé
			System.out.print("\n Nbr 1er");
		}
	}
		
}
