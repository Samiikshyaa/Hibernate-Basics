package com.infodevelopers.hibernate.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "employee_tbl")
public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "fullname", length = 70)
    private String fullName;
    @Column(name = "mobile_number", length=10)
    private String mobileNumber;
    @Column(name="email", length = 80)
    private String email;
    private Integer age;
    @OneToOne(targetEntity = Laptop.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "laptop_id", foreignKey = @ForeignKey(name = "FK_EMPLOYEE_LAPTOPID") )
    private Laptop laptop;

    @ManyToOne(targetEntity = Department.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", foreignKey = @ForeignKey(name = "FK_DEPARTMENT_EMPLOYEEID"))
    private Department department;

    @ManyToMany (targetEntity = Course.class, fetch = FetchType.LAZY)
    @JoinTable(name = "employee_course_mapping", foreignKey = @ForeignKey(name = "FK_JT_EMPLOYEE_COURSE_MAPPING"))
    private List<Course> courseList;
}
