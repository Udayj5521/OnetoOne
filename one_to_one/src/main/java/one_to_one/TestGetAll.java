package one_to_one;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAll {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT s From Person s";

		Query query = entityManager.createQuery(sql);

		List<Person> persons = query.getResultList();

		for (Person person : persons) {
			System.out.println(person.getId());
			System.out.println(person.getName());
			System.out.println(person.getEmail());
			System.out.println(person.getPhone());
			System.out.println("-------------------------");
		}

	}

}
