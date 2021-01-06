package co.simplon.exo2_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AdherentJavaBeans {
	String nom;
	String prenom;
	LocalDate dateNaiss;
	String mail;
	String adresse;
	List<Exemplaire> listeEmprunts = new ArrayList<> ();
	public AdherentJavaBeans() {
		super();
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDateNaiss() {
		return dateNaiss;
	}
	public void setDateNaiss(LocalDate dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public List<Exemplaire> getListeEmprunts() {
		return listeEmprunts;
	}
	public void setListeEmprunts(List<Exemplaire> listeEmprunts) {
		this.listeEmprunts = listeEmprunts;
	}
	
	@Override
	public String toString() {
		return "Adherent:\n" + this.getNom() + " " + this.getPrenom() + "\nNé(e) le: " + this.getDateNaiss() + "\n" + this.getMail() + "\n" + this.getAdresse();
	}
}
