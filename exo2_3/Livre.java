package co.simplon.exo2_3;

public class Livre{
	private static int id_livre;
	private static String titre;
	private static Auteur auteur;


	public Livre(Auteur auteur, int id_livre, String titre) {
		super();
		Livre.id_livre = id_livre;
		Livre.titre = titre;
		Livre.auteur = auteur;
	}
	

	public static int getId_livre() {
		return id_livre;
	}

	public static String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		Livre.titre = titre;
	}

	public static Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		Livre.auteur = auteur;
	}


	public String toString() {
		return (auteur.toString() + "\n" + "Titre (" + id_livre + "): " + titre);
	}
}
