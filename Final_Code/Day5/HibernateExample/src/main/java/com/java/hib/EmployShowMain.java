package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.java.hib.model.Employ;

public class EmployShowMain {
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().
					configure().buildSessionFactory();
		Session session = sf.openSession();
		String cmd ="from Employ";
		Query query = session.createQuery(cmd);
		List<Employ> employList = query.list();
		employList.forEach(x -> {
			System.out.println(x);
		});
	}
}
