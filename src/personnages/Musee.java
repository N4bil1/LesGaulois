package personnages;

public class Musee {
	
	private int nbTrophee=0;
	private Equipement[] trophee = new Equipement[200];

	public void donnerTrophees(Gaulois gaulois,Equipement equipement) {
		trophee[nbTrophee]= equipement;
	}
	
}
