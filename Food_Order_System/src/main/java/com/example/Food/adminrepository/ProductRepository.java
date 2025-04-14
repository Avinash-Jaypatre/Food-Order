package com.example.Food.adminrepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Food.adminentity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

