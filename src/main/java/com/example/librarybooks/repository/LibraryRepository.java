package com.example.librarybooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.librarybooks.model.Book;

@Repository
public interface LibraryRepository extends JpaRepository<Book, Long> {

}
