package com.example.inoks.data;

import com.example.inoks.model.Category;
import com.example.inoks.model.Machine;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class DataHolder {

    public static List<Category> categories = new ArrayList<>();

    public static List<Machine> machines1=new ArrayList<>();
    public static List<Machine> machines2=new ArrayList<>();

    @PostConstruct
      public void init() {
        Machine machine1=new Machine(1,"test1","descriptionTest",2020);
        Machine machine2=new Machine(2,"test2","descriptionTest",2020);
        Machine machine3=new Machine(3,"test3","descriptionTest",2020);
        Machine machine4=new Machine(4,"test4","descriptionTest",2020);

        machines1.add(machine1);
        machines1.add(machine2);

        machines2.add(machine3);
        machines2.add(machine4);

        Category category1=new Category(1,"Rabni Masini",machines1);
        Category category2=new Category(2,"Masini za zbirno pakuvanje",machines1);
        Category category3=new Category(3,"Etiketirki",machines1);
        Category category4=new Category(4,"Pakerki",machines1);
        Category category5=new Category(5,"Masini polici",machines1);

        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        categories.add(category4);
        categories.add(category5);



    }

}

