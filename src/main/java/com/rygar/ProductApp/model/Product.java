package com.rygar.ProductApp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

// This class represents our "Product" entity/model that maps to a database table
@Entity
@Table(name="products") // tells JPA/Hibernate to map this class to a table named "products"
@Data // Lombok: generates getters, setters, toString, equals, and hashCode automatically
@AllArgsConstructor // Lombok: generates a constructor with all fields
@NoArgsConstructor  // Lombok: generates a no-arguments constructor
public class Product {

    // Primary Key for the table (each product has a unique ID)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB will auto-generate ID values (e.g., 1, 2, 3…)
    private Long id;

    // "name" column: must be unique + not blank (validation rule)
    @Column(unique = true)
    @NotBlank(message = "Product Name is required") // validation at the API/input level
    private String name;

    // Product description (optional, so no validation rule here)
    private String description;

    // Price uses BigDecimal (preferred type for money values in Java)
    private BigDecimal price;

    // How many units are in stock
    private int quantity;
}
