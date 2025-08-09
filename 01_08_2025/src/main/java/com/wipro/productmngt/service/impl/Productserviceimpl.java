package com.wipro.productmngt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wipro.productmngt.entity.ProductManagement;
import com.wipro.productmngt.repo.Productrepo;
import com.wipro.productmngt.service.ProductService;


@Service
public class Productserviceimpl implements ProductService {
	
	@Autowired
	Productrepo productrepo;

	@Override
	public void save(ProductManagement productmanagement) {
		productrepo.save(productmanagement);

	}

	@Override
	public List<ProductManagement> findAll() {
		return productrepo.findAll();
	}

	@Override
	public ProductManagement findById(int id) {
		Optional<ProductManagement> productmanagement=productrepo.findById(id);
		if(!productmanagement.isEmpty())
		{
			return productmanagement.get();
		}
		return null;

	}

	@Override
	public void deleteById(int id) {
		
		productrepo.deleteById(id);

	}

	@Override
	public List<ProductManagement> findByProductNameOrderByProductMakeDesc(String productName) {
		// TODO Auto-generated method stub
		return productrepo.findByProductNameOrderByProductMakeDesc(productName);
	}
	
	@Override
	public Page<ProductManagement> findAll(Pageable p) {
		return productrepo.findAll(p);
	}
}
