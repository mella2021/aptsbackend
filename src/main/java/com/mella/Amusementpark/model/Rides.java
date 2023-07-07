package com.mella.Amusementpark.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name="Rides")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Rides {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="image")
    private String image;

}
