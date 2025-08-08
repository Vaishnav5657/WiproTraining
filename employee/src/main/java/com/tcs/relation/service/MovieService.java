package com.tcs.relation.service;

import java.util.List;

import com.tcs.employee.entity.Movie;

public interface MovieService {
	
	void save(Movie movie);
	List<Movie> findAll();

}
