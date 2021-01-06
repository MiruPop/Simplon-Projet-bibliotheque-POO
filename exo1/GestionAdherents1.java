package co.simplon.exo1;

import java.time.LocalDate;
import java.time.Month;

public class GestionAdherents1 {

	public static void main(String[] args) {
		
		
		LocalDate  maDate = LocalDate.of(1997, Month.NOVEMBER, 1);
		
        Adherent1 lolo = new Adherent1("MACHIN", "Lolo", maDate, "lolo@lol.fr", "adresse de Lolo");
        Adherent1 toto = new Adherent1("TRUC", "Toto", maDate, "toto@lol.fr", "adresse de Toto");
        Adherent1 lili = new Adherent1("BIDULE", "Lili", maDate, "lili@lol.fr", "adresse de Lili");
        Adherent1 coucou = new Adherent1("DUPONT", "Coucou", maDate, "coucou@lol.fr", "adresse de Coucou");
//lolo fait référence à toto:     
        lolo = toto;
        
        System.out.println(lolo);
        lolo.setNom("DUPONT");
        System.out.println(lolo);

//pour valeurs égales de toto et lolo:
        System.out.println(toto==lolo);
        // "==" est à utiliser sur des valeurs numériques (int) 
        	
//tester la classe Adherent
        System.out.println(lolo);
        toto.setNom("DUPONT");
        System.out.println(lolo);
		
        Bibliotheque1 biblioKids = new Bibliotheque1("Centrale", "1 rue Machin, 93200 ST-DENIS");
//tester les méthodes "inscrire" et "desinscrire"
        biblioKids.inscrire(toto);
        biblioKids.inscrire(lolo);
        biblioKids.inscrire(lili);
        biblioKids.inscrire(coucou);
        
        System.out.println(biblioKids);
        
        
        biblioKids.desinscrire(toto);
        
        System.out.println("\n\n\n" + biblioKids);
        //affichage sous forme de tableau encadré par [], avec les éléments séparés par une virgule
	}
}
