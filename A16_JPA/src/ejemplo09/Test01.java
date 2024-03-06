package ejemplo09;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import util.EMF;

public class Test01 {

	public static void main(String[] args) {
	
		EntityManager em = EMF.getInstance().createEntityManager();
		

		Rectangulo02 r = em.find(Rectangulo02.class,66);
		if(r != null)
			System.out.println(r);
		
		Circulo02 c = new Circulo02(1,2,3);
		
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		   
		
		em.close();
		
//		
//		p.setApodo("Pirulo"); //modifico el atributo del objeto pero no se ledice na da a la BD
//		Persona08 nuevo = new Persona08();
//		nuevo.setNombre("Mar");
//		nuevo.setApodo("Mary");
//		nuevo.setApellidos("Cruz");
//		
//		em.getTransaction().begin();
//		em.persist(nuevo); //añadimos el nuevo objeto a la base de datos
//		em.getTransaction().commit();
//	
//		em.close();
//		EMF.getInstance().close();

	}

}
