package co.simplon.exo2_3;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
	private String nom;
	private String adresse;
	private List<Adherent> listeAdherents = new ArrayList<>();
	
	public Bibliotheque(String nom, String adresse) {
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
	public List<Adherent> getListeAdherents() {
		return listeAdherents;
	}
	public void setListeAdherents(List<Adherent> listeAdherents) {
		this.listeAdherents = listeAdherents;
	}


//	@Override
//	public String toString() {
//		return "Bibliotheque: " + nom + ", adresse:" + adresse + "\n" + listeAdherents;
//	}
	
//	ou (autre façon, en parcourant la liste objet par objet)
	@Override
	public String toString() {
	String str = "";
    str += "BIBLIOTHEQUE : " + this.getNom() + " - " + this.getAdresse() + "\n----------------------------------\n";
    str += "LISTE DES ADHERENTS : \n----------------------------------\n";
    
    for(Adherent adh : this.listeAdherents)
        str += adh.toString() + "\n";
    
    return str;
	}
	
	public void inscrire(Adherent nouvelAdh) {
		listeAdherents.add(nouvelAdh);
	}
	public void desinscrire(Adherent desinscrit) {
		listeAdherents.remove(desinscrit);
	}
}