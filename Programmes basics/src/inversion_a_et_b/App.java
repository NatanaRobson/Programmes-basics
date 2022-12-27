package inversion_a_et_b;

//IMPORT SCANNER
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	//DEBUT PROG
		
		//VARIABLE
		
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		
		//DEBUT DU PROG :
		
		System.out.println("saisir a :");
		a = sc.nextInt();
	
		
		System.out.println("saisir b :");
		b = sc.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println( "a =" + a + "  <=>  b =" + b);
		
	
	//FIN PROG
		
		sc.close();
		
	
	
		
	}

}
