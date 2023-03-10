package com.slk.demo.WordsWorth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slk.demo.WordsWorth.entity.Customer;
import com.slk.demo.WordsWorth.service.CustomerService;


import jakarta.transaction.Transactional;


@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/customers")
	public List<Customer> listAllCustomers(){
		return service.listAllCustomers();
	}
	

	@GetMapping("/customer/{Id}")
	public Customer getCustomerById(@PathVariable int Id )
	{
		Customer cust = service.getCustomerById(Id);
		
		return cust;
	}
	

	@GetMapping("/customer/email/{email}")
	public Customer getByEmail(@PathVariable String email) {
		Customer cust = service.getCustomerByEmail(email);
		return cust;
		
	}
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer theCustomer ) {
		Customer cust = service.save(theCustomer);
		return new ResponseEntity<Customer>(cust,HttpStatus.OK) ;
	}
	
	@Transactional
	@PutMapping("/customer/pass/{id}/{pass}")
	public ResponseEntity<Customer> updateCustomerPassword(@PathVariable int id,@PathVariable String pass)
	{
		Customer c = service.getCustomerById(id);
		int res= 0;
		if(c!=null) {
			res = service.updatePasswordByStudentId(id, pass);
			if(res>0) {
				c = service.getCustomerById(id);
			}
		}
		return new ResponseEntity<Customer>(c,HttpStatus.OK) ;
	}
	
	@Transactional
	@PutMapping("/customer/contact/{id}/{contact}")
	public ResponseEntity<Customer> updateCustomerContact(@PathVariable int id, @PathVariable long contact){
		Customer c = service.getCustomerById(id);
		int res= 0;
		if(c!=null) {
			res = service.updateContactByStudentId(id, contact);
			if(res>0) {
				c = service.getCustomerById(id);
			}
		}
		return new ResponseEntity<Customer>(c,HttpStatus.OK) ;
	}
	
	@Transactional
	@PutMapping("/customer/address/{id}/{address}")
	public ResponseEntity<Customer> updateAddressContact(@PathVariable int id, @PathVariable String address){
		Customer c = service.getCustomerById(id);
		int res= 0;
		if(c!=null) {
			res = service.updateAddressByStudentId(id, address);
			if(res>0) {
				c = service.getCustomerById(id);
			}
		}
		return new ResponseEntity<Customer>(c,HttpStatus.OK) ;
	}
	
	@Transactional
	@DeleteMapping("/customer/{theId}")
	public void deleteByCustomerId(@PathVariable int theId)
	{
		service.deleteById(theId);
	    Customer st = service.getCustomerById(theId);
	    
	}
	

}
