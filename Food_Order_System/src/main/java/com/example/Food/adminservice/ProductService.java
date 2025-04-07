package com.example.Food.adminservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.Food.adminentity.Product;
import com.example.Food.adminrepository.ProductRepository;

import java.io.IOException;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    /**
     * Saves a product to the database.
     *
     * @param product   The product to be saved.
     * @param imageFile The image file associated with the product.
     * @throws IOException If an error occurs while processing the image file.
     */
    public void saveProduct(Product product, MultipartFile imageFile) throws IOException {
        // Check if the image file is not empty and set it to the product
        if (imageFile != null && !imageFile.isEmpty()) {
            product.setImage(imageFile.getBytes());
        }
        // Save the product to the database
        productRepository.save(product);
    }
}