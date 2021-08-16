package com.thanthu.springbootmogo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.thanthu.springbootmogo.domain.Product;

public interface ProductRepository extends CrudRepository<Product, String> {

}
