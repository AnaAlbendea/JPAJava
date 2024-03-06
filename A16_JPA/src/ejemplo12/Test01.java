package ejemplo12;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import util.EMF;

public class Test01 {

	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
//		Partido p = em.find(Partido.class, 3);
//		
//		if (p != null) {
//			System.out.println(p);
//		}
//		
		Campo02 c = em.find(Campo02.class, 2);
		if (c != null) {
			System.out.println(c);
			for (Partido02 partido: c.getPartidos()) {
				System.out.println(partido);
			}
		}
		
			
		em.close();
	}

}
