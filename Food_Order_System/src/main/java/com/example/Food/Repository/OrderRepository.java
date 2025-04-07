package com.example.Food.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Food.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}