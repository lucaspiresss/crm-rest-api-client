package com.lucaspires.springrestclient.service;

import java.util.List;

import com.lucaspires.springrestclient.model.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();
	public void saveCustomer(Customer theCustomer);
}