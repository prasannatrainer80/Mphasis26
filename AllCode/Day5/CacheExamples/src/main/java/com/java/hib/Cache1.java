package com.java.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.java.hib.model.Employ;


public class Cache1 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();

		Employ e1 = (Employ) session.get(Employ.class, 1);
		Employ e2 = (Employ) session.get(Employ.class, 1);

		System.out.println(e1 == e2); // true (L1 cache)

		session.close();
		sf.close();

	}
}
