package com.java.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.java.hib.model.Employ;

public class Cr6 {
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration()
				.configure().buildSessionFactory();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.like("name", "S%",MatchMode.START));
		List<Employ> employList = cr.list();
		employList.forEach(System.out::println);
	}
}
