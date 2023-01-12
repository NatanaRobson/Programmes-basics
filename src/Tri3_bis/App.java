package Tri3_bis;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VAR
		
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
	
		//PROG
		
		System.out.print("TRI DE 3 NBR \n \n Saisir a :");
		a = sc.nextInt();
		
		System.out.print("\n Saisir b :");
		b = sc.nextInt();
		
		System.out.print("\n Saisir c :");
		c = sc.nextInt();
		
		if (a < b) {
			if (a < c) {
				if (b < c) {
					System.out.print("\n" + a + " < " + b + " < " + c);				
				}
				else { 
					System.out.print("\n" + a + " < " + c + " < " + b);
				}
			}
			else { 
				System.out.print("\n" + c + " < " + a + " < " + b);
			}
		}
		else {
			if (c < a) {
				if (b < c) {
					System.out.print("\n" + b + " < " + c + " < " + a);				
				}
				else { 
					System.out.print("\n" + c + " < " + b + " < " + a);
				}
			}
			else { 
				System.out.print("\n" + b + " < " + a + " < " + c);
			}
		}
			
		
		sc.close();
		
	
		
		
	}

}
