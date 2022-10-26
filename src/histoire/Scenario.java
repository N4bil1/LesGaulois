package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;
import personnages.Equipement;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois obelix = new Gaulois("Obelix",15);
		Romain minus = new Romain("Minus",6);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Belenos, ce n'est pas juste!");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		int forceAvant;
		do {
			forceAvant = minus.getForce();
			asterix.frapper(minus);
		}
		while (minus.getForce()>0 && forceAvant>minus.getForce());
	}
}
