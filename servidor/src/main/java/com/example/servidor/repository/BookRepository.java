// repository/BookRepository.java
package com.example.servidor.repository;

import com.example.servidor.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
