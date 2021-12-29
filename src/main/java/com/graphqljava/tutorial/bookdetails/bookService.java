package com.graphqljava.tutorial.bookdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookService {

    @Autowired
    private booksRepo booksRepo;

    public Iterable<Books> getAll(){ return  booksRepo.findAll();}
}
