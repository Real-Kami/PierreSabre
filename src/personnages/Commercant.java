package personnages;

import personnages.*;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
		// TODO Auto-generated constructor stub
	}
	
	public int seFaireExtorquer() {
		int buffer = this.getArgent();
		this.setArgent(0);
		this.parler("Oh non, je me suis fait prendre mon argent");
		return buffer;
	}
	
	public void recevoirArgent(int somme) {
		this.setArgent(this.getArgent() + somme);
		this.parler("J'ai reçu " + somme + " pièces ! Merci beaucoup !");
	}
	
}
