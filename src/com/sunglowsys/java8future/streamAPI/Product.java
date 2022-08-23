package com.sunglowsys.java8future.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
class StreamExample{
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(2,"MOBILE",20000));
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(2,"Dell Laptop",30000f));
        list.add(new Product(3,"Lenevo Laptop",28000f));
        list.add(new Product(4,"Sony Laptop",28000f));
        list.add(new Product(5,"Apple Laptop",90000f));

       /* List<Float> priceList = list.stream().filter(product -> product.price>30000).map(product -> product.price).collect(Collectors.toList());
        System.out.println(priceList);*/

        List<Float> list1 = new ArrayList<>();
        for (Product product:list){
            if (product.price<30000){
                list1.add(product.price);

            }
            System.out.println(list1);

        }
    }
}
