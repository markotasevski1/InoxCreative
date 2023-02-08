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

  //Lista od kategorii
    public static List<Category> categories = new ArrayList<>();

    //Za sekoj vid na masini se pravi lista od Machine
    public static List<Machine> polnilici=new ArrayList<>();
    public static List<Machine> pakerki=new ArrayList<>();
  public static List<Machine> etiketirki=new ArrayList<>();
  public static List<Machine> zbirnoPakuvanje=new ArrayList<>();
  public static List<Machine> razni=new ArrayList<>();

    @PostConstruct
      public void init() {
      //Polnilici masini
      Machine machine1=new Machine(1,"Полу автоматски полнилици","descriptionTest",2020,"slika1.jpg");
      Machine machine2=new Machine(1,"Полу автоматски полнилици со 2 глави","descriptionTest",2020,"slika1.jpg");
      Machine machine3=new Machine(1,"Полу автоматски полнилици со 4 глави","descriptionTest",2020,"slika1.jpg");
      Machine machine4=new Machine(1,"Полу автоматски полнилици со голема запремина","descriptionTest",2020,"slika1.jpg");


      //Pakerki
        Machine machine5=new Machine(2,"Полу автоматски пакерки","descriptionTest",2020,"slika2.jpg");
        Machine machine6=new Machine(3,"Автоматска вертикална пакерка","descriptionTest",2020,"slika3.jpg");
        Machine machine7=new Machine(4,"Дозери за зрнасти производи","descriptionTest",2020,"slika4.jpg");

        //Etiketirki
      Machine machine8=new Machine(2,"Полу автоматски етикетирки","descriptionTest",2020,"slika2.jpg");
      Machine machine9=new Machine(2,"Хоризонтални етикетирки","descriptionTest",2020,"slika2.jpg");
      Machine machine10=new Machine(2,"Автоматски етикетирки со една глава","descriptionTest",2020,"slika2.jpg");
      Machine machine11=new Machine(2,"Автоматски етикетирки со две глави","descriptionTest",2020,"slika2.jpg");
      Machine machine12=new Machine(2,"Етикетирки по ваша желба","descriptionTest",2020,"slika2.jpg");

      //Zbirno pakuvanje
      Machine machine13=new Machine(2,"Миксер за месо","descriptionTest",2020,"slika2.jpg");
      Machine machine14=new Machine(2,"Генератор за пареа","descriptionTest",2020,"slika2.jpg");
      Machine machine15=new Machine(2,"Машини за тутун","descriptionTest",2020,"slika2.jpg");

      //Razni masini
      Machine machine16=new Machine(2,"Тунел за шринк етикети","descriptionTest",2020,"slika2.jpg");
      Machine machine17=new Machine(2,"Тунел за флаши","descriptionTest",2020,"slika2.jpg");
      Machine machine18=new Machine(2,"Мини тунел за флаши","descriptionTest",2020,"slika2.jpg");

// In this part we add Machines into list of machines they belong
      polnilici.add(machine1);
      polnilici.add(machine2);
      polnilici.add(machine3);
      polnilici.add(machine4);

        pakerki.add(machine5);
      pakerki.add(machine6);
      pakerki.add(machine7);

        etiketirki.add(machine8);
      etiketirki.add(machine9);
      etiketirki.add(machine10);
      etiketirki.add(machine11);
      etiketirki.add(machine12);

        zbirnoPakuvanje.add(machine13);
      zbirnoPakuvanje.add(machine14);
      zbirnoPakuvanje.add(machine15);

      razni.add(machine16);
      razni.add(machine17);
      razni.add(machine18);


      Category category1=new Category(1,"Разни машини",razni);
        Category category2=new Category(2,"Машини за збирно пакување",zbirnoPakuvanje);
        Category category3=new Category(3,"Етикетирки",etiketirki);
        Category category4=new Category(4,"Пакерки",pakerki);
        Category category5=new Category(5,"Полнилици",polnilici);

        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        categories.add(category4);
        categories.add(category5);



    }

}

