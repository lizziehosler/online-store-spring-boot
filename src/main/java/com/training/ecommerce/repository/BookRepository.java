package com.training.ecommerce.repository;

import com.training.ecommerce.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
