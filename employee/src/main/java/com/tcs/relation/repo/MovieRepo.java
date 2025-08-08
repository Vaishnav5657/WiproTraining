package com.tcs.relation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.employee.entity.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

}
