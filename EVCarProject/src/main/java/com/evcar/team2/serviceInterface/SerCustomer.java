package com.evcar.team2.serviceInterface;

import java.util.Optional;

import com.evcar.team2.model.Customer;

public interface SerCustomer {

public	void saveData(Customer cust);

public Optional<Customer> getdatabyId(int custid);

}
