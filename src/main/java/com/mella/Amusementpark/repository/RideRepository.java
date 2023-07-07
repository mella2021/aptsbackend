package com.mella.Amusementpark.repository;

import com.mella.Amusementpark.model.Customer;
import com.mella.Amusementpark.model.Rides;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Rides,Integer> {
//    Rides getRideById(Integer id);
//
//    Rides updatedrides(Integer id, Rides rides);
//
//    Rides createdrides(Rides rides);
//
//    boolean deletedrides(Integer id);
}
