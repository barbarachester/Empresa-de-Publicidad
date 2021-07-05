
package test;

import domain.Persona;
import javax.persistence.*;


public class PruebaBD {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("PERSONA_PU");
        EntityManager em= emf.createEntityManager();
        EntityTransaction tx =em.getTransaction();
        tx.begin();
     Persona persona = new Persona("12345678-9", "Jordan","Cisternas", 18, "UPS", "Pagado", "Valparaiso");
  
        em.persist(persona);
        tx.commit();
        em.close();
    }
    
}
