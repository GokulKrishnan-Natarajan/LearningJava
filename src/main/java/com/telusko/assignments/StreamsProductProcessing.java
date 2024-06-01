package com.telusko.assignments;

import java.util.ArrayList;
import java.util.List;

class Product {
    int prodId;
    String prodName;
    int prodPrice;
    String prodCategory;

    public Product(int prodId, String prodName, int prodPrice, String prodCategory) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.prodCategory = prodCategory;
    }

    @Override
    public String toString() {
        return "Prod{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", prodPrice=" + prodPrice +
                ", prodCategory='" + prodCategory + '\'' +
                '}';
    }
}
public class StreamsProductProcessing {
    public static void main(String[] args) {

        Product p1 = new Product(100, "Samsung S24 Ultra", 1200, "Electronics");
        Product p2 = new Product(101, "Apple iPhone 15 Pro Max", 1100, "Electronics");
        Product p3 = new Product(102, "Pencil", 10, "Stationary");
        Product p4 = new Product(103, "Book", 15, "Stationary");
        Product p5 = new Product(104, "Pepsi", 5, "Food");
        Product p6 = new Product(105, "Diet Coke", 5, "Food");
        Product p7 = new Product(106, "Advil", 4, "Medicine");
        Product p8 = new Product(107, "T-shirt", 18,"Apparal");
        Product p9 = new Product(108, "Adidas", 45, "Apparel");
        Product p10 = new Product(109, "Laptop", 2000, "Electronics");

        List<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);
        list.add(p10);

        System.out.println("*************************************************************************************************");

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i).toString());
        }

        System.out.println("*************************************************************************************************");
        //Product price > 1000 and Product category "Electronics"
        list.stream().filter(p -> p.prodPrice > 1000 && p.prodCategory.equals("Electronics"))
               .forEach(p -> System.out.println(p.prodId + " " + p.prodName + " " + p.prodPrice + " " + p.prodCategory));

    }
}
