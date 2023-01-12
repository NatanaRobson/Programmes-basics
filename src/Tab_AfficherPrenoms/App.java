package Tab_AfficherPrenoms;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// DECLARATION DU TAB
		
		String[]tabPrenom = new String[3];
		
		// ENTRER LES VALEUR
		
		tabPrenom[0] = "Le Liquidateur Kevin";
		tabPrenom[1] = "Le Testeur Florian";
		tabPrenom[2] = "Le Cerveau Natana";
		
		System.out.println("Les Patrons du cartel ABC.Meth sont : \n");
		
		for( int i=0 ; i <= tabPrenom.length - 1 ; i++) {
			System.out.println( tabPrenom[i]);
		}
	}

}
