package com.wipro.productmngt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Product_Management")
public class ProductManagement {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		int id;
		
		@Column(name="Product_Management_name")
		String productName;
		
		@Column(name="Product_Management_make")
		String productMake;
		
		@Column(name="Product_Management_price")
		String productPrice;

		

		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getProductName() {
			return productName;
		}



		public void setProductName(String productName) {
			this.productName = productName;
		}



		public String getProductMake() {
			return productMake;
		}



		public void setProductMake(String productMake) {
			this.productMake = productMake;
		}



		public String getProductPrice() {
			return productPrice;
		}



		public void setProductPrice(String productPrice) {
			this.productPrice = productPrice;
		}



		@Override
		public String toString() {
			return "ProductManagement [id=" + id + ", productName=" + productName + ", productMake="
					+ productMake + ", productPrice=" +  productPrice+ "]";
		} 
		}
		
		

