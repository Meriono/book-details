package com.graphqljava.tutorial.bookdetails;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.graphqljava.tutorial.bookdetails.f2db.SmallFuInfo;
import com.graphqljava.tutorial.bookdetails.services.authorService;
import com.graphqljava.tutorial.bookdetails.services.bookService;
import com.graphqljava.tutorial.bookdetails.services.fuService;
import com.graphqljava.tutorial.bookdetails.testdb.Authors;
import com.graphqljava.tutorial.bookdetails.testdb.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import graphql.schema.DataFetcher;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class GraphQLDataFetchers {

//    @Autowired
//    private bookService bookService2;
//
//    @Autowired
//    private authorService authorService2;

    @Autowired
    private fuService fuService2;

    Type type = new TypeToken<Map<String, String>>() {}.getType();

//    private List<Map<String, String>> getBooks() {
//        Iterable<Books> dbBooks = bookService2.getAll();
//        List<Map<String, String>> books = new ArrayList<>();
//
//        System.out.println(dbBooks);
//
//        dbBooks.forEach((books1 -> {
//            Gson gson = new Gson();
//            String json = gson.toJson(books1);
//            Map<String, String> myMap = gson.fromJson(json, type);
//
//            books.add(myMap);
//        }));
//
//        return books;
//    }
//
//    private List<Map<String, String>> getAuthors() {
//        Iterable<Authors> dbAuthors = authorService2.getAll();
//        List<Map<String, String>> author = new ArrayList<>();
//
//        dbAuthors.forEach((authors1 -> {
//            Gson gson = new Gson();
//            String json = gson.toJson(authors1);
//            Map<String, String> myMap = gson.fromJson(json, type);
//
//            author.add(myMap);
//        }));
//
//        return author;
//    }

    private List<Map<String, String>> getSmallFu(String objnr) {
        List<SmallFuInfo> dbSmallFu = new ArrayList<>();

        Iterable<Object[]> o = fuService2.getAllByObjnr(objnr);

        o.forEach(objects ->
                dbSmallFu.add(new SmallFuInfo(objects))
                );

        List<Map<String, String>> smallFu = new ArrayList<>();

        dbSmallFu.forEach((fus1 -> {
            Gson gson = new Gson();
            String json = gson.toJson(fus1);
            Map<String, String> myMap = gson.fromJson(json, type);

            smallFu.add(myMap);

        }));

        return smallFu;
    }

//    public DataFetcher getBookByIdDataFetcher() {
//        return dataFetchingEnvironment -> {
//            String bookId = dataFetchingEnvironment.getArgument("id");
//            return getBooks()
//                    .stream()
//                    .filter(book -> book.get("id").equals(bookId))
//                    .findFirst()
//                    .orElse(null);
//        };
//    }
//
//    public DataFetcher getAuthorDataFetcher() {
//        return dataFetchingEnvironment -> {
//            Map<String,String> book = dataFetchingEnvironment.getSource();
//            String authorId = book.get("author_id");
//            return getAuthors()
//                    .stream()
//                    .filter(author -> author.get("id").equals(authorId))
//                    .findFirst()
//                    .orElse(null);
//        };
//    }


    public DataFetcher getFuByObjnrDataFetcher() {
        return dataFetchingEnvironment -> {
            String objnr = dataFetchingEnvironment.getArgument("objnr");
            return getSmallFu(objnr);

        };
    }
}
