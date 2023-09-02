package hibernation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernation.entity.Cinema;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("./hibernate.config.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		List<Cinema> cinemas = session.createQuery("select c from cinema", Cinema.class).getResultList();
		cinemas.stream().forEach(System.out::println);
		transaction.commit();
		session.close();

	}

}
