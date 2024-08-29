package com.example.service;

import com.example.domain.Book;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    public Optional<Book> filter(String filter, List<Book> books) {
        return books.stream()
                .filter(book -> book.getSummary().contains(filter) || book.getAuthor().getBio().contains(filter))
                .max(Comparator.comparing(Book::getPublicationTimestamp));
    }
}