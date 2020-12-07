
public class Testpriv {

	public static void main(String[] args) {


		Private myObj = new Private();
	    myObj.setNom("Karimi Khalid");
	    
	    Private myObje = new Private();
	    myObje.setAdresse(" habite à Safi ");
	    
	    Private myObjec = new Private();
	    myObjec.setSolde( 14765.8 );
	    System.out.println(myObj.getNom() +  myObje.getAdresse()  +myObjec.getSolde());
	    
	    myObjec.retirer(15000);
		
	}

}
