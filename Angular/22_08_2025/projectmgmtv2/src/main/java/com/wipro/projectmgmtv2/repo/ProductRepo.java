package com.wipro.projectmgmtv2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.projectmgmtv2.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
