package com.example.inoks.repository;

import com.example.inoks.data.DataHolder;
import com.example.inoks.model.Category;
import com.example.inoks.model.Machine;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryMachineRepo {
    public List<Machine> findAll() {
        return DataHolder.machines1;
    }

    public Optional<Machine> findById(Integer id) {
        return DataHolder.machines1.stream().filter(r->r.getId().equals(id)).findFirst();
    }
    public Optional<Machine> findByName(String name) {
        return DataHolder.machines1.stream().filter(r->r.getName().equals(name)).findFirst();
    }

}
