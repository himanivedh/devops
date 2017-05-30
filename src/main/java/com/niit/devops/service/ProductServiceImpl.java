package com.niit.devops.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.devops.dao.ProductDao;
import com.niit.devops.model.Product;

@Service
public class ProductServiceImpl implements ProductService{
@Autowired	
private ProductDao productDao;


	public void saveOrUpdateProduct(Product product) {
	   productDao.saveOrUpdateProduct(product);;
		
	}
	@Override
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}
	@Override
	public Product getProductById(int id) {
		return productDao.getProductById(id);
	}
	@Override
	public void deleteProduct(int id) {
		productDao.deleteProduct(id);
		
	}

}