package com.wipro.productmngt.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wipro.productmngt.entity.ProductManagement;

public interface ProductService {
	
	void save(ProductManagement productmanagement);
	List<ProductManagement> findAll();
	ProductManagement findById(int id);
	void deleteById(int id);
	
	List<ProductManagement> findByProductNameOrderByProductMakeDesc(String productName);
	Page<ProductManagement>  findAll(Pageable p); 
	

}
