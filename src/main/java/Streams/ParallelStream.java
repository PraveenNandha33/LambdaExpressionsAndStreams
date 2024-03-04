package Streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    public static void main(String [] args)
    {

        List<Product> products=new ArrayList<>();
        products.add(new Product(3,"TV",30000));
        products.add(new Product(1,"Phone",34000));
        products.add(new Product(2,"Lap",25000));

//        way1
        products.parallelStream().filter(e->e.price>=30000).limit(1).forEach(e->System.out.print(e.prodName));
        //way2
        products.stream().parallel().filter(e->e.price>=30000).limit(1).forEach(e->System.out.print(e.prodName));
    }
}
