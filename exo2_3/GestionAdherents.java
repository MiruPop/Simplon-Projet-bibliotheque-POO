package co.simplon.exo2_3;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import co.simplon.exo1.Bibliotheque1;

public class GestionAdherents {

	public static void main(String[] args) {
		
		LocalDate  maDate = LocalDate.of(1997, Month.NOVEMBER, 1);

//************************************************************************************************
		//instancier un adérent avec les différents types de constructeurs définis dans Adherent1
//************************************************************************************************
		
//      Adherent1 lolo = new Adherent1("TRUC", "Lolo");
//      Adherent1 lili = new Adherent1("DUPONT", "Lili",maDate);
//      Adherent1 leon = new Adherent1("THOMAS", "Léon","leon@gmail.com");
        
//***********************************************
        //instancier l'adhérent avec Java Beans
//***********************************************
		
//        AdherentJavaBeans mimi = new AdherentJavaBeans();
//        mimi.setNom("Dupont");
//        mimi.setPrenom("Mimi");
//        mimi.setDateNaiss(LocalDate.of(2002, Month.JANUARY, 12));
//        mimi.setAdresse("1, av. des Champs-Elysées, 75008 Paris");
//        mimi.setMail("mimi@laposte.fr");

//        System.out.println(mimi);

//****************************************************
        //instancier l'adhérent avec Builder externe
//****************************************************
		
//        Adherent1 toto = new AdherentBuilder()
//        		.ajouterNom("DUPONT")
//        		.ajouterPrenom("Toto")
//        		.ajouterDateNaiss(maDate)
//        		.ajouterMail("toto@gmail.com")
//        		.ajouterAdresse("1 rue Etroite, 93200 St-Denis")
//        		.build();
//        System.out.println(toto);

//******************************************************************************
        //instancier l'adhérent avec le Builder interne static
//******************************************************************************
        
        Adherent toto = new Adherent.AdherentBuilder()
                .ajouterNom("DUPONT")
                .ajouterPrenom("Toto")
                .ajouterDateNaiss(maDate)
                .ajouterMail("toto@gmail.com")
                .ajouterAdresse("1 rue Etroite, 93200 St-Denis")
                .build();
        Adherent lolo = new Adherent.AdherentBuilder()
                .ajouterNom("MOMO")
                .ajouterPrenom("Lolo")
                .ajouterDateNaiss(maDate)
                .ajouterMail("lolo@gmail.com")
                .ajouterAdresse("12 rue Longue, 75020 Paris")
                .build();
//        System.out.println(lolo);
        
//*************************************************************************************
        //instancier un auteur, un livre contenant cet auteur et un exemplaire du livre
//*************************************************************************************
        
        Auteur auteur = new Auteur(1, "ASIMOV", "Isaac");
        Livre livre1 = new Livre(auteur, 1, "Fondation");
        Exemplaire exem1 = new Exemplaire(livre1, "Hachette", "2005");
        

//*******************************************
        //tester la méthode "emprunter"
//*******************************************
        toto.emprunter(exem1, LocalDate.now());
        System.out.println(toto);

//******************************************************
        //instancier une nouvelle Bibliotheque
//******************************************************
        Bibliotheque biblioKids = new Bibliotheque("Centrale", "1 rue Machin, 93200 ST-DENIS");

//*****************************************************************************************
        //inscrire 2 nouveaux adhérents dans la nouvelle Bibliotheque, puis désinscrire 1
//*****************************************************************************************
        biblioKids.inscrire(toto);
        biblioKids.inscrire(lolo);
        System.out.println(biblioKids);
        biblioKids.desinscrire(lolo);
        System.out.println(biblioKids);
	}
}
