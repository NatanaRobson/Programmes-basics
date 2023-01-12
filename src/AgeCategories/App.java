package AgeCategories;

//IMPORT OUTILS JAVA

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

	
	// VARIABLES
		
	double age;
	
	String nul = "pas né";
	String min = "vous êtes mineur";
	String maj = "vous êtes majeur";
	
	Scanner sc = new Scanner(System.in);
	
	
	
	// DEBUT PROG
	
	System.out.print("CLASSMNT PAR CAT D'ÂGES \n\n");
	System.out.print("Saisir votre âge : ");
	age = sc.nextDouble();
	
	if (age >= 0 && age < 18)  	System.out.println(min);
	
	if(age < 0)  				System.out.println(nul);
	
	if(age >= 18)  				System.out.println(maj);
		
	
		
	// FIN PROG
		
	sc.close();
	
	
	
	
		
	
	}

}
