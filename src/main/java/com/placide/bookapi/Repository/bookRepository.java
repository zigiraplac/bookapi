package com.placide.bookapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placide.bookapi.Models.bookModel;

public interface bookRepository extends JpaRepository<bookModel, Long> {
    // This interface will automatically provide CRUD operations for bookModel
    // Additional custom query methods can be defined here if needed
    
}
