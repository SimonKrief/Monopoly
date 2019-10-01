package fr.gtm.monopoly;

public class Impots extends Case{
//	public Impots() {
//		
//	}

	public Impots(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	@Override
	public void passer(Joueur j) {
		// TODO Auto-generated method stub
		//j.crediter(200);
		
		
	}

	@Override
	public void arreter(Joueur j) throws SoldeIllegalException {
		System.out.println(j.getNom()+" s'arrete sur la caseimpots");
		if (j.getSolde()*0.1<=500) {
			j.debiter((int) (j.getSolde()*0.1));
		} else {
			j.debiter(500);
		}

		
	}

}
