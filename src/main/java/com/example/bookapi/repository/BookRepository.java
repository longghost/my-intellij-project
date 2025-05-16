package com.example.bookapi.repository;

import com.example.bookapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByGenreIgnoreCase(String genre);
    List<Book> findByAuthorIgnoreCase(String author);
    List<Book> findByGenreIgnoreCaseAndAuthorIgnoreCase(String genre, String author);
}