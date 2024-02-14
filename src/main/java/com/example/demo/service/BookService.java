package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.entity.BookEntity;
import com.example.demo.repo.BookRepo;


@Service
public class BookService {
    private final BookRepo repo;

    public BookService(BookRepo repo) {
        this.repo = repo;
    }

    public void save(BookEntity book) {
        repo.save(book);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Iterable<BookEntity> getAll() {
        return repo.findAll();
    }
}