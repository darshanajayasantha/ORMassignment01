package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Author {
    @Id
    private String aId;
    private String name;

    public Author(String aId, String name) {
        this.aId = aId;
        this.name = name;
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
}
