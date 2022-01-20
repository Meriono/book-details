package com.graphqljava.tutorial.bookdetails;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.graphqljava.tutorial.bookdetails.f2db.FuDTO;
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

    @Autowired
    private bookService bookService2;

    @Autowired
    private authorService authorService2;

    @Autowired
    private fuService fuService2;

    Type type = new TypeToken<Map<String, String>>() {}.getType();

    private List<Map<String, String>> getBooks() {
        Iterable<Books> dbBooks = bookService2.getAll();
        List<Map<String, String>> books = new ArrayList<>();

        System.out.println(dbBooks);

        dbBooks.forEach((books1 -> {
            Gson gson = new Gson();
            String json = gson.toJson(books1);
            Map<String, String> myMap = gson.fromJson(json, type);

            books.add(myMap);
        }));

        return books;
    }

    private List<Map<String, String>> getAuthors() {
        Iterable<Authors> dbAuthors = authorService2.getAll();
        List<Map<String, String>> author = new ArrayList<>();

        dbAuthors.forEach((authors1 -> {
            Gson gson = new Gson();
            String json = gson.toJson(authors1);
            Map<String, String> myMap = gson.fromJson(json, type);

            author.add(myMap);
        }));

        return author;
    }

    private List<Map<String, String>> getFus() {
        Iterable<FuDTO> dbFus = fuService2.getAlls();
        List<Map<String, String>> fus = new ArrayList<>();

        System.out.println(dbFus);

        dbFus.forEach((fus1 -> {
            Gson gson = new Gson();
//            String json = gson.toJson(fus1);
//            Map<String, String> myMap = gson.fromJson(json, type);
//
//            fus.add(myMap);

        }));

        return fus;
    }

//    private static List<Map<String, String>> books = Arrays.asList(
//            ImmutableMap.of("id", "book-1",
//                    "name", "Harry Potter and the Philosopher's Stone",
//                    "pageCount", "223",
//                    "authorId", "author-1"),
//            ImmutableMap.of("id", "book-2",
//                    "name", "Moby Dick",
//                    "pageCount", "635",
//                    "authorId", "author-2"),
//            ImmutableMap.of("id", "book-3",
//                    "name", "Interview with the vampire",
//                    "pageCount", "371",
//                    "authorId", "author-3")
//    );
//
//    private static List<Map<String, String>> authors = Arrays.asList(
//            ImmutableMap.of("id", "author-1",
//                    "firstName", "Joanne",
//                    "lastName", "Rowling"),
//            ImmutableMap.of("id", "author-2",
//                    "firstName", "Herman",
//                    "lastName", "Melville"),
//            ImmutableMap.of("id", "author-3",
//                    "firstName", "Anne",
//                    "lastName", "Rice")
//    );

    public DataFetcher getBookByIdDataFetcher() {
        return dataFetchingEnvironment -> {
            String bookId = dataFetchingEnvironment.getArgument("id");
            return getBooks()
                    .stream()
                    .filter(book -> book.get("id").equals(bookId))
                    .findFirst()
                    .orElse(null);
        };
    }

    public DataFetcher getAuthorDataFetcher() {
        return dataFetchingEnvironment -> {
            Map<String,String> book = dataFetchingEnvironment.getSource();
            String authorId = book.get("author_id");
            return getAuthors()
                    .stream()
                    .filter(author -> author.get("id").equals(authorId))
                    .findFirst()
                    .orElse(null);
        };
    }
// Om Map skulle vara "totalPages" istället för "pageCount" som i schemat behövs nedanstående för att hämta ut korrekt data.
//
//    public DataFetcher getPageCountDataFetcher() {
//        return dataFetchingEnvironment -> {
//            Map<String,String> book = dataFetchingEnvironment.getSource();
//            return book.get("totalPages");
//        };
//    }


    public DataFetcher getFuByObjnrDataFetcher() {
        return dataFetchingEnvironment -> {
            String fuObjnr = dataFetchingEnvironment.getArgument("fuObjnr");
            return getFus()
                    .stream()
                    .filter(fu -> fu.get("fuObjnr").equals(fuObjnr))
                    .findFirst()
                    .orElse(null);
        };
    }
}
