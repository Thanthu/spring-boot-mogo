package com.thanthu.springbootmogo.services;

import java.util.List;

import com.thanthu.springbootmogo.commands.ProductForm;
import com.thanthu.springbootmogo.domain.Product;

public interface ProductService {
	
	List<Product> listAll();

	Product getById(String id);

	Product saveOrUpdate(Product product);

	void delete(String id);

	Product saveOrUpdateProductForm(ProductForm productForm);
	
}
