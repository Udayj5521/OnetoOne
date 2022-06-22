package one_to_one;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAllGst {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT c From Company c";

		Query query = entityManager.createQuery(sql);

		List<Company> companys = query.getResultList();

		for (Company company : companys) {
			System.out.println(company.getId());
			System.out.println(company.getName());
			System.out.println(company.getWeb());
			System.out.println(company.getPhone());
			System.out.println("-------------------------");
		}
	}
}
