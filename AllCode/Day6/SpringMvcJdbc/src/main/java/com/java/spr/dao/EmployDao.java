package com.java.spr.dao;

import java.util.List;

import com.java.spr.model.Employ;

public interface EmployDao {
	List<Employ> showEmploy();
	Employ searchEmploy(int empno);
	String updateEmploy(Employ employUpdated);
	String deleteEmploy(int empno);
	String addEmploy(Employ employ);
	int login(String user, String pwd);
}
