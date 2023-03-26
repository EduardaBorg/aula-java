package com.example.projeto.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
    // save() method for creating or updating a product
    Product save(Product product);

    // findById() method for retrieving a product by its ID
    Product findById(long id);

    // findAll() method for retrieving all products
    List<Product> findAll();

    // deleteById() method for deleting a product by its ID
    void deleteById(long id);

}
