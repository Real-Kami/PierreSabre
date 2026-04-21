package personnages;

import personnages.*;

public class Yakuza extends Humain {

	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, int argent, String boisson_favorite, String clan, int reputation) {
		super(nom, argent, boisson_favorite);
		this.clan = clan;
		this.reputation = reputation;
	}

	public void extorquer(Commercant victime) {
		int buffer =  victime.seFaireExtorquer();
		this.setArgent(this.getArgent() + buffer);
	}
	
	public int perdre() {
		int buffer = this.getArgent();
		this.setArgent(0);
		this.reputation -= 1;
		this.parler("Oh non, j'ai perdu le combat et tout mon argent...");
		return buffer;
	}
	
	public void gagner(int gain) {
		this.setArgent(this.getArgent() + gain);
		this.reputation += 1;
		this.parler("Haha, j'ai gagné le combat !");
	}
	
	public int getReputation() {
		return reputation;
	}
	
}
