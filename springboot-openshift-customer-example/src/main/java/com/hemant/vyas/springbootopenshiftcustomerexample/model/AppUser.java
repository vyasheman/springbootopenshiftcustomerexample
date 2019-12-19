package com.hemant.vyas.springbootopenshiftcustomerexample.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class AppUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userPid;
	
	
	@Column
	private String userUID;
	
	@Column
	private String userPassword;
	
	

		public Long getUserPid() {
			return userPid;
		}

		public AppUser setUserPid(Long userPid) {
			this.userPid = userPid;
			return this;
		}

		public String getUserUID() {
			return userUID;
		}

		public AppUser setUserUID(String userUID) {
			this.userUID = userUID;
			return this;
		}

		public String getUserPassword() {
			return userPassword;
		}

		public AppUser setUserPassword(String userPassword) {
			this.userPassword = userPassword;
			return this;
		}

	
		@Override
		public String toString() {
			return "AppUser [userPid=" + getUserPid() + ", userUID=" + getUserUID() + ", userPassword=" + getUserPassword() + "]";
		}
}
