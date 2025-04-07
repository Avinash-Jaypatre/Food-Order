package com.example.Food.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Food.Entity.User;
import com.example.Food.Service.UserService;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registration"; // This should point to your registration.html
    }

    @PostMapping
    public String registerUser (User user) {
        userService.registerUser (user);
        return "redirect:/login"; // Redirect to login page after registration
    }
}
