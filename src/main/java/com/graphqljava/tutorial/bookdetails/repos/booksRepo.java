package com.graphqljava.tutorial.bookdetails.repos;

import com.graphqljava.tutorial.bookdetails.testdb.Books;
import org.springframework.data.repository.CrudRepository;

public interface booksRepo extends CrudRepository<Books, Integer> {

}
