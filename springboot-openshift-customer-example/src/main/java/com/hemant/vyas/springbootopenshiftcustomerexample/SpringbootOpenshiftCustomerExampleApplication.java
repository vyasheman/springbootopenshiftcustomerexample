package com.hemant.vyas.springbootopenshiftcustomerexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hemant.vyas.springbootopenshiftcustomerexample.model.AppUser;
import com.hemant.vyas.springbootopenshiftcustomerexample.model.Customer;
import com.hemant.vyas.springbootopenshiftcustomerexample.service.CustomerService;
import com.hemant.vyas.springbootopenshiftcustomerexample.service.UserService;

@SpringBootApplication
public class SpringbootOpenshiftCustomerExampleApplication implements CommandLineRunner{

	@Autowired
	UserService userService;
	
	@Autowired
	CustomerService customreService;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootOpenshiftCustomerExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*	AppUser user = new AppUser();		
		  user.setUserPid(1234L).setUserUID("ABC12").setUserPassword("ABC12");
		  userService.save(user);
		 
		
		Customer customer = new Customer();
		customer.setCusterId(112L).setName("Rakesh").setMobileNo("8987661234").setAddress("ABC");;
		customreService.save(customer);
		
		customer = new Customer();
		customer.setCusterId(2l).setName("Ravi").setMobileNo("8987661235").setAddress("DEF");
		customreService.save(customer);
		
		customer = new Customer();
		customer.setCusterId(3l).setName("Rishi").setMobileNo("8987661236").setAddress("GHI");
		customreService.save(customer);
		
		customer = new Customer();
		customer.setCusterId(4l).setName("Simanchal").setMobileNo("8987661237").setAddress("JKL");
		customreService.save(customer);
		*/
		
	}

}
