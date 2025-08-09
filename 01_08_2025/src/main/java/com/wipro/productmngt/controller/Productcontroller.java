package com.wipro.productmngt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.productmngt.entity.ProductManagement;
import com.wipro.productmngt.service.ProductService;

@RestController
@RequestMapping("/product")
public class Productcontroller {
	
	@Autowired
	ProductService productservice;
	
	@PostMapping
	void save(@RequestBody ProductManagement productmanagement)
	{
		productservice.save(productmanagement);
	}
	
	@GetMapping
	List<ProductManagement> findAll()
	{
		return productservice.findAll();
		
	}
	
	
	@GetMapping("/{id}")
	ProductManagement findById(@PathVariable int id)
	{
		return productservice.findById(id);
		
	}
	
	@PutMapping 
	void update(@RequestBody ProductManagement productmanagement)
	{
		productservice.save(productmanagement);
		
	}
	
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id)
	{
		productservice.deleteById(id);
		
	}
	
	@GetMapping("/type")
	List<ProductManagement> findByProductName(@RequestParam String productName)
	{
		return productservice.findByProductNameOrderByProductMakeDesc(productName);
				
	}
	
	@GetMapping("/page")
	public Page<ProductManagement> findAllPage()
	{
		Pageable p= PageRequest.of(0, 10, Sort.by("productPrice").ascending());
		System.out.println(p.getPageSize());
		return productservice.findAll(p);
		
	}
}


