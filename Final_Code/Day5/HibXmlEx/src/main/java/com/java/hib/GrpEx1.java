package com.java.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.java.hib.model.Employ;

public class GrpEx1 {
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration()
				.configure().buildSessionFactory();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.groupProperty("dept"));
		plist.add(Projections.sum("basic"));
		cr.setProjection(plist);
		List<Object[]> list = cr.list();
		for(Object[] row : list) {
			System.out.println("Department  " +row[0]);
			System.out.println("Total Salary " +row[1]);
		}
	}
}
