package ejemplo03;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import util.EMF;

public class Test01 {

	public static void main(String[] args) {
		EntityManagerFactory emf = EMF.getInstance();
		EntityManager em = emf.createEntityManager();
		
		Persona03 p = em.find(Persona03.class, 7);
		if (p != null) {
			System.out.println(p);
		}
	}

}
