package com.hemant.vyas.springbootopenshiftcustomerexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hemant.vyas.springbootopenshiftcustomerexample.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
