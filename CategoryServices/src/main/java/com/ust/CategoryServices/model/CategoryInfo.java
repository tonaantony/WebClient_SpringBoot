package com.ust.CategoryServices.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "category")
public class CategoryInfo {
    @Id
    public int cid;
    public String name;
    public int aid;



}