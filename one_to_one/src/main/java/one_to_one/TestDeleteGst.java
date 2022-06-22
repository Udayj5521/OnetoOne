package one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteGst {
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Company c = entityManager.find(Company.class, 1);
		if(c != null) {
			entityTransaction.begin();
			entityManager.remove(c);
			entityTransaction.commit();
		}else {
			System.out.println("No record to Delete");
		}
	}

}
