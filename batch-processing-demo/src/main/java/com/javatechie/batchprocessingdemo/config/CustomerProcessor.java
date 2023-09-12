package com.javatechie.batchprocessingdemo.config;

import org.springframework.batch.item.ItemProcessor;

import com.javatechie.batchprocessingdemo.entities.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer>{

    @Override
    public Customer process(Customer item) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'process'");
    }
    
}
