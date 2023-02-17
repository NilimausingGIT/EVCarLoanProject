package com.evcar.team2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.evcar.team2.model.Customer;
import com.evcar.team2.serviceInterface.SerCustomer;

@RestController
public class CustomerController {
	@Autowired
	SerCustomer sc;
	
	@PostMapping("/postcustomerdata")
	public String postdata(@RequestBody Customer cust)
	{
		sc.saveData(cust);
		
		return "Data Posted Successfully";
	}

	@GetMapping("/getbyid/{cId}")
	public Optional<Customer> getById(@PathVariable ("cId") int custid)
	{
		return sc.getdatabyId(custid);
	}
}
