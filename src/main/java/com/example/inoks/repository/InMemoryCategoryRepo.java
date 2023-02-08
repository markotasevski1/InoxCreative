package com.example.inoks.repository;

import com.example.inoks.data.DataHolder;
import com.example.inoks.model.Category;
import com.example.inoks.model.Machine;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.example.inoks.data.DataHolder.*;

@Repository
public class InMemoryCategoryRepo {
    public List<Category> findAll() {
        return categories;
    }

    public Category findById(Integer id) {
        return  categories.stream().filter(r->r.getId().equals(id)).findFirst().orElseThrow(()->new RuntimeException());
    }
    public Category findByName(String name) {
        return categories.stream().filter(r->r.getName().equals(name)).findFirst().orElseThrow(()->new RuntimeException());
    }
public List<Machine> returnMachinesFromCategory(Integer id)
{
    Category category=findById(id);
    List<Machine> machinesFromCategory=category.machineList;
    return machinesFromCategory;
}
public List<Machine> listAllMachines()
{
    List<Machine> allmachines=polnilici;
    allmachines.addAll(pakerki);
return allmachines;

}


}
