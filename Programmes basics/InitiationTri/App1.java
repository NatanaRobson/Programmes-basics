package InitiationTri;

	// IMPORT JAVA UTIL
	import java.util.Scanner;
	

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	// AFFICHE NOM PROG
	
	System.out.println("|| Tri de 3 nbr ordre croissant ||");
		
	// VARIABLES
		
	int a;
	int b;
	int c;
	Scanner sc = new Scanner(System.in);
	
	// DEBUT PROG
	
	System.out.print("\n Saisir a : "); a = sc.nextInt();
	
	System.out.print("\n Saisir b : "); b = sc.nextInt();
	
	System.out.print("\n Saisir c : "); c = sc.nextInt();
	
	if (a > b && b > c) System.out.println(a + " : " + b + " : " + c);
	
	else if (b > c && c > a) System.out.println(b + " : " + a + " : " + c);
	
	else System.out.println("\n Nbr ordre croissant => " + c + " : " + a + " : " + b);

	
	
	
	
	sc.close();
	
	
	}

}
