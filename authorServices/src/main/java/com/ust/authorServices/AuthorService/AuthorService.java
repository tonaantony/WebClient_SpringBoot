package com.ust.authorServices.AuthorService;

import com.ust.authorServices.AuthorRepo.AuthorRepo;
import com.ust.authorServices.dto.Authordto;
import com.ust.authorServices.dto.Bookdto;
import com.ust.authorServices.dto.Responsedto;
import com.ust.authorServices.model.AuthorInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepo authorRepo;
    @Autowired
    private WebClient webClient;

    public AuthorInfo addAuthor(AuthorInfo author){
        return authorRepo.save(author);
    }
    public List<AuthorInfo> getAllAuthors(){
        return authorRepo.findAll();
    }
    public Responsedto getAuthorById(int aid){
        Responsedto resp = new Responsedto();
        AuthorInfo author = authorRepo.findById(aid).orElse(null);
        Authordto authorDto = mapToAuthordto(author);
        List<Bookdto> bookDto = webClient.get().
                uri("http://localhost:8081/book/"+author.getAid()).
                retrieve().
                bodyToMono(new ParameterizedTypeReference<List<Bookdto>>(){})
                .block();
        resp.setAuthordto(authorDto);
        resp.setBookdto(bookDto);
        return resp;
    }
    private Authordto mapToAuthordto(AuthorInfo author){
        Authordto auth = new Authordto();
        auth.setAid(author.getAid());
        auth.setName(author.getName());
        auth.setEmail(author.getEmail());
        auth.setPhone(author.getPhone());
        return auth;
    }
}
