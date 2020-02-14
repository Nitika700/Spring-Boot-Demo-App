package com.apex.customer.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apex.customer.Entity.CustomerEntity;

public interface CustomerRepos extends JpaRepository<CustomerEntity,Long> {

}
