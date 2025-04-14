package com.example.Food.adminController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Food.Service.OrderService;
import com.example.Food.Entity.Order;

import java.util.List;

@Controller
@RequestMapping("/admin/orders")
public class Orcontroller {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public String viewOrders(Model model) {
        List<Order> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        return "Admin/orders"; // This will look for templates/Admin/orders.html
    }
}
