package com.bmsoft.productmicroservice.controller;

import com.bmsoft.productmicroservice.entity.ProductEntity;
import com.bmsoft.productmicroservice.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private IProductRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ProductEntity createProduct(@RequestBody ProductEntity product){
        return productRepository.save(product);
    }

}