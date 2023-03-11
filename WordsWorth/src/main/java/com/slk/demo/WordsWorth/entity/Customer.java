package com.slk.demo.WordsWorth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@Column(name="customerid")
	private int customerId;
	
	@Column(name="customername")
	private String customerName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="contact")
	private long contact;
	
	@Column(name="password")
	private String password;
	
	@Column(name="address")
	private String address;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer(int customerId, String customerName, String email, long contact, String password, String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.contact = contact;
		this.password = password;
		this.address = address;
	}
	public Customer() {
	
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email
				+ ", contact=" + contact + ", password=" + password + ", address=" + address + "]";
	}
	
	
	
	

}