package com.efronius.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.efronius.entity.Product;

@Service
public class ProductService {
    
    private static List<Product> products = Arrays.asList(
        new Product(1L, "001", "Produk-001", 1000.0),
        new Product(2L, "002", "Produk-002", 2000.0),
        new Product(3L, "003", "Produk-003", 3000.0),
        new Product(4L, "004", "Produk-004", 4000.0),
        new Product(5L, "005", "Produk-005", 5000.0)
    );

    public List<Product> findAll(){
        return products;
    }
}
