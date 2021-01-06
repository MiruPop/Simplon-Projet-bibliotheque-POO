package co.simplon.exo2_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Adherent1 {
	String nom;
	String prenom;
	LocalDate dateNaiss;
	String mail;
	String adresse;
	List<Exemplaire> listeEmprunts = new ArrayList<> ();
	
	
	public Adherent1() {
		super();
	}
	
	public Adherent1(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Adherent1(String nom, String prenom, LocalDate dateNaiss) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
	}
	
	public Adherent1(String nom, String prenom, String mail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
	}

	public Adherent1(String nom, String prenom, LocalDate dateNaiss, String mail, String adresse,
			List<Exemplaire> listeEmprunts) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.mail = mail;
		this.adresse = adresse;
		this.listeEmprunts = listeEmprunts;
	}


	@Override
	public String toString() {
		return "Adherent:\n" + nom + "\n" + prenom + "\n" + dateNaiss + "\n" + mail + "\n" + adresse;
	}
	public String n_p_ddn() {
		return "Adherent:\n" + nom + "\n" + prenom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void emprunter(Exemplaire emprunt, LocalDate datePret) {
		listeEmprunts.add(emprunt);
	}
}
