package com.aryaman.service.impl;

import com.aryaman.dto.BookDTO;
import com.aryaman.service.BookService;

import java.util.List;

public class BookServiceImplNew implements BookService {
    @Override
    public List<BookDTO> getAllBooks() {
        return List.of();
    }

    @Override
    public BookDTO getBookById(Long id) {
        return null;
    }

    @Override
    public BookDTO createBook(BookDTO bookDTO) {
        return null;
    }

    @Override
    public BookDTO updateBook(Long id, BookDTO bookDTO) {
        return null;
    }

    @Override
    public void deleteBook(Long id) {

    }
}
