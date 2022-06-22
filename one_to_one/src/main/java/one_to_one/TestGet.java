package one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGet {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person p = entityManager.find(Person.class, 2);

		if (p != null) {
			System.out.println("Person Id is " + p.getId());
			System.out.println("Person Name is " + p.getName());
			System.out.println("Person Email is " + p.getEmail());
		} else {
			System.out.println("NO Person exist for give is id");
		}

	}
}
