package com.mphasis.cms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.cms.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,
Integer> {
	
	Customer findByCusUserName(String cusUserName);
	Customer findByCusUserNameAndCusPassword(String user, String pwd);
}
