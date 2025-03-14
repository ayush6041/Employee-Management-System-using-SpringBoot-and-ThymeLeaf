package com.employeeManagementSystem.EmployeeManagementSystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Admin")
public class Admin {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "username",unique = true)
    private String username;

    @Column(nullable = false, name = "password")
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //Default Constructor

    public Admin() {
    }


    //getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
