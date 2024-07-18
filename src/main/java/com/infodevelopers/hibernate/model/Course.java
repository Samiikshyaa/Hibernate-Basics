package com.infodevelopers.hibernate.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name ="course_tbl")
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "course_name", length=200)
    private String name;
    @Column(name = "course_price")
    private Double price;
    @Column(name = "file_path")
    private String filePath;

}
