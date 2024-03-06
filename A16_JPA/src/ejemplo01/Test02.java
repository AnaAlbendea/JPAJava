package ejemplo01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import util.EMF;

public class Test02 {
	
	
	//vamos a insertar en BD
	public static void main(String[] args) {
		EntityManagerFactory emf = EMF.getInstance();
		EntityManager em = emf.createEntityManager();
		
		Persona01 nuevo = new Persona01();
		nuevo.setApellidos("Ape1");
		nuevo.setNombre("Nb");
		nuevo.setApodo("Apodo");
		nuevo.setDni("dni111");
		
		//JPA no traqbaja en autocommit toda acutalizacion dentro de una transaccion
		
		em.getTransaction().begin(); //inicio la transaccion
		
		em.persist(nuevo); //lazno el update 
		
		em.getTransaction().commit(); //hago el commitm 
		
		
		em.close();
		emf.close();
	}

}
