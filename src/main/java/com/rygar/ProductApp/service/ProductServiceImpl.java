package com.rygar.ProductApp.service;

import com.rygar.ProductApp.model.Product;
import com.rygar.ProductApp.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service // Treats as service
@Slf4j
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found."));
    }

    @Override
    public Product createProduct(Product product) {
        log.info("createProduct() was hit");
        return productRepository.save(product);
    }

    @Override
    @Transactional
    public Product updateProduct(Long id, Product productDetails) {
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found."));

        if(productDetails.getName() != null) existingProduct.setName(productDetails.getName());
        if(productDetails.getDescription() != null) existingProduct.setDescription(productDetails.getDescription());
        if(productDetails.getPrice() != null) existingProduct.setPrice(productDetails.getPrice());
        if(productDetails.getQuantity() > 0) existingProduct.setQuantity(productDetails.getQuantity());

        return productRepository.save(existingProduct);
    }

    @Override
    public String deleteProduct(Long id) {
        if(productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return "Product deleted successfully";
        } else {
            throw new RuntimeException("Product does not exist");
        }
    }
}
