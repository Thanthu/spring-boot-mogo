package com.thanthu.springbootmogo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thanthu.springbootmogo.commands.ProductForm;
import com.thanthu.springbootmogo.converters.ProductFormToProduct;
import com.thanthu.springbootmogo.domain.Product;
import com.thanthu.springbootmogo.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;
	private final ProductFormToProduct productFormToProduct;

	public ProductServiceImpl(ProductRepository productRepository, ProductFormToProduct productFormToProduct) {
		this.productRepository = productRepository;
		this.productFormToProduct = productFormToProduct;
	}

	@Override
	public List<Product> listAll() {
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}

	@Override
	public Product getById(String id) {
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public Product saveOrUpdate(Product product) {
		productRepository.save(product);
		return product;
	}

	@Override
	public void delete(String id) {
		productRepository.deleteById(id);
	}

	@Override
	public Product saveOrUpdateProductForm(ProductForm productForm) {
		Product savedProduct = saveOrUpdate(productFormToProduct.convert(productForm));

		System.out.println("Saved Product Id: " + savedProduct.getId());
		return savedProduct;
	}
}
