package com.slk.demo.WordsWorth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.slk.demo.WordsWorth.entity.Customer;




public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	public Customer findByCustomerId(int id);
	public Customer findByEmail(String email);
	
	@Modifying
	@Query("UPDATE Customer c SET c.password =:pass WHERE c.customerId =:id")
	public int updatePasswordByCustomerId(@Param("id") int id, @Param("pass") String pass );
	
	@Modifying
	@Query("UPDATE Customer c SET c.contact =:contact WHERE c.customerId =:id")
	public int updateContactByCustomerId(@Param("id") int id, @Param("contact") long contact );
	
	@Modifying
	@Query("UPDATE Customer c SET c.address =:contact WHERE c.customerId =:id")
	public int updateAddressByCustomerId(@Param("id") int id, @Param("contact") String address );
}
