package com.graphqljava.tutorial.bookdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class authorService {

    @Autowired
    private authorRepo authorRepo;

    public Iterable<Authors> getAll(){ return  authorRepo.findAll();}

    public Optional<Authors> findAuthorById(Integer id){return authorRepo.findById(id);}
}
