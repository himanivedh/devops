package com.niit.devops.service;

import java.util.List;

import com.niit.devops.model.Product;

public interface ProductService {
	void saveOrUpdateProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(int id);

    void deleteProduct(int id);

}
