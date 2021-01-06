package co.simplon.exo2_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class AdherentBuilder {
	private String nom;
	private String prenom;
	private LocalDate dateNaiss;
	private String mail;
	private String adresse;
	private List<Exemplaire> listeEmprunts = new ArrayList<> ();

	public AdherentBuilder ajouterNom(String nom) {
		this.nom = nom;
		return this;
	}

	public AdherentBuilder ajouterPrenom(String prenom) {
		this.prenom = prenom;
		return this;
	}

	public AdherentBuilder ajouterDateNaiss(LocalDate dateNaiss) {
		this.dateNaiss = dateNaiss;
		return this;
	}
	public AdherentBuilder ajouterMail(String mail) {
		this.mail = mail;
		return this;
	}
	public AdherentBuilder ajouterAdresse(String adresse) {
		this.adresse = adresse;
		return this;
	}
	public AdherentBuilder ajouterListeEmprunts(List<Exemplaire> listeEmprunts) {
		this.listeEmprunts = listeEmprunts;
		return this;
	}

	public Adherent1 build() {
		return new Adherent1(nom, prenom, dateNaiss, mail, adresse, listeEmprunts);
	}
}
