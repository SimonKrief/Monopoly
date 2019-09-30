package fr.gtm.monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlateauTest {

	@Test
	public void test() {
		Plateau p = new Plateau();
		assertNotNull(p);
		Case depart = p.getCaseDepart();
		assertNotNull(depart);
		Case c = depart;
		int cpt = 0;
		do {
			cpt++;
			assertNotSame(c, c.getNext());
			c = c.getNext();
		}while(c!=depart);
		assertEquals(40, cpt);
	}

}
