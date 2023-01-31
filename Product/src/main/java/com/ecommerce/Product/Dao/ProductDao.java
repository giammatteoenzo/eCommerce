package com.ecommerce.Product.Dao;

import com.ecommerce.Product.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface ProductDao extends JpaRepository<Product, Integer> { }
