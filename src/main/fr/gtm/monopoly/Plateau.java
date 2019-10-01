package fr.gtm.monopoly;

public class Plateau {
	private Case[] cases = new Case[40];
	
	public Plateau() {
		buildCases();
	}
	
	private void buildCases() {
		for(int i=0 ; i<cases.length ; i++) {
			switch (i) {
			case 0: 
				cases[i] = new Depart("depart "+i);
				break;
			case 4:
				cases[i] = new Impots("impots "+i);
				break;
			case 38:
				cases[i] = new TaxeDeLuxe("taxesDeLuxe "+i);
				break;
			default:
				cases[i] = new Rue("Case "+i);
				break;
			}		
		}
		for(int i=0 ; i<cases.length-1 ; i++) {
			cases[i].setNext(cases[i+1]);
		}
		cases[cases.length-1].setNext(cases[0]);
	}

	public Case getCaseDepart() {
		return cases[0];
	}
}
