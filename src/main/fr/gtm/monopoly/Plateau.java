package fr.gtm.monopoly;

public class Plateau {
	private Case[] cases = new Case[40];
	
	public Plateau() {
		buildCases();
	}
	
	private void buildCases() {
		for(int i=0 ; i<cases.length ; i++) {
			cases[i] = new DefaultCase("Case "+i);
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
