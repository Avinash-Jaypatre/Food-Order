package com.example.Food.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Food.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}

