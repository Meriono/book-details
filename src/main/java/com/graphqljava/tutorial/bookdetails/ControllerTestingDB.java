package com.graphqljava.tutorial.bookdetails;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.graphqljava.tutorial.bookdetails.f2db.Fu;
import com.graphqljava.tutorial.bookdetails.f2db.SmallFuInfo;
import com.graphqljava.tutorial.bookdetails.testdb.Authors;
import com.graphqljava.tutorial.bookdetails.testdb.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

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
    public @ResponseBody Iterable<Object[]> getAllFu(){
        return fuService.getAll();
    }

    @GetMapping(path = "/fu/alls")
    public @ResponseBody Iterable<SmallFuInfo> getAllFus(){
        List<SmallFuInfo> dbSmallFu = new ArrayList<>();

        Iterable<Object[]> o = fuService.getAll();

        o.forEach(objects ->
                dbSmallFu.add(new SmallFuInfo(objects[0].toString(), objects[1].toString(), objects[2].toString(), objects[3].toString()))
        );
        return dbSmallFu;
    }


    @GetMapping(path = "/testing")
    public @ResponseBody String getTest(@PathParam("objnr") String objnr){
        graphQLProvider.printGraphQL(objnr);
        return "hello";
    }
}
