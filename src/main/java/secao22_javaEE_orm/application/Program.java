package secao22_javaEE_orm.application;

import secao22_javaEE_orm.entities.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {

    public static void main(String[] args0)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        /*

        //Persistência de dados

        Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
        Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");

        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
         */

        /*

        //Busca de dados
        Pessoa p = em.find(Pessoa.class, 2);
        System.out.println(p);
         */

        //Monitoramento de entidades

        //Pessoa p = new Pessoa(2, null, null);
        Pessoa p = em.find(Pessoa.class, 2);
        em.remove(p);

        em.getTransaction().commit();
        System.out.println("Pronto!");

        em.close();
        emf.close();
    }
}
