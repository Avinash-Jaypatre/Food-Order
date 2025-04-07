package com.example.Food.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "contact_messages") // this is your custom table name
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String company;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    private String subject;

    @Column(length = 1000)
    private String message;

    // Constructors
    public Contact() {
    }

    public Contact(String name, String company, String phone, String email, String subject, String message) {
        this.name = name;
        this.company = company;
        this.phone = phone;
        this.email = email;
        this.subject = subject;
        this.message = message;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
