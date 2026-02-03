package com.java.hib.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.java.hib.model.Employ;
import com.java.hib.util.SessionHelper;

public class CriteriaExample {

	SessionFactory sessionFactory;
	Session session;
	
	public List<Employ> showEmploy() {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		return cr.list();
	}
}
