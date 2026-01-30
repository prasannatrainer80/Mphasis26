package com.mphasis.cms.service;

import java.util.List;
import com.mphasis.cms.repo.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.cms.model.Customer;
import com.mphasis.cms.repo.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public String loginCustomer(String user, String pwd) {
		Customer customer = customerRepository.findByCusUserNameAndCusPassword(user, pwd);
		if (customer!=null) {
			return "1";
		}
		return "0";
	}
	public Customer searchByuserName(String user) {
		Customer customer = customerRepository.findByCusUserName(user);
		System.out.println("Customer  " +customer);
		return customer;
		
	}
	
	public List<Customer> showCustomer() {
		return customerRepository.findAll();
	}
	
	public Customer searchByCustomerId(int id) {
		return customerRepository.findById(id).get();
	}
}
