package histoire;

import personnages.*;

public class HistoireTP4 {

	public static void main(String[] args) {
		
//		Humain michel = new Humain("Michel", 10, "ice tea");
//		
//		michel.direBonjour();
//		michel.acheter("ice tea", 5);
//		michel.boire();
//		michel.acheter("voiture", 100);
		
		Commercant marco = new Commercant("Marco", 15);
//		
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoirArgent(15);
//		marco.boire();
		
		Yakuza yaku = new Yakuza("Yaku le Noir", 30, "whisky", "Warsong", 4);
		
//		yaku.direBonjour();
//		yaku.parler("Je vais aller voler ce marchand sans défenses...");
//		yaku.parler(marco.getNom() + ", la bourse ou la vie !");
//		yaku.extorquer(marco);
//		yaku.parler("J'ai maintenant " + yaku.getArgent() + " pièces...");
		
		Ronin roro = new Ronin("Roro", 60, "shochu");
		
//		roro.direBonjour();
//		roro.parler("Tiens Marco, prends donc une part de mon argent...");
//		roro.donner(marco);
		
		roro.parler("viens te battre " + yaku.getNom() + " !");
		
		roro.provoquer(yaku);
		
		
	}
	
}
