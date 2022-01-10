package com.graphqljava.tutorial.bookdetails;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping(path = "/db")
public class ControllerTestingDB {

    @Autowired
    private bookService bookService;

    @Autowired
    private authorService authorService;

    @Autowired
    GraphQLDataFetchers graphQLDataFetchers;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Books> getAllBooks(){

        System.out.println(new Gson().toJson(bookService.getAll()));

        return bookService.getAll();
    }

    @GetMapping(path = "/all/a")
    public @ResponseBody Iterable<Authors> getAllAuthors(){
        return authorService.getAll();
    }

    @GetMapping(path = "/testing/{id}")
    public @ResponseBody String getTest(@PathParam("id") Integer id){
        graphQLDataFetchers.printGraphQL(id);
        return "hello";
    }
}
