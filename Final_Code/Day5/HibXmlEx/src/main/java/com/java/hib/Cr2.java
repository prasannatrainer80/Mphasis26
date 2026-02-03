package com.java.hib;

import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

import com.java.hib.model.Employ;

public class Cr2 {
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration()
				.configure().buildSessionFactory();
		Session session = sf.openSession();
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		empno = sc.nextInt();
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.eq("empno", empno));
		Employ employ = (Employ)cr.uniqueResult();
		if (employ !=null) {
			System.out.println(employ);
		}
	}
}
