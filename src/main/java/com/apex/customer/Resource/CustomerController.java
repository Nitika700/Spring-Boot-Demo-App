package com.apex.customer.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apex.customer.Entity.CustomerEntity;
import com.apex.customer.Service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/getAllCustomer")	
	public List<CustomerEntity> getAllLocation()
	{
		System.out.println("hi");
		return customerService.getAllCustomer();
	}
	

}
