package com.slk.demo.WordsWorth.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.demo.WordsWorth.entity.Customer;
import com.slk.demo.WordsWorth.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository repo;

	public List<Customer> listAllCustomers(){
		List<Customer> customers = repo.findAll();
		return customers;
	}
	
	public Customer getCustomerById(int id) {
		Customer customer = repo.findByCustomerId(id);
		return customer;
	}
	
	public Customer getCustomerByEmail(String email) {
		Customer customer = repo.findByEmail(email);
		return customer;
	}
	
	public Customer save(Customer theCustomer) {
		
		Customer customer = repo.save(theCustomer);
		return customer;
	}
	
	public void deleteById(int theId) {
		
		repo.deleteById(theId);
	}
	
	public int updatePasswordByStudentId(int id,String pass) {
		int res = repo.updatePasswordByCustomerId(id, pass);
		return res;
	}
	
	public int updateContactByStudentId(int id, long contact) {
		int res = repo.updateContactByCustomerId(id, contact);
		return res;
	}
	
	public int updateAddressByStudentId(int id, String address) {
		int res = repo.updateAddressByCustomerId(id, address);
		return res;
	}

}
