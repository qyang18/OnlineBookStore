package com.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.entity.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Long>{
	
}
