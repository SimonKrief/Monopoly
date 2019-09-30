package fr.gtm.monopoly;

public class Joueur {
	private String nom;
	private Pion pion;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Pion getPion() {
		return pion;
	}

	public void setPion(Pion pion) {
		this.pion = pion;
	}
	
	public void jouer(De d1, De d2) {
		Case old = pion.getPosition();
		int r = d1.lancer() + d2.lancer();
		System.out.println(String.format("%s était sur la case %s, il obtient %d\n", old.getName(),r));
	}

	@Override
	public String toString() {
		return nom;
	}

}
