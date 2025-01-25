package com.ecomerce.product_service.service;


import com.ecomerce.product_service.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    Boolean findProduct(Long id);
    void deleteProduct(Long id);
}
