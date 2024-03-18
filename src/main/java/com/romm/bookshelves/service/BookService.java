package com.romm.bookshelves.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romm.bookshelves.entity.Book;
import com.romm.bookshelves.repository.BookRepository;

@Service
public class BookService {

    @Autowired BookRepository bookRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }
}
