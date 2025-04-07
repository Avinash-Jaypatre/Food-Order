package com.example.Food.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Food.Entity.Order; // Make sure to create this entity
import com.example.Food.Service.OrderService; // Make sure to create this service

@Controller
@RequestMapping("/BuyNow")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public String showOrderForm(Model model) {
        model.addAttribute("order", new Order());
        return "BuyNow"; // This should point to your order.html
    }

    @PostMapping
    public String placeOrder(Order order) {
        orderService.saveOrder(order);
        return "redirect:/confirmation"; // Redirect to a confirmation page after placing the order
    }
}