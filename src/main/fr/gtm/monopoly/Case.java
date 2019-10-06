package fr.gtm.monopoly;

public abstract class Case {
	protected String name;
	protected String couleur;
	private Case next;
	
	public Case(String name2, String couleur2) {
		this.name = name2;
		this.couleur = couleur2;
	}
	
	
	public Case(String name) {
		this.name = name;
	}

//	public Case(String name, String couleur) {
//		this.name = name;
//		this.couleur = couleur;
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Case getNext() {
		return next;
	}
	public void setNext(Case next) {
		this.next = next;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public abstract void arreter(Joueur j) throws SoldeIllegalException;
	
	public abstract void passer(Joueur j) throws SoldeIllegalException;

}
