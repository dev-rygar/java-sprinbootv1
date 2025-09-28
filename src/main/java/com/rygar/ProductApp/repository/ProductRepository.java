package com.rygar.ProductApp.repository;

import com.rygar.ProductApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Annotation that treats this class as Repository Layer
public interface ProductRepository extends JpaRepository<Product, Long> {



}
