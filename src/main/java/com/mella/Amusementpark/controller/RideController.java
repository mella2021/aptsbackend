package com.mella.Amusementpark.controller;

import com.mella.Amusementpark.model.Rides;

import com.mella.Amusementpark.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin (origins="*", allowedHeaders = "*")
@RestController
@RequestMapping("/rides")
public class RideController {
    @Autowired
    private RideRepository ridesRepository;

    @GetMapping("/list")
    public ResponseEntity<List<Rides>> getAllRides() {
        List<Rides> rides = ridesRepository.findAll();
        return new ResponseEntity<>(rides, HttpStatus.OK);

    }

    @PostMapping("/saverides")
    public Rides createRide(@RequestBody Rides rides) {
        return ridesRepository.save(rides);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rides> getRideById(@PathVariable("id") Integer id) {
        Rides rides = (ridesRepository.findById(id).orElse(null));
        if (rides != null) {
            return new ResponseEntity<>(rides, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteRide(@PathVariable Integer id) {
        Rides deleteRides = ridesRepository.findById(id).get();
        ridesRepository.delete(deleteRides);
        return "delete";
    }

    @GetMapping("/getbyId/{id}")
    public Optional<Rides> getRides(@PathVariable Integer id) {
        return ridesRepository.findById(id);
    }

    @PutMapping(value = "/update/{id}")
    public String updateRides(@PathVariable Integer id, @RequestBody Rides rides) {
        Rides updatedRides = ridesRepository.findById(id).get();
        updatedRides.setId(rides.getId());
        updatedRides.setName(rides.getName());
        updatedRides.setDescription(rides.getDescription());
        updatedRides.setImage(rides.getImage());
        ridesRepository.save(updatedRides);
        return "updated";
    }
}

//
//        @PostMapping("/save")
//        public ResponseEntity<Rides> createRides (@RequestBody Rides rides){
//            Rides savedRides = ridesRepository.save(rides);
//            return new ResponseEntity<>(savedRides, HttpStatus.CREATED);
//        }
//
//
//        @PutMapping("/{id}")
//        public ResponseEntity<Rides> updateRide (@PathVariable("id") Integer id, @RequestBody Rides rides){
//            Rides ride = ridesRepository.findById(id).orElse(null);
//            if (ride != null) {
//                updateRide.setId(ride.getId());
//
//            }
//            return ResponseEntity.ok(updatedrides);
//        }else{
//            return ResponseEntity.notFound().build();
//        }
//
//        @DeleteMapping("/{id}")
//        public ResponseEntity<Void> deletedrides (@PathVariable("id") Integer id){
//            boolean deleted = ridesRepository.deleteById(id);
//            if (deleted) {
//                return ResponseEntity.noContent().build();
//            } else {
//                return ResponseEntity.notFound().build();
//            }
//        }
//    }
//}






