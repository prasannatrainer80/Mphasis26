package com.java.hib;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Nq1 {
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration()
				.configure().buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.getNamedQuery("showEmploy");
		query.list().forEach(System.out::println);
	}
}
