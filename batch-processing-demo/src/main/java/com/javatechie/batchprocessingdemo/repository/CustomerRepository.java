package com.javatechie.batchprocessingdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.batchprocessingdemo.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}
