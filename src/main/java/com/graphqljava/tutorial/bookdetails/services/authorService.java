package com.graphqljava.tutorial.bookdetails.services;

import com.graphqljava.tutorial.bookdetails.testdb.Authors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class authorService {

    @Autowired
    private com.graphqljava.tutorial.bookdetails.repos.authorRepo authorRepo;

    public Iterable<Authors> getAll(){ return  authorRepo.findAll();}

    public Optional<Authors> findAuthorById(Integer id){return authorRepo.findById(id);}
}
