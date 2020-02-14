package com.apex.customer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.customer.DAO.CustomerRepos;
import com.apex.customer.Entity.CustomerEntity;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepos customerRepos;
	
	@Override
	public List<CustomerEntity> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepos.findAll();
	}
	

}
