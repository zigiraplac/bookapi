package com.placide.bookapi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placide.bookapi.Models.bookModel;
import com.placide.bookapi.Repository.bookRepository;
 @Service
public class bookService {
    // This service class can contain

    @Autowired
    private bookRepository bookRepo;

    // Methods to interact with the bookRepository can be added here
    public void saveBook(bookModel book) {
        bookRepo.save(book);
    }
    public bookModel getBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }
    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }
    public List<bookModel> getAllBooks() {
        return bookRepo.findAll();
    }
    public void updateBook(bookModel book) {
        bookRepo.save(book);
    }

}
