package annee_bisextil_ou_pas;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//VAR
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		//PROG
		
		System.out.print("Saisir annee : ");
		a = sc.nextInt();
	
		
		if(a%4 == 0) {
			if(a%100==0 && a%400!=0) {
				System.out.println("Annee non bissextile!");
			}
			else { 
				System.out.println("Annee bissextile!");
			}
		}
		
		else {
			System.out.println("Annee non bissextile!");
		}
		
		sc.close();
	}
}
	


