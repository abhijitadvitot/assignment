package com.example.demo.curd;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2146159499407984293L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long adrressId;
	private String  street,city,pin;
	public Long getAdrressId() {
		return adrressId;
	}
	public void setAdrressId(Long adrressId) {
		this.adrressId = adrressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public int hashCode() {
		return Objects.hash(adrressId, city, pin, street);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(adrressId, other.adrressId) && Objects.equals(city, other.city)
				&& Objects.equals(pin, other.pin) && Objects.equals(street, other.street);
	}
	@Override
	public String toString() {
		return "Address [adrressId=" + adrressId + ", street=" + street + ", city=" + city + ", pin=" + pin + "]";
	}
	
}


