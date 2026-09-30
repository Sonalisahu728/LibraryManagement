package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String genre;
    private boolean available;

    public Book() {}

    public Book(Long id, String title, String author, String genre, boolean available) {
        this.id        = id;
        this.title     = title;
        this.author    = author;
        this.genre     = genre;
        this.available = available;
    }

    public Long    getId()       { return id; }
    public String  getTitle()    { return title; }
    public String  getAuthor()   { return author; }
    public String  getGenre()    { return genre; }
    public boolean isAvailable() { return available; }

    public void setId(Long id)               { this.id = id; }
    public void setTitle(String title)       { this.title = title; }
    public void setAuthor(String author)     { this.author = author; }
    public void setGenre(String genre)       { this.genre = genre; }
    public void setAvailable(boolean available) { this.available = available; }
}