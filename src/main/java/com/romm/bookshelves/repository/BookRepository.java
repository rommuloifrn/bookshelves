package com.romm.bookshelves.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romm.bookshelves.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
