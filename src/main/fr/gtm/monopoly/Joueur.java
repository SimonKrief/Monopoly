package fr.gtm.monopoly;

public class Joueur {
    public String nom;
    private Pion pion;
    private int solde = 1500;

    public Joueur(String string) {
		// TODO Auto-generated constructor stub
    	nom= string;
	}

	public int getSolde() {
		return solde;
	}

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
//        System.out.println(String.format("%s était sur la case %s, il obtient %d\n", old.getName(),r));
    }

    @Override
    public String toString() {
        return nom;
    }
    
    public void crediter(int d) throws SoldeIllegalException {
    	if (solde <0) {
			throw new SoldeIllegalException("solde negatif "+ solde);
		}
    	
		solde += d;
	}
    public void debiter(int d) throws SoldeIllegalException {
       	if (solde <0) {
    			throw new SoldeIllegalException("solde negatif "+ solde);
    		}
    	solde -=d;
		
	}

	public static void interesseParAchat(Propriete p, Joueur j) {
		// TODO Auto-generated method stub
		if (j.solde>p.prix) {
			p.setProprietaire(j);
			j.debiter(p.prix);
		}
	}
}



