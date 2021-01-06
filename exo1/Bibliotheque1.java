package co.simplon.exo1;

import java.util.ArrayList;

public class Bibliotheque1 {
	private String nom;
	private String adresse;
	private ArrayList<Adherent1> listeAdherents = new ArrayList<>();

	public Bibliotheque1(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}

	

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public ArrayList<Adherent1> getListeAdherents() {
		return listeAdherents;
	}
	public void setListeAdherents(ArrayList<Adherent1> listeAdherents) {
		this.listeAdherents = listeAdherents;
	}



	@Override
	public String toString() {
		return "Bibliotheque: " + nom + ", adresse:" + adresse + "\n" + listeAdherents;
	}
	
	public void inscrire(Adherent1 nouvelAdh) {
		listeAdherents.add(nouvelAdh);
	}
	public void desinscrire(Adherent1 desinscrit) {
		listeAdherents.remove(desinscrit);
	}
}
