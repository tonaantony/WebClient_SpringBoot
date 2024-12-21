package com.ust.authorServices.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
public class Responsedto {
    private Authordto authordto;
    private List<Bookdto> bookdto;

    public Authordto getAuthordto() {
        return authordto;
    }

    public void setAuthordto(Authordto authordto) {
        this.authordto = authordto;
    }

    public List<Bookdto> getBookdto() {
        return bookdto;
    }

    public void setBookdto(List<Bookdto> bookdto) {
        this.bookdto = bookdto;
    }
}