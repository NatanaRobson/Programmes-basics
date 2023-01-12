package NbrPremiers;

import java.util.Scanner;

public class App {
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//DECLARATION DES VARIABLES
		
		int n;
		int oc = 0;
		Scanner sc = new Scanner(System.in);
		
		//PROG
		
		System.out.print("Le nombre est-il premier ou compose ? \n \n Saisir le nombre n : ");
		n = sc.nextInt();
		
		for( int i = 2 ; i < n ; i++ ){
			if(n%i == 0) {
				oc = oc + 1;
			}
		}
		
		if ( oc != 0) {
			System.out.print(" \n Nbr compose");
		}
		else {
			System.out.print("\n Nbr 1er");
		}
	}
		
}
		
		