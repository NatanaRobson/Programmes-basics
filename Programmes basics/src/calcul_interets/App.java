package calcul_interets;

// IMPORT SCANNER :
	import java.util.Scanner;
	
public class App {

	public static void main(String[] args) {

		//VARIABLES :
			
			double somme;
			double taux;
			double annee;
			double TS;
			double TC;
			double TCa;
			double TSa;
			Scanner sc = new Scanner(System.in);
			
		//DEBUT PROGRAMME
		
			System.out.println("CALCUL DE LA VALEUR ACQUISE :");
		
			System.out.println("");
			
			System.out.println("Saisir le taux en %:");
			taux = sc.nextDouble()/100;
				
			System.out.println("Saisir le nombre d'années :");
			annee = sc.nextDouble();
				
			System.out.println("Saisir la somme placee :");
			somme = sc.nextDouble();
				
			TS = somme * (1 + annee * taux);
			TC = somme * Math.pow((1 + taux), annee);
			TCa = Math.round(TC * 100.00)/100.00;
			TSa = Math.round(TS * 100.00)/100.00;
			
			System.out.println("La valeur acquise :");
			System.out.println("		interêt simple	 =>  " + TSa + " €");
			System.out.println("		interêt composé	 =>  " + TCa + " €");
			
		//FIN DE PROGRAMME
			
			sc.close();
			
	}

}
