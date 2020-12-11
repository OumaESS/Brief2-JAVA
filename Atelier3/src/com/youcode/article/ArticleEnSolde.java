package com.youcode.article;


	
public class ArticleEnSolde extends Article{
		
		String nom;
		double prix;
		
		public ArticleEnSolde(String n, double prx) {
			super (n, prx);
			this.nom= n;
			this.prix= prx;
		}
		
		public double prixApreRemise(int PourcantageRemise) {
	        double MontantRemise=getPrix()*PourcantageRemise/100;
	        double prixApresRemise=getPrix()-MontantRemise;
	        return prixApresRemise;
	    }
		public void afficher() {
	        System.out.println("le prix Aprés remise "+prixApreRemise(2)+" DH");
	    }
}
