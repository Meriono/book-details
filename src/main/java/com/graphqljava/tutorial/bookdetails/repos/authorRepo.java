package com.graphqljava.tutorial.bookdetails.repos;

import com.graphqljava.tutorial.bookdetails.testdb.Authors;
import org.springframework.data.repository.CrudRepository;

public interface authorRepo extends CrudRepository<Authors, Integer> {

}
