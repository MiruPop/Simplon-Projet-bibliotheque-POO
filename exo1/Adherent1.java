package co.simplon.exo1;

import java.time.LocalDate;

public class Adherent1 {
	private String nom;
	private String prenom;
	private LocalDate date;
	private String mail;
	private String adresse;
	
	public Adherent1() {
		super();
	}
	public Adherent1(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public Adherent1(String nom, String prenom, LocalDate date) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
	}
	public Adherent1(String nom, String prenom, String mail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
	}
	public Adherent1(String nom, String prenom, LocalDate date, String mail, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.mail = mail;
		this.adresse = adresse;
	}
	
	
	@Override
	public String toString() {
		return nom + " " + prenom + ", né(e) le " + date + ", " + mail + ", " + adresse + "\n";
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
