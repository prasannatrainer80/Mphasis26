package com.java.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

import com.java.hib.model.Employ;

public class Cr4 {
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration()
				.configure().buildSessionFactory();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.or(
				Restrictions.eq("dept", "Java"),
				Restrictions.ge("basic", 90000.00)
				));
		List<Employ> employList = cr.list();
		employList.forEach(System.out::println);
	}
}
