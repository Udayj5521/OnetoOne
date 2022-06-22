package one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person p = entityManager.find(Person.class, 1);
		if(p != null) {
			entityTransaction.begin();
			entityManager.remove(p);
			entityTransaction.commit();
		}else {
			System.out.println("No record to Delete");
		}
	}

}
