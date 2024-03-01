package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filters {
    public static  void main(String []  args){
//        List<String> li= Arrays.asList("Praveen","Nandha","Jeevanu","Abii","Pranav","Bangla");
//        List<String> output=new ArrayList<>();
//
//        output=li.stream().filter(s->s.length()>3 && s.length()<=5).collect(Collectors.toList());
//        System.out.println(output);
//        //Printing Directly
//        li.stream().filter(s->s.length()>3 && s.length()<=5).forEach(s-> System.out.println(s));
//        li.stream().filter(s->s.length()>3 && s.length()<=5).forEach(System.out::println);
//

        //Creating the products

        List<Product> products=new ArrayList<>();
        products.add(new Product(1,"Phone",34000));
        products.add(new Product(2,"Lap",25000));
        products.add(new Product(3,"TV",30000));

        products.stream().filter(pr->pr.price>=30000).forEach(pr-> System.out.println(pr.prodName));
    }
}
