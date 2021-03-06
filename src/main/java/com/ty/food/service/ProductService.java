package com.ty.food.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.food.dao.ProductDao;
import com.ty.food.dto.Products;

@Component
public class ProductService {

	@Autowired
	ProductDao productDao ;
	
	public boolean saveProduct(Products product) {
		return productDao.saveProduct(product) ;
	}
	
	public boolean deletProduct(int id) {
		return productDao.deletProduct(id) ;
	}
	
	public boolean updateProduct(int id ,Products products) {
		return productDao.updateProduct(id, products) ;
	}
	
	public List<Products> getAllProducts(){
		return productDao.getAllProducts();
	}
	
	public Products getProductById(int id){
		return productDao.getProductById(id) ;
	}
}
