package ejemplo07;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import ejemplo07.Persona08;
import util.EMF;

public class Test01 {
	public static void main(String[] args) {
//		EntityManager em = EMF.getInstance().createEntityManager();
		EntityManagerFactory emf = EMF.getInstance();
		EntityManager em;
		em = emf.createEntityManager();
		
		Persona08 p = em.find(Persona08.class, 6);
		if(p != null)
			System.out.println(p);
		   
		  
		
		p.setApodo("Pirulo"); //modifico el atributo del objeto pero no se ledice na da a la BD
		Persona08 nuevo = new Persona08();
		nuevo.setNombre("Mar");
		nuevo.setApodo("Mary");
		nuevo.setApellidos("Cruz");
		
		em.getTransaction().begin();
		em.persist(nuevo); //añadimos el nuevo objeto a la base de datos
		em.getTransaction().commit();
	
		em.close();
		EMF.getInstance().close();
	}
}
