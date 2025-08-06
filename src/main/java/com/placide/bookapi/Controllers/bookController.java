package com.placide.bookapi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.placide.bookapi.Services.bookService;
import com.placide.bookapi.Models.bookModel;

@RestController
@RequestMapping("/api/books")
public class bookController {
    @Autowired
    private bookService service;
    @PostMapping("/add")
    public void addBook(@RequestBody bookModel book) {
        service.saveBook(book);
    }
    @GetMapping("/all")
    public List<bookModel> getAllbooks() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    
    public bookModel getBookById(@PathVariable Long id) {
        return service.getBookById(id);
    }

}
