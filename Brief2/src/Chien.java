
public class Chien {

	String nom;
	void aboyer () {
		System.out.println(nom+ " dit wwaaaarf. Je mange de la viande");
	}
	
	void manger () {
		System.out.println(nom+ " dit wwaaaarf. Je mange de la viande");
	}
	
	public static void main(String[] args) {
	
		
		Chien Rex = new Chien ();
		Rex.nom= "Rex";
		Rex . aboyer ();
		Rex. manger ();
		
		Chien Max = new Chien ();
		Max.nom= "Max";
		Max . aboyer ();
		Max . manger ();
	}

}
