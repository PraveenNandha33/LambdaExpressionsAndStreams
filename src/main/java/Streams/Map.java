package Streams;

import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String []  args)
    {
        List<Integer> li= Arrays.asList(23,45,56,12);

        li.stream().map(i->i*3).forEach(res-> System.out.println(res));

    }
}
