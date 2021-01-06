package co.simplon.exo2_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Adherent {
	private String nom;
	private String prenom;
	private LocalDate dateNaiss;
	private String mail;
	private String adresse;
	private List<Exemplaire> listeEmprunts = new ArrayList<> ();

    public static class AdherentBuilder {

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

        public Adherent build() {
            return new Adherent(this);
        }

    }

    private Adherent(AdherentBuilder builder) {
        nom = builder.nom;
        prenom = builder.prenom;
        dateNaiss = builder.dateNaiss;
        mail = builder.mail;
        adresse = builder.adresse;
        listeEmprunts = builder.listeEmprunts;
    }

	private Adherent() {
		super();
	}
	private Adherent(String nom, String prenom, LocalDate dateNaiss, String mail, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.mail = mail;
		this.adresse = adresse;
	}


	@Override
	public String toString() {
		return "Adherent:\n" +nom+" "+prenom+", Né(e) le: "+dateNaiss
				+"\n"+mail+"\n"+adresse+"\nExemplaires empruntés:\n"+listeEmprunts+"\n----------------------------------";
	}

	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void emprunter(Exemplaire emprunt, LocalDate datePret) {
		listeEmprunts.add(emprunt);
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
	public String getNom() {
		return nom;
	}
}
