package com.java.hib;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.java.hib.model.Employ;

public class Cache1 {
	public static void main(String[] args) {
		 SessionFactory sf = 
					new AnnotationConfiguration().configure().buildSessionFactory();
		 Session session = sf.openSession();

		 Employ e1 = (Employ)session.get(Employ.class, 1);
		 Employ e2 = (Employ)session.get(Employ.class, 1);

		 System.out.println(e1 == e2); // true

		 session.close();

	}
}
