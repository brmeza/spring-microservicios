package com.bmsoft.productmicroservice.repository;

import com.bmsoft.productmicroservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProductRepository extends MongoRepository<ProductEntity, String> {



}