package com.infodevelopers.hibernate.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "department_tbl")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    @Column(name = "short_code", length = 10)
    private String shortname;
    @Column(name = "status")
    private boolean status;

    @OneToMany(targetEntity = Employee.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "Employee_Id", foreignKey = @ForeignKey(name = "FK_DEPARTMENT_EMPLOYEE_ID"))
    private List<Employee> employeeList;
}
