package com.example.Food.adminController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;

import com.example.Food.adminentity.Product;
import com.example.Food.adminservice.ProductService;

import java.io.IOException;
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/AddProduct")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "AddProduct"; // This should match the name of your HTML file (without .html)
    }

    @PostMapping("/AddProduct")
    public String addProduct(Product product, MultipartFile image, AbstractMultipartHttpServletRequest request) {
        try {
            productService.saveProduct(product, image);
        } catch (IOException e) {
            e.printStackTrace();
            return "error"; // Handle error appropriately
        }
        return "redirect:/AddProduct"; // Redirect after successful submission
    }
}