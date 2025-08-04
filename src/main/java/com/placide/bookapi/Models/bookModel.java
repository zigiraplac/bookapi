package com.placide.bookapi.Models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;

@Entity
public class bookModel {
    @NotBlank(message = "Title cannot be blank")
    private String title;
     @NotBlank(message = "Author cannot be blank")
    private String author;
     @NotBlank(message = "ISBN cannot be blank")
    private String isbn;
     @NotBlank(message = "Publication Date cannot be blank")
    private String publicationDate;

    public bookModel() {
        // Default constructor
    }

    public bookModel(String title, String author, String isbn, String publicationDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

}
