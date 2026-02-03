package com.java.hib;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.java.hib.model.Employ;

public class EmploySearchMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		empno = sc.nextInt();
		SessionFactory sf = new AnnotationConfiguration().
				configure().buildSessionFactory();
		Session session = sf.openSession();
		String cmd = "from Employ where empno="+empno;
		Query query = session.createQuery(cmd);
		Employ employ = (Employ)query.uniqueResult();
		if (employ!=null) {
			System.out.println(employ);
		} else {
			System.out.println("*** Record Not Found ***");
		}
	}
}
