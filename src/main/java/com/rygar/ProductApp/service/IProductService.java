package com.rygar.ProductApp.service;

import com.rygar.ProductApp.model.Product;

import java.util.List;

public interface IProductService {


    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product productDetails);
    String deleteProduct(Long id);

}
