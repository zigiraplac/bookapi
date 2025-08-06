package com.placide.bookapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.placide.bookapi.Models.bookModel;

@Repository
public interface bookRepository extends JpaRepository<bookModel, Long> {
  

   
    
}
