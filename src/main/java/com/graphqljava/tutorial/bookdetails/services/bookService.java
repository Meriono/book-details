package com.graphqljava.tutorial.bookdetails.services;

import com.graphqljava.tutorial.bookdetails.testdb.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookService {

    @Autowired
    private com.graphqljava.tutorial.bookdetails.repos.booksRepo booksRepo;

    public Iterable<Books> getAll(){ return  booksRepo.findAll();}
}
