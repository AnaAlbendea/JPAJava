package ejemplo05;

import javax.persistence.EntityManager;

import util.EMF;

public class Test01 {
	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Persona06 p = em.find(Persona06.class, new Dni06(1230321, 'A'));
		if (p != null)
			System.out.println(p);
		System.out.println(p.hashCode());
		em.close();
	}
}
