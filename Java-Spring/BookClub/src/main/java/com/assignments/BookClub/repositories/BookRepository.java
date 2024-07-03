package com.assignments.BookClub.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignments.BookClub.models.Book;
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

	
}
