package fr.gtm.monopoly;

public class Depart extends Case {

	public Depart(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	

	@Override
	public void passer(Joueur j) throws SoldeIllegalException {
		// TODO Auto-generated method stub
		System.out.println("depart");
		j.crediter(200);
		
	}

	@Override
	public void arreter(Joueur j) throws SoldeIllegalException {
		j.debiter(400);
		
	}


}
