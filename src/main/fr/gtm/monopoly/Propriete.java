package fr.gtm.monopoly;

public abstract class Propriete extends Case{
	protected static String name;
	private static String couleur;
	private Joueur proprietaire;
	public Joueur getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Joueur proprietaire) {
		this.proprietaire = proprietaire;
	}

	int prix= 100;
	int loyer = 10;
	
	public Propriete(int prix, int loyer) {
		super(name,couleur);
		this.prix = prix;
		this.loyer = loyer;
	}

	@Override
	public void arreter(Joueur j) throws SoldeIllegalException {
		// TODO Auto-generated method stub
		Joueur.interesseParAchat(this, j);
		
	}

	@Override
	public void passer(Joueur j) throws SoldeIllegalException {
		// TODO Auto-generated method stub
		
	}

	

}
