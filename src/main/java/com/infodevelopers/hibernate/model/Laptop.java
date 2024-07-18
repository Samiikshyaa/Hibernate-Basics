package com.infodevelopers.hibernate.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "laptop_tbl")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  id;
    private String companyName;
    private String modelNo;
    @Column (name="specification", columnDefinition = "TEXT")
    private String specification;


}
