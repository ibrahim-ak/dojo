package com.assignments.BookClub.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.BookClub.models.Book;
import com.assignments.BookClub.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository bookrepo;

	public Book createBook(Book book) {

		return bookrepo.save(book);

	}
	public Book updateBook(Book book) {

		return bookrepo.save(book);

	}
	public Iterable<Book> findall() {
		return bookrepo.findAll();

	}

	public Book findById(Long id) {
		Optional<Book> book = bookrepo.findById(id);
		if (book.isPresent()) {
			return book.get();
		} else {
			return null;
		}}
public void deletebook(Long id) {
	Book book1=	findById(id);
	bookrepo.delete(book1);
}
	}