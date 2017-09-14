package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import beans.EntityPersona;

public class JpaTest {
	
	private EntityManager manager;
	
	public JpaTest(EntityManager manager){
		this.manager = manager;
	}
public static void main(String[]args){
		
		//Patron factory para obtener el EntityManagerFactory
		EntityManagerFactory factory
		=Persistence.createEntityManagerFactory("Tarea_EclipseLink");
		
		//Se extrae el EntityManager del factory
		EntityManager em = factory.createEntityManager();
		
		//Inyeccion de dependencias
		JpaTest test = new JpaTest(em);
		
		//Se obtiene el objeto EntityTransaction para definir la transaccion
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
			// inserts, updates y deletes
		tx.commit();
		
		
		//---Querys Nombrados
		test.listarPersonasNQ();
	}
	
	private void listarPersonasNQ() {
		
		List<EntityPersona> personas = manager.createNamedQuery(
				"Persona.getAll",EntityPersona.class).getResultList();
		
		for (EntityPersona persona :personas ){
			System.out.println(persona);
		}
		
	}

}
