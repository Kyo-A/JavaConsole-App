package tp2;

import java.util.ArrayList;
import java.util.List;

public class Laboratoire {

	private int id;
	
	private String nom;
	private String specialite;
	
	private Adresse adresse;
	private List<Bureau> bureaux;
	
	private static int count;
	
	private static int MAX_BUREAUX = 50;

	public Laboratoire(String nom, String specialite, Adresse adresse) {
		super();
		this.id = ++count;
		this.nom = nom;
		this.specialite = specialite;
		this.adresse = adresse;
		this.bureaux = new ArrayList<Bureau>();
	}

	public Laboratoire() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public List<Bureau> getBureaux() {
		return bureaux;
	}

	public void setBureaux(List<Bureau> bureaux) {
		this.bureaux = bureaux;
	}

	@Override
	public String toString() {
		return "Laboratoire [id=" + id + ", nom=" + nom + ", specialite=" + specialite + ", adresse=" + adresse
				+ ", bureaux=" + bureaux + "]";
	}

	public void afficher() {
		System.out.println("id: " + id + " Nom: " + nom + " specialite: " + specialite + " adresse: " + adresse
				+ " bureaux: " + bureaux);
	}
	
	public void addBureau(Bureau b) {
		if (Laboratoire.count <= MAX_BUREAUX) {
			this.bureaux.add(b);
			count++;
		} else {
			System.out.println("Vous avez atteint la limite");
		}
	}

}
