
public class Account {

	String nom;
	String adresse;
	double solde;
	
	void afficher () {
		System.out.println(nom+ " habite à " +adresse+" infos solde" +solde+ " DH taux d'intérét: " +calculerInterer(7) );
	}
	
	public  double  calculerInterer(double tauxInteret) {

        double SoldInteret=solde*tauxInteret/100;
        return SoldInteret;

    }

	
	public static void main(String[] args) {

		Account Client1= new Account ();
		Client1.nom= "Khalid Hassan";
		Client1.adresse= "Safi";
		Client1.solde= 14765.8;
		Client1.afficher();
		
		Account Client2= new Account ();
		Client2.nom= "Karimi Khalid ";
		Client2.adresse= "Casablanca";
		Client2.solde= 7654.0;
		Client2.afficher();
		
		
		
	}

}
