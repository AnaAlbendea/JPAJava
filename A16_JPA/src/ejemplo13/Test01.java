package ejemplo13;

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
		//Jugador j = em.find(Jugador.class, 5);
		
		Equipo e = em.find(Equipo.class,12);
		if (e != null) {
			System.out.println(e);
		}
		
			
		em.close();
	}

}
