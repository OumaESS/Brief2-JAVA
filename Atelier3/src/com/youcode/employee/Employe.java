package com.youcode.employee;
import java.util.Calendar;

public class Employe {
	
	String nom;
	String prenom;
	String adress;
	int anneeNaissance;
	Calendar calendar = Calendar.getInstance();
	int anneeEncours=calendar.get(Calendar.YEAR);
	int age;

	

	public Employe(String nm, String pre, String adr, int annNai) {

		this.nom=nm;
		this.prenom=pre;
		this.adress=adr;
		this.anneeNaissance=annNai;
	}
	
	public int calculaterAge() {
		age=anneeEncours-anneeNaissance;
		return age;
	}

	public void afficherInfosClient() {
		System.out.println(nom+" n� le "+anneeNaissance+" habitant � "+adress+" age "+ calculaterAge());
	}
}
