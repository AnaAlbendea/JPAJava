package ejemplo10;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import util.EMF;

public class Test01 {

	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Contacto c = em.find(Contacto.class, 7);
		
		if (c != null) {
			System.out.println(c);
		}
			
		em.close();
	}

}
