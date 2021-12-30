package com.graphqljava.tutorial.bookdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/db")
public class ControllerTestingDB {

    @Autowired
    private bookService bookService;

    @Autowired
    private authorService authorService;



    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Books> getAllBooks(){
        return bookService.getAll();
    }

    @GetMapping(path = "/all/a")
    public @ResponseBody Iterable<Authors> getAllAuthors(){
        return authorService.getAll();
    }

    @GetMapping(path = "/testing")
    public @ResponseBody String getTest(){
        return "hello";
    }
}
