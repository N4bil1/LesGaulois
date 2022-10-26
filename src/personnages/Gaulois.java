package personnages;

public class Gaulois {
	
	//Attributs :
	
	private String nom;
	private int force;
	private int effetPotion=1;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
		
	//Constructeur :
	
	public Gaulois(String nom, int force) {
		assert force > 0;
		this.nom = nom;
		this.force = force;
	}
	
	//Getter sur nom :
	
	public String getNom() {
		return nom;
	}

	//Methode parler():
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\""+ texte + "\"");
	}
		
	//Methode prendreParole() :
	
//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	
	//Methode frapper() :
	
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la machoire de "+ romain.getNom());
//		romain.recevoirCoup((force / 3) * effetPotion);
//	}
	
	//Methode boirePotion
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	/////////////////////////////////TP3/////////////////////////////:::
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] tropheesgagnes = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; tropheesgagnes != null && i < tropheesgagnes.length; i++, nbTrophees++) {
			trophees[nbTrophees] = tropheesgagnes[i];
		}
	}


	///////////////////////////////////TP3////////////////////////////////////
	
	public void faireUneDonation(Musee musee) {
		if (trophees!=null) {
			int i=0;
			parler("Je donne au musee tous mes trophees :");
			while(trophees[i]!=null)
			{
				System.out.println("-" + trophees[i].getNom());
				musee.donnerTrophees(this, trophees[i]);
				trophees[i]=null;
				i++;
			}
		} else {
			System.out.println("Le gaulois" + nom + "n'a aucun trophee!");
		}
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Romain brutus = new Romain("Brutus",10);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		
		
//		System.out.println(asterix.getNom());
//		System.out.println(asterix);
		
		panoramix.preparerPotion();
		asterix.boirePotion(panoramix.getForcePotion());
		asterix.parler("Je suis prêt, j'arrive !");
		asterix.frapper(brutus);
	}	
}
