package fr.gtm.monopoly;

import java.util.ArrayList;
import java.util.List;

public class Monopoly {
	private Plateau plateau = new Plateau();
	private De[] des = new De[2];
	private List<Joueur> joueurs = new ArrayList<>();
	private Joueur vainqueur = null;
	
	public void addJoueur(Joueur j,Pion p) {
		if(joueurs.size()==8) {
			System.out.println("Il y a déjà 8 joueurs");
			return;
		}
		p.setJoueur(j);
		j.setPion(p);
		p.setPosition(plateau.getCaseDepart());
		joueurs.add(j);
	}
	public void jouer() {
		
	}
	public Joueur getVainqueur() {
		return vainqueur;
	}
	

}
