package com.example.inoks.model;

import lombok.Data;
import lombok.Generated;

import java.util.List;

@Data
public class Category {
    @Generated
    public Integer id;
    public String name;
    public List<Machine> machineList;

    public Category(Integer id, String name, List<Machine> machineList) {
this.id=id;
        this.name = name;
        this.machineList = machineList;
    }
}
