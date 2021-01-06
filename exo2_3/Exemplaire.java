package co.simplon.exo2_3;

public class Exemplaire extends Livre{
	private String editeur;
	private String anneeEd;


	
	public Exemplaire(Auteur auteur, int id_livre, String titre, String editeur, String anneeEd) {
		super(auteur, id_livre, titre);
		this.editeur = editeur;
		this.anneeEd = anneeEd;
	}


	public Exemplaire(Livre livre, String editeur, String anneeEd) {
		super(getAuteur(), getId_livre(), getTitre());
		this.editeur = editeur;
		this.anneeEd = anneeEd;
	}


	public String getEditeur() {
		return editeur;
	}


	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}


	public String getAnneeEd() {
		return anneeEd;
	}


	public void setAnneeEd(String anneeEd) {
		this.anneeEd = anneeEd;
	}
	
	public String toString() {
		return (super.toString() + "\n" + editeur + ", " + anneeEd);
	}
}