package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FlatMap {
    public static void main(String[] args)
    {
        List<String> t1= Arrays.asList("A","B","C");

        List<String> t2= Arrays.asList("D","E","F");

        List<String> t3= Arrays.asList("G","H","I");
        List<List<String>> teams=new ArrayList<List<String>>();
        teams.add(t1);
        teams.add(t2);
        teams.add(t3);
        teams.stream().flatMap(t->t.stream()).forEach(System.out::print);

    }
}

