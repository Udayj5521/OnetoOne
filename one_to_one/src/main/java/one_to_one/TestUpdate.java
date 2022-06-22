package one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = new Person();
		person.setId(2);
		person.setName("Uday");
		person.setPhone(987654321l);
		person.setEmail("uday@gmail.com");
		
		Pan pan = new Pan();
		pan.setId(2);
		pan.setName("Dinga");
		pan.setPannumber(8765);
		pan.setAddress("Mangalore");

		entityTransaction.begin();
		entityManager.merge(person);
		entityManager.merge(pan);
		entityTransaction.commit();

	}

}
