package personnages;

public class Humain {

	private String nom;
	private int argent;
	private String boisson_favorite;
	
	public Humain(String nom, int argent, String boisson_favorite) {
		this.nom = nom;
		this.argent = argent;
		this.boisson_favorite = boisson_favorite;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getBoisson_favorite() {
		return boisson_favorite;
	}
	
	public String getNom() {
		return nom;
	}
	
	private String prendreParole() {
		return "\"" + this.getNom() + "\" : "; 
	}
	
	public void parler(String phrase) {
		System.out.println(this.prendreParole() + phrase);
	}
	
	public void direBonjour() {
		this.parler("Bonjour, je suis " + this.getNom() + " et j'aime boire du " + this.getBoisson_favorite() + ".");
	}
	
	public void boire() {
		this.parler("Ah, ça fait du bien de boire du " + this.getBoisson_favorite() + ".");
	}
	
	public void acheter(String bien, int prix) {
		if (this.argent > prix) {
			this.parler("J'ai " + this.getArgent() + " pièces, je vais m'acheter " + bien + ".");
		} else {
			this.parler("Je ne peux pas m'acheter " + bien + ", je n'ai que " + this.getArgent() + " pièces...");
		}
	}

	private void perdreArgent(int perte) {
		this.parler("J'ai perdu " + perte + " pièces.");
		this.argent -= perte;
	}
	
	private void gagnerArgent(int gain) {
		this.parler("J'ai gagné " + gain + " pièces.");
		this.argent += gain;
	}
	
}
