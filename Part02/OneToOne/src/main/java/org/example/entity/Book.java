package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Book {
    @Id
    private String bId;
    private String title;
    private Double price;

    @OneToOne
    private Author author;

    public Book(String bId, String title, Double price, Author author) {
        this.bId = bId;
        this.title = title;
        this.price = price;
        this.author = author;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
