package Tri3;

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
	
	System.out.print("\n Saisir a : ");
	a = sc.nextInt();
	
	System.out.print("\n Saisir b : ");
	b = sc.nextInt();
	
	System.out.print("\n Saisir c : ");
	c = sc.nextInt();
	
	if (a > b && b > c)
		System.out.println(a + " > " + b + " > " + c);
	
	if (b > c && c > a)
		System.out.println(b + " > " + c + " > " + a);
	
	if (a > c && c > b)
		System.out.println( a + " > " + c + " > " + b);
	
	if (c > a && a > b)
		System.out.println( c + " > " + a + " > " + b);
	
	if (c > b && b > a)
		System.out.println( c + " > " + b + " > " + a);
	
	if (b > a && a > c)
		System.out.println( b + " > " + a + " > " + c);
	
	if (a == b ||  c == b || a == c) {
		
		System.out.println("\n J'ai la flemme de donner une reponse mais bref");
		
		if (a < b && c < b)
			System.out.print("a ou c =>" + a + " < " + b);
		
	}
		
	

	
	
	sc.close();
	
	
	}

}
