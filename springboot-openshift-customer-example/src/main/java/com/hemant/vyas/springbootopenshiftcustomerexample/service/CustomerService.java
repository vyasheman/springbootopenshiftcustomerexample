package com.hemant.vyas.springbootopenshiftcustomerexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hemant.vyas.springbootopenshiftcustomerexample.model.Customer;
import com.hemant.vyas.springbootopenshiftcustomerexample.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public void save(Customer customer) {
		customerRepository.save(customer);
	}

	public List<Customer> customerList() {
		return customerRepository.findAll();
	}

}


