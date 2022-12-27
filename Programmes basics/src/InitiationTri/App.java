package InitiationTri;

	//IMPORT OUTIL JAVA
	import java.util.Scanner;

public class App {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//VARIABLES
		
	int a;
	int b;
	
	Scanner sc = new Scanner(System.in);
	
	//DEBUT PROG
	
	System.out.println("TRI INITIAL");
	
	System.out.print("Saisir a : ");
	a = sc.nextInt();
	
	System.out.print("Saisir b : ");
	b = sc.nextInt();
	
	if (a < b) System.out.println("Tri croissant => " + a + " : " + b);
	else System.out.println("Tri croissant => " + b + " : " + a);
	
	sc.close();
	
	}

}
