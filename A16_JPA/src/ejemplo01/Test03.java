package ejemplo01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import util.EMF;

public class Test03 {

	public static void main(String[] args) {
		EntityManagerFactory emf = EMF.getInstance();
		EntityManager em = emf.createEntityManager();
		
		Persona01 p = em.find(Persona01.class, 11);
		
		if (p != null) {
			p.setApellidos("lalala");
			

			em.getTransaction().begin(); //inicio la transaccion
			em.persist(p); //lazno el update 
			em.getTransaction().commit(); //hago el commitm 
			
			System.out.println(p);
			
		}

	}

}
