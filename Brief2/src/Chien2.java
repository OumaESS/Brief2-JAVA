
public class Chien2 {

	String nom;
	void aboyer (String sens) {
		System.out.println(nom+ " "+sens);
	}
	
	void manger (String qlqs) {
		System.out.println( nom+ " "+qlqs);
	}
	
	
	public static void main(String[] args) {
		Chien2 Rex = new Chien2 ();
		Rex.nom= "Rex";
		Rex . aboyer ("[Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! - Je mange de la viande]");
		Rex. manger ("[Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! - Je mange de la viande]");
		
		Chien2 Max = new Chien2 ();
		Max.nom= "Max";
		Max . aboyer ("[Je ne suis pas du tout en colère. Iwiw !! awaw !! - Je mange du poisson]");
		Max . manger ("[Je ne suis pas du tout en colère. Iwiw !! awaw !! - Je mange du poisson]");
		
	}

}
