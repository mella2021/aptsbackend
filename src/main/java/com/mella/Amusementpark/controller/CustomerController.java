package com.mella.Amusementpark.controller;

import com.mella.Amusementpark.model.Customer;
import com.mella.Amusementpark.model.Rides;
import com.mella.Amusementpark.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin (origins="*", allowedHeaders = "*")
@RestController
@RequestMapping("/customer")

public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/list")
    public List<Customer> getcustomer() {return customerRepository.findAll();
    }
  @PostMapping("/save")
   public Customer createCustomer(@RequestBody Customer customer){
     return customerRepository.save(customer);}

    @DeleteMapping(value ="/delete/{id}")
            public String deleteCustomer(@PathVariable Integer id){
            Customer deleteCustomer=customerRepository.findById(id).get();
            customerRepository.delete(deleteCustomer);
            return "delete";
            }
   @GetMapping("/getbyId/{id}")
    public Optional<Customer> getCustomer(@PathVariable Integer id){
        return customerRepository.findById(id);
}
@PutMapping(value = "/update/{id}")
    public String updateCustomer (@PathVariable Integer id, @RequestBody Customer customer){
        Customer updatedCustomer = customerRepository.findById(id).get();
        updatedCustomer.setPhone(customer .getPhone());
        updatedCustomer.setUsername(customer .getUsername());
        updatedCustomer.setEmail(customer .getEmail());
        updatedCustomer.setPassword(customer .getPassword());
        customerRepository.save(updatedCustomer);
        return "updated";

}
@PostMapping("/search")
    public ResponseEntity<Customer> searchCustomerByEmail(@RequestBody Customer customer){


}


}












