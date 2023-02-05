package com.ecommerce.Product.Controller;

import com.ecommerce.Product.Dao.ProductDao;
import com.ecommerce.Product.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

public class ProductController {

    @Autowired
    ProductDao productDao;

    @GetMapping(value = "/Produits")
    public List<Product> listeDesProduits(){

        List<Product> products = productDao.findAll();
        return products;

    }

    @GetMapping( value = "/Produits/{id}")
    public Optional<Product> recupererUnProduit(@PathVariable int id) {

        Optional<Product> product = productDao.findById(id).stream().findFirst();
        return product;
    }

    @PostMapping(value = "/produit")
        Product newProduct(@RequestBody Product newProduct) {
        productDao.save(newProduct);
        return newProduct;
    }
}