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
	
}
