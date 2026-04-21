package personnages;

import personnages.*;

public class Ronin extends Humain{

	private int honneur = 1;

	public Ronin(String nom, int argent, String boisson_favorite) {
		super(nom, argent, boisson_favorite);
		this.honneur = 1;
	}
	
	public void donner(Commercant beneficiaire) {
		int argent = this.getArgent();
		int part = argent / 10;
		this.setArgent(this.getArgent() - part);
		beneficiaire.recevoirArgent(part);
	}	
	
	public void provoquer(Yakuza adversaire) {
		int force = this.honneur * 2;
		int force_ennemie = adversaire.getReputation();
		if (force >= force_ennemie) {
			int buffer = adversaire.perdre();
			this.setArgent(this.getArgent() + buffer);
			this.parler("J'ai gagné, tu l'as bien mérité !");
			this.honneur += 1;
		} else {
			adversaire.gagner(this.getArgent());
			this.parler("J'ai perdu, j'y ai laissé mon honneur...");
			this.honneur -= 1;
		}
	}
	
}
