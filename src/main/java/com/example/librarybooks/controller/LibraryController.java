package com.example.librarybooks.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.librarybooks.model.Book;
import com.example.librarybooks.repository.LibraryRepository;

@RestController
@RequestMapping("/rest")
public class LibraryController {

	@Autowired
	LibraryRepository libraryRepository;
	
	@GetMapping("/all")
	public List<Book> getAllBooks(){
		return libraryRepository.findAll();
	}
	
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable(value="id") Long bookId){
		Book book = libraryRepository.findOne(bookId);
		if(null==book){
			return ResponseEntity.notFound().build();
		}else{
			return ResponseEntity.ok().body(book);
		}
	}
	
	@PostMapping("/book")
	public Book createBook(@Valid @RequestBody Book book){
		return libraryRepository.save(book);
	}
	
	@PutMapping("/book/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable(value="id") Long bookId, @Valid @RequestBody Book book){
		Book book2 = libraryRepository.findOne(bookId);
		if(null==book2){
			return ResponseEntity.notFound().build();
		}else{
			book2.setTitle(book.getTitle());
			return ResponseEntity.ok(libraryRepository.save(book2));
		}
	}
	
	@DeleteMapping("/book/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable(value="id") Long bookId){
		Book book = libraryRepository.findOne(bookId);
		if(null==book){
			return ResponseEntity.notFound().build();
		}else{
			libraryRepository.delete(book);
			return ResponseEntity.ok().build();
		}
	}
}
