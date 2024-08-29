package com.example.contoller;

import com.example.domain.Book;
import com.example.domain.BookDate;
import com.example.properties.FilterProperties;
import com.example.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/api")
public class FilterController {

    private final BookService bookService;
    private final FilterProperties filterProperties;

    public FilterController(BookService bookService, FilterProperties filterProperties) {
        this.bookService = bookService;
        this.filterProperties = filterProperties;
    }

    @PostMapping("/books")
    public BookDate filterBooks(@RequestBody List<Book> books) {

        booksWithOutTimestamp(books);

        booksSortedByTimestampBio(books);

        Optional<Book> bookFilter = bookService.filter(filterProperties.getFilter(),
                 books.stream().filter(book -> Objects.nonNull(book.getPublicationTimestamp())).toList());

        if (bookFilter.isPresent()){
            Date date = new Date(bookFilter.get().getPublicationTimestamp().getTime() * 1000);
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
            String formattedDate = dateFormat.format(date);
            return new BookDate(bookFilter.get(), formattedDate);
        }

        return new BookDate();
    }

    private void booksWithOutTimestamp(List<Book> books) {
        System.out.println(" ================== Libros sin PublicationTimestamp ================== ");
        books.stream().filter(book -> Objects.isNull(book.getPublicationTimestamp())).forEach(System.out::println);
    }

    private void booksSortedByTimestampBio(List<Book> books) {
        List<Book> sortedBooks = books.stream()
                .filter(book -> Objects.nonNull(book.getPublicationTimestamp()))
                .sorted(Comparator.comparing(Book::getPublicationTimestamp)
                        .thenComparing(book -> book.getAuthor().getBio().length())).toList();

        System.out.println(" ================== Libros ordenados por PublicationTimestamp & Bio ================== ");
        sortedBooks.forEach(System.out::println);
    }
}
