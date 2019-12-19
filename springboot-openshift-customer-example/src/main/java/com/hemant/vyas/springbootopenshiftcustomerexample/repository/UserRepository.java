package com.hemant.vyas.springbootopenshiftcustomerexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hemant.vyas.springbootopenshiftcustomerexample.model.AppUser;

@Repository
public interface UserRepository extends CrudRepository<AppUser, Long>{

}
