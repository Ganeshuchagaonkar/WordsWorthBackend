package com.slk.demo.WordsWorth.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@Column(name="CUSTOMERID")
    private int customerId; 
	
	@Column(name="CUSTOMERNAME")
    private String customerName ;
	
	@Column(name="EMAIL")
    private String email ;
	
	@Column(name="CONTACT")
    private long contact;
	
	@Column(name="PASSWORD")
    private String password ;
	
	@Column(name="ADDRESS")
    private String address ;
	
	
    public Customer() {
	}

	public Customer(int customerId, String customerName, String email, long contact, String password,
			String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.contact = contact;
		this.password = password;
		this.address = address;
	}

	public int getCustomer_Id() {
		return customerId;
	}

	public void setCustomer_Id(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomer_Name() {
		return customerName;
	}

	public void setCustomer_Name(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + (int) (contact ^ (contact >>> 32));
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (contact != other.contact)
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [customer_Id=" + customerId + ", customer_Name=" + customerName + ", email=" + email
				+ ", contact=" + contact + ", password=" + password + ", address=" + address + "]";
	}
	
	

}