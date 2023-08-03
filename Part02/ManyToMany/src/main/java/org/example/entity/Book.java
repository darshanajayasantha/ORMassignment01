package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Book {
    @Id
    private String bId;
    private String title;
    private Double price;

    @ManyToMany(mappedBy = "books")
    private List<Author> authorList;

    public Book(String bId, String title, Double price, List<Author> authorList) {
        this.bId = bId;
        this.title = title;
        this.price = price;
        this.authorList = authorList;
    }

    public Book() {
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }
}
