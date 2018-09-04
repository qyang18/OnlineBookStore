package com.bookstore.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String ISBN;

	private String Name;

	private Long price;

//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinColumn
//	@ElementCollection(targetClass=Author.class)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="Author_Id")
	private Set<Author> Authors;

	public Book() {
	}

	public Book(String iSBN, String name, Long price, Set<Author> authors) {
		ISBN = iSBN;
		Name = name;
		this.price = price;
		Authors = authors;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Set<Author> getAuthors() {
		return Authors;
	}

	public void setAuthors(Set<Author> authors) {
		Authors = authors;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}
	
}
