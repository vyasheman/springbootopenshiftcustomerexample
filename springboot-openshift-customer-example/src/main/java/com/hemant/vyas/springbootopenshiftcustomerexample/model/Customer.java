package com.hemant.vyas.springbootopenshiftcustomerexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class  Customer{

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long custerId;
	
	@Column
	private String Name;
	@Column
	private String MobileNo;
	@Column
	private String Address;
	
	
	public Long getCusterId() {
		return custerId;
	}
	public Customer setCusterId(Long custerId) {
		this.custerId = custerId;
		return this;
	}
	public String getName() {
		return Name;
	}
	public Customer setName(String name) {
		this.Name = name;
		return this;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public Customer setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
		return this;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
