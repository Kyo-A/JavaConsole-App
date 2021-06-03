package main;

import java.util.ArrayList;
import java.util.List;

import tp1.Etudiant;
import tp1.Filiere;
import tp2.Adresse;
import tp2.Bureau;
import tp2.Chercheur;
import tp2.Laboratoire;

public class App {

	public static void main(String[] args) {

		Filiere[] filieres = new Filiere[3];
		filieres[0] = new Filiere("Info 2", "Informatique");
		filieres[1] = new Filiere("TIC", "Techno de l'info et de communication");
		filieres[2] = new Filiere("GC", "Genie Civil");

		Etudiant[] etudiants = new Etudiant[5];
		etudiants[0] = new Etudiant("Jean", "Pat", "12-12-1986", filieres[1]);
		etudiants[1] = new Etudiant("Jul", "Dre", "11-08-1994", filieres[2]);
		etudiants[2] = new Etudiant("Dom", "minique", "13-03-1997", filieres[0]);
		etudiants[3] = new Etudiant("Pat", "Pot", "05-11-1984", filieres[2]);
		etudiants[4] = new Etudiant("Aya", "YAr", "23-06-1983", filieres[1]);

//		Fondamentalement, == compare si deux objets ont la même référence, donc à moins que 
//		deux références ne soient liées au même objet, cette comparaison sera fausse.

//      equals() est une méthode héritée de la classe Object. Cette méthode par défaut compare si deux 
//		objets ont la même référence

		for (Filiere filiere : filieres) {
			System.out.println(filiere);
			for (Etudiant etudiant : etudiants) {
				if (etudiant.getFiliere().getId().equals(filiere.getId())) {
					System.out.println(etudiant);
				}
			}
		}

		System.out.println("-------------------------Appel static Methodes------------------------------------");

		getStudentByFiliere(filieres, etudiants);
		
		System.out.println("-------------------------EXO TP POO------------------------------------");

		Adresse adr = new Adresse("Rue Massena", "Nice", 2000);
		adr.afficher();
		adr.modifier(1987);
		adr.afficher();
		Adresse adr2 = new Adresse("Place de la liberte", "Toulon", 1500);

		adr2.afficher();
		adr2.modifier(10100);
		adr2.afficher();
		Chercheur C = new Chercheur("Francis", "Developpeur", 121651);
		C.afficher();
		Chercheur C2 = new Chercheur("Julien", "Integrateur", 15);
		System.out.println(C2);
		System.out.println("Nombre de chercheurs = " + C.nbrPersonnes);
		Boolean tes = C.comparer(C2);
		if (tes == true)
			System.out.println("les deux chercheurs sont identiques");
		else
			System.out.println("les deux chercheurs sont DIFFERENTS");
		
		C2.modifier(54651654);
		C.modifier(777777);
		Chercheur C3 = new Chercheur("Jean", "techlead", 55555);
		C3.ajouter("Jean", "techlead", 55555);
		C3.afficher();

		
		Bureau B1 = new Bureau(111, "bur1");
		
		B1.addSearcher(C);
		B1.addSearcher(C2);
		B1.addSearcher(C3);
		B1.addSearcher(new Chercheur("Jean", "techlead", 55555));
		B1.addSearcher(new Chercheur("Jean", "techlead", 55555));
			
		System.out.println("Nombre de chercheurs = " + Chercheur.nbrPersonnes);

		Bureau B2 = new Bureau(111, "bur1");

		List<Bureau> bureaux = new ArrayList<>();
		bureaux.add(B1);

		bureaux.add(B2);
		Laboratoire L = new Laboratoire("lab1", "spce1", adr);
		L.addBureau(B1);
		System.out.println("------------------------------------------------");
		L.afficher();
		System.out.println(L);

	}

	public static void getStudentByFiliere(Filiere[] filieres, Etudiant[] etudiants) {

		for (Filiere filiere : filieres) {
			System.out.println(filiere);
			for (Etudiant etudiant : etudiants) {
				if (etudiant.getFiliere().getId() == filiere.getId()) {
					System.out.println(etudiant);
				}
			}
		}
	}

}
