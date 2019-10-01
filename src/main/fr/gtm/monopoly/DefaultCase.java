package fr.gtm.monopoly;

public class DefaultCase extends Case {

	public DefaultCase() {
	}

	public DefaultCase(String name) {
		super(name);
	}

	public DefaultCase(String name, String couleur) {
		super(name, couleur);
	}

	@Override
	public void passer(Joueur j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void arreter(Joueur j) {
		System.out.println(j.getNom()+" s'arrete sur la "+ this.getName());
		// TODO Auto-generated method stub
		
	}

}
