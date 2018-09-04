package com.bookstore.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookstore.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
	@Query("select b from Book b")
	public Set<Book> getAll();

	@Query("select b from Book b where price < ?1 order by price asc")
	public Set<Book> getCheapBooksHQL(Long maxPrice);
	
	@Query(value = "select * from BOOK where price < ?1 order by price asc", nativeQuery = true)
	public Set<Book> getCheapBooksSQL(Long maxPrice);
}
