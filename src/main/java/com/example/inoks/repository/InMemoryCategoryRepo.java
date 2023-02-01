package com.example.inoks.repository;

import com.example.inoks.data.DataHolder;
import com.example.inoks.model.Category;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class InMemoryCategoryRepo {
    public List<Category> findAll() {
        return DataHolder.categories;
    }

    public Category findById(Integer id) {
        return  DataHolder.categories.stream().filter(r->r.getId().equals(id)).findFirst().orElseThrow(()->new RuntimeException());
    }
    public Category findByName(String name) {
        return DataHolder.categories.stream().filter(r->r.getName().equals(name)).findFirst().orElseThrow(()->new RuntimeException());
    }



}
