package tp2;

import java.util.ArrayList;
import java.util.List;

public class Bureau {
	private int id;
	private int code;
	private String nom;
	private List<Chercheur> staff;
	private static int count;
	
	private static int MAX_STAFF = 5;

	public Bureau(int code, String nom) {
		super();
		this.id = ++count;
		this.code = code;
		this.nom = nom;
		this.staff = new ArrayList<Chercheur>();
	}

	public Bureau() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void addSearcher(Chercheur c) {
		if (Bureau.count <= MAX_STAFF) {
			this.staff.add(c);
			count++;
		} else {
			System.out.println("Vous avez atteint la limite");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Chercheur> getStaff() {
		return staff;
	}

	public void setStaff(List<Chercheur> staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return "Bureau [id=" + id + ", code=" + code + ", nom=" + nom + ", staff=" + staff + "]";
	}

	public void afficher() {
		System.out.println("code: " + code + " Nom: " + nom + " staff: " + staff);
	}
}
