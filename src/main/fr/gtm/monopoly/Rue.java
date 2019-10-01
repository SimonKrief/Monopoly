package fr.gtm.monopoly;

public class Rue extends Propriete{

	private static int prix=100;
	private static int loyer=10;

	public Rue(String string) {		
		super(prix,loyer);
		name = string;

		// TODO Auto-generated constructor stub
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
