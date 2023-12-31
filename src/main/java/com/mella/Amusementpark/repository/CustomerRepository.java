package com.mella.Amusementpark.repository;

import com.mella.Amusementpark.model.Customer;
import com.mella.Amusementpark.model.Rides;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
