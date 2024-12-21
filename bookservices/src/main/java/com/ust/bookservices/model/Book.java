package com.ust.bookservices.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book_info")
public class Book {
    @Id
    public int bid;
    public String title;
    public int aid;
    public String author;
    public String pubYear;
    public int price;
}
