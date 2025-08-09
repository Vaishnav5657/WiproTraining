package com.wipro.productmngt.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.productmngt.entity.ProductManagement;
import org.springframework.stereotype.Repository;


@Repository
public interface Productrepo extends JpaRepository<ProductManagement, Integer> {
	
	List<ProductManagement> findByProductNameOrderByProductMakeDesc(String productName);
	Page<ProductManagement>  findAll(Pageable p); 


}
