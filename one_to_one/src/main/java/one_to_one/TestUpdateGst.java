package one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateGst {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Company company = new Company();
		company.setId(1);
		company.setName("tom");
		company.setPhone(987654321l);
		company.setWeb("www.tom.com");

		Gst gst = new Gst();
		gst.setCountry("India");
		gst.setGstnumber(45678);
		gst.setState("karnataka");

		entityTransaction.begin();
		entityManager.merge(company);
		entityTransaction.commit();

	}

}
