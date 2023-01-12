package SearchDiviseurs;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VAR
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		// PROG
		
		System.out.print("Saisir un nbr : ");
		a = sc.nextInt();
		
		// boucle FOR
		
		for(int i = 1 ; i <= a ; i++) {
			if(a%i == 0 && i != 1 && i != a) {
				System.out.print( i + " : ");
			}
		}
	
	sc.close();	
		
	}

}
