package com.example.demo.curd;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table(name = "User_table")
@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7401602907010270872L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String userName;
@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, userId, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && Objects.equals(userId, other.userId)
				&& Objects.equals(userName, other.userName);
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", address=" + address + "]";
	}
	
	
}
