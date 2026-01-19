package com.java.hib;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.java.hib.model.Employ;

public class EmployDeleteMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number   ");
		empno = sc.nextInt();
		SessionFactory sf = new AnnotationConfiguration().
				configure().buildSessionFactory();
		Session session = sf.openSession();
		String cmd = "from Employ where empno="+empno;
		Query query = session.createQuery(cmd);
		Employ employ = (Employ)query.uniqueResult();
		if (employ !=null) {
			Transaction trans = session.beginTransaction();
			session.delete(employ);
			trans.commit();
			System.out.println("*** Employ Record Deleted ***");
		} else {
			System.out.println("*** Employ Record Not Found ***");
		}
	}
}
