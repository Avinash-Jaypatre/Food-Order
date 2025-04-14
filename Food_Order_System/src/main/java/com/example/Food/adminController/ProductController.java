package com.example.Food.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ProductController {

    @GetMapping("/AddProduct")
    public String AddProduct() {
        return "Admin/AddProduct";  // maps to Admin/AddProduct.jsp
    }

    @PostMapping("/AddProduct")
    public String saveProduct(@RequestParam("product-name") String name,
                              @RequestParam("price") double price,
                              @RequestParam("quantity") int quantity,
                              @RequestParam("description") String description,
                              @RequestParam("product-image") MultipartFile imageFile) {
        // Save product to database logic here
        return "redirect:/AddProduct?success"; // Redirect after saving
    }
}
