package com.romm.bookshelves.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romm.bookshelves.entity.Book;
import com.romm.bookshelves.service.BookService;

@RestController
@RequestMapping("books") @CrossOrigin
public class BookController {

    @Autowired BookService bookService;
    
    @GetMapping
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @PostMapping(consumes = "application/json")
    public Book save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @PostMapping(consumes = "application/x-www-form-urlencoded")
    public Book saveAlt(Book book) {
        return bookService.save(book);
    }
}
