package com.graphqljava.tutorial.bookdetails;

import com.google.gson.Gson;
import com.graphqljava.tutorial.bookdetails.f2db.Fu;
import com.graphqljava.tutorial.bookdetails.services.fuService;
import com.graphqljava.tutorial.bookdetails.testdb.Authors;
import com.graphqljava.tutorial.bookdetails.testdb.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(path = "/db")
public class ControllerTestingDB {

    @Autowired
    private com.graphqljava.tutorial.bookdetails.services.bookService bookService;

    @Autowired
    private com.graphqljava.tutorial.bookdetails.services.authorService authorService;

    @Autowired
    GraphQLProvider graphQLProvider;

    @Autowired
    private com.graphqljava.tutorial.bookdetails.services.fuService fuService;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Books> getAllBooks(){

        System.out.println(new Gson().toJson(bookService.getAll()));

        return bookService.getAll();
    }

    @GetMapping(path = "/all/a")
    public @ResponseBody Iterable<Authors> getAllAuthors(){
        return authorService.getAll();
    }


    @GetMapping(path = "/fu/all")
    public @ResponseBody String getAllFu(){
        System.out.println(fuService.getAll());
        return "Fu säger hej";
    }

    @GetMapping(path = "/testing")
    public @ResponseBody String getTest(@PathParam("id") Integer id){
        graphQLProvider.printGraphQL(id);
        return "hello";
    }
}
