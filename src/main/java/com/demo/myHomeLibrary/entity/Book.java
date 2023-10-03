package com.demo.myHomeLibrary.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToMany
    @JoinColumn(name = "category_id", nullable = false)
    private BookCategory category;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "author")
    private String author;

    @Column(name = "language")
    private String language;

    @Column(name = "pages")
    private float pages;

    @Column(name = "image_url")
    private String imageUrl;

//    @Column(name = "categoryId")
//    private Long categoryId;
}
