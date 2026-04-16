package histoire;

import personnages.*;

public class HistoireTP4 {

	public static void main(String[] args) {
		
		Humain michel = new Humain("Michel", 10, "ice tea");
		
		michel.direBonjour();
		michel.acheter("ice tea", 5);
		michel.boire();
		michel.acheter("missile inter continental", 100);
		
		
	}
	
}
