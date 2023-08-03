package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Author {
    @Id
    private String aId;
    private String name;

    @OneToMany(mappedBy = "author")
    private List<Book> bookList;

    public Author(String aId, String name, List<Book> bookList) {
        this.aId = aId;
        this.name = name;
        this.bookList = bookList;
    }

    public Author() {
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
