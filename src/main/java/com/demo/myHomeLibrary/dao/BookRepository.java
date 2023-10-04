package com.demo.myHomeLibrary.dao;

import com.demo.myHomeLibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
