package TabCartelABCM;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//VAR
		
		Scanner scs = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int indn = 0;	// indice position du nom
		int ind; 		// indice = (N° élément) - 1
		int ir; 		// indice de recherche
		int oc = 0;		// Nbr de répétition d'une valeur
		String nd;		// Nom du dealer
	
		
		// CREATION TABLEAUX AVEC INITIALISATION DONNEES
		
			//Noms
		
		String[] Noms = new String[3];
		
			Noms[0] = "Kev";
			Noms[1] = "Flo";
			Noms[2] = "Nat";
			
			// OU => String[] Noms = {"Kev", "Flo", "Nat"};
		
			//Postes
		
		String[] Postes = new String[3];
		
			//Codes dealer
		
		String[] Cd = new String[3];
		
		Cd[0] = "1";
		Cd[1] = "2";
		Cd[2] = "3";
		
		//PROG
		
		for(ind=0 ; ind < Noms.length ; ind++) {
			System.out.println("Code dealer : " + Cd[ind] + "| Nom : " + Noms[ind]);
		}
		
		ind=0;
		
		for(ind = 0 ; ind < Noms.length ; ind++) { 
		
			System.out.print("\n Saisir le poste conquis par " + Noms[ind] + " : ");
			String p = sc.next();
			
			System.out.println("\n" + Noms[ind] + " a ete promu au poste de " + p);
			
			Postes[ind] = p;
			
			System.out.print("\n En resume => L'indice " + ind + "* correspond au dealer " + Noms[ind] + "* promu au Poste : " + Postes[ind] + "\n");
		}
		System.out.println("\n EQUIPE ACTUELLE : \n");
		
		ind = 0;
		
		for(ind = 0 ; ind < Noms.length ; ind++) {
			System.out.println("=> " + Noms[ind] + " au poste de " + Postes[ind]);
		}
		
		System.out.print("\n Voulez-vous consulter les specialites ? : ");
		String rep = scs.next();
		
		if(rep.equals("oui")){
			
			System.out.print("\n Saisir le nom du dealer dont vous voulez connaitre la specialite : ");
			nd = sc.next();
			
			ind = 0;
			
			
			while(ind <= Noms.length && oc == 0) {
				if (Noms[ind].equals(nd)) {
					oc++;
				}
				else {
					ind++;
				}
			}
			if ( oc == 0) {
				System.out.print(nd + " ne fait pas parti des dealer...");
			}
			else {
				System.out.print("La specialite de " + nd + " => " + Postes[ind]);
			}	
		}
		else{
			System.out.print("MERCI D'AVOIR CHOISI NOS SERVICES, BISOUX");
		}
		
		
	}
		

}

