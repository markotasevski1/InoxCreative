package com.example.inoks.service;

import com.example.inoks.model.Category;
import com.example.inoks.model.Machine;
import com.example.inoks.repository.InMemoryCategoryRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final InMemoryCategoryRepo  inMemoryCategoryRepo;

    public CategoryService(InMemoryCategoryRepo inMemoryCategoryRepo) {
        this.inMemoryCategoryRepo = inMemoryCategoryRepo;
    }
    public Category findById(Integer id) {
        return this.inMemoryCategoryRepo.findById(id);
    }
    public Category findByName(String name){
        return this.inMemoryCategoryRepo.findByName(name);
    }
    public List<Machine> listMachinesFromCategory(Integer id)
    {
       return inMemoryCategoryRepo.returnMachinesFromCategory(id);
    }
    public List<Machine> listAllMachines()
    {
        return inMemoryCategoryRepo.listAllMachines();
    }

}
