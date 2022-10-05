package personnages;

public class Gaulois {
	
	//Constructeur :
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	//Attributs :
	
	private String nom;
	private int force;
	private int effetPotion=1;
	
	//Getter sur nom :
	
	public String getNom() {
		return nom;
	}

	//M�thode parler():
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
		
	//M�thode prendreParole() :
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
		
	//M�thode frapper() :
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de "
			+ romain.getNom());
		romain.recevoirCoup(force / 3);
	}

//	@Override
//	public String toString() {
//		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
//	}
	
	public static void main(String[] args) {
		//TODO cr�er un main permettant de tester la classe Gaulois
		Gaulois asterix = new Gaulois(nom = "Ast�rix", force=8);
		System.out.println(asterix);
	}	
}
