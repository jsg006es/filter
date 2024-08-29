package com.example.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Book {
    private Integer id;
    private String title;
    private Timestamp publicationTimestamp;
    private Integer pages;
    private String summary;
    private Author author;
}
