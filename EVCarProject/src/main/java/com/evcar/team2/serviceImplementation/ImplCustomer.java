package com.evcar.team2.serviceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evcar.team2.model.Customer;
import com.evcar.team2.repository.RepoCustomer;
import com.evcar.team2.serviceInterface.SerCustomer;

@Service
public class ImplCustomer implements SerCustomer{

	@Autowired
	RepoCustomer rc;

	@Override
	public void saveData(Customer cust) {
		rc.save(cust);
		
	}

	@Override
	public Optional<Customer> getdatabyId(int custid) {
		
		return rc.findById(custid);
	}
	
	
}
