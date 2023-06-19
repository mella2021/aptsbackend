package com.mella.Amusementpark.controller;

import com.mella.Amusementpark.model.Customer;
import com.mella.Amusementpark.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin (origins="*")
@RestController
@RequestMapping("/api/v1")

public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;
    //get all customers
    @GetMapping("/")
    public List<Customer>getCustomer(){
        return customerRepository.findAll();
    }

    @PostMapping("/savedata")
    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

}
