package com.ust.bookservices.controller;

import com.ust.bookservices.model.Book;
import com.ust.bookservices.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }
    @GetMapping("/get")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @GetMapping("/get/{aid}")
    public List<Book> getBookByAid(@PathVariable("aid") int aid){
        return bookService.getBookByAid(aid);
    }
}
