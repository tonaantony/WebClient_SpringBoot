package com.ust.authorServices.controller;

import com.ust.authorServices.AuthorService.AuthorService;
import com.ust.authorServices.dto.Responsedto;
import com.ust.authorServices.model.AuthorInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @PostMapping("/add")
    public AuthorInfo addAuthor(AuthorInfo author){
        return authorService.addAuthor(author);
    }
    @GetMapping("/get")
    public List<AuthorInfo> getAllAuthors(){
        return authorService.getAllAuthors();
    }
    @GetMapping("/get/{aid}")
    public ResponseEntity<Responsedto> getAuthorById(@PathVariable("aid") int aid){
        return ResponseEntity.ok(authorService.getAuthorById(aid));
    }
}
