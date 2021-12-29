package com.graphqljava.tutorial.bookdetails;

import javax.persistence.*;

@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String book_name;
    private Integer page_count;

//    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Integer author_id;

    public Books(Integer id, String book_name, Integer page_count, Integer author_id) {
        this.id = id;
        this.book_name = book_name;
        this.page_count = page_count;
        this.author_id = author_id;
    }

    public Books() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String name) {
        this.book_name = name;
    }

    public Integer getPageCount() {
        return page_count;
    }

    public void setPageCount(Integer page_count) {
        this.page_count = page_count;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }
}
