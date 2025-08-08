package com.tcs.employee.entity;

import java.awt.print.Book;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import lombok.Data;


@Entity
@Table(name="genre")
@Data
public class Genre {

		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		int id;
		
		@Column(name="description")
		String description;
		

	}