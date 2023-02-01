package com.example.inoks.model;

import lombok.Data;
import lombok.Generated;

@Data
public class Machine {
    @Generated
    public Integer id;
    public String name;
    public String description;
    public Integer yearCreated;

    public Machine( Integer id,String name, String description, Integer yearCreated) {
this.id=id;
        this.name = name;
        this.description = description;
        this.yearCreated = yearCreated;
    }
}
