package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Author {
    @Id
    private String aId;
    private String name;

    @ManyToMany
    private List<Book> books;

    public Author(String aId, String name, List<Book> books) {
        this.aId = aId;
        this.name = name;
        this.books = books;
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

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
