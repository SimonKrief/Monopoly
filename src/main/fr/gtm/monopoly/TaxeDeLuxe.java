package fr.gtm.monopoly;

public class TaxeDeLuxe extends Case{
	
	public TaxeDeLuxe(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	
//	public TaxeDeLuxe(String string) {
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public void passer(Joueur j) {
		System.out.println(j.getNom()+" s'arrete sur la case taxe de luxe");
		// TODO Auto-generated method stub
		//j.crediter(200);
		
	}

	@Override
	public void arreter(Joueur j) throws SoldeIllegalException {
		// TODO Auto-generated method stub
		j.debiter(400);
		
	}

}
