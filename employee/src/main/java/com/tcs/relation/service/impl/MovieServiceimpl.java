package com.tcs.relation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.employee.entity.Movie;
import com.tcs.relation.repo.MovieRepo;
import com.tcs.relation.service.MovieService;


@Service
public class MovieServiceimpl implements MovieService {
	
	@Autowired
	MovieRepo movieRepo;

	@Override
	public void save(Movie movie) {
		movieRepo.save(movie);

	}

	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return movieRepo.findAll();
	}

}