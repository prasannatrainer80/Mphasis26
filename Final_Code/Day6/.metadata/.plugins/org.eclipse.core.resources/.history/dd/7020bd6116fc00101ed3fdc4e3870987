package com.java.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("employservice")
public class EmployService {

	private static EmployDao employDao;
	
	static {
		employDao = new EmployDao();
	}
	
	@GET
	@Path("employshow")
	@Produces(MediaType.APPLICATION_JSON)
	public Employ[] showEmploy() {
		Employ[] res = employDao.showEmploy().toArray(new Employ[
		                    employDao.showEmploy().size()
		                                                         ]);
		return res;
	}
	
	@GET
	@Path("employsearch/{empno}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employ searchEmploy(@PathParam("empno") int empno) {
		return employDao.searchEmploy(empno);
	}

}
