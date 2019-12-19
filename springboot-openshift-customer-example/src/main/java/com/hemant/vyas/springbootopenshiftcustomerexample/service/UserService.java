package com.hemant.vyas.springbootopenshiftcustomerexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hemant.vyas.springbootopenshiftcustomerexample.model.AppUser;
import com.hemant.vyas.springbootopenshiftcustomerexample.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	public void save(AppUser user) {
		
		repository.save(user);
	}

}
