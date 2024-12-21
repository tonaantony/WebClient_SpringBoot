package com.ust.bookservices.service;

import com.ust.bookservices.model.Book;
import com.ust.bookservices.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book){
        return bookRepository.save(book);
    }
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    public List<Book> getBookByAid(int aid){
        return bookRepository.findBookByAid(aid);
    }
}
