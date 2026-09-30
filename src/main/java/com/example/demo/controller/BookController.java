package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "*")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> getAll() { return service.getAll(); }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Long id) { return service.getById(id); }

    @PostMapping
    public Book create(@RequestBody Book book) { return service.save(book); }

    @PutMapping("/{id}")
    public Book update(@PathVariable Long id, @RequestBody Book book) {
        return service.update(id, book);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Book deleted";
    }
}