
package ejemplo04;

import javax.persistence.EntityManager;

import org.hibernate.cfg.beanvalidation.GroupsPerOperation;

import util.EMF;

public class Test01 {
	
	public static void main(String[] args) {
//		EntityManagerFactory emf = EMF.getInstance();
//		EntityManager em = emf.createEntityManager();
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Persona05 p = em.find(Persona05.class, new Dni05(1230321, 'A'));
		
		if (p != null) {
			System.out.println(p);
		}
		
	}

}
