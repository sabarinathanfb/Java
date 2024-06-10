package Threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(20,55,66,88,44,11,12,1,51,4,15,16,1,55);

        List<Integer> al = list.stream().filter(number -> number % 2 == 0).toList();
        System.out.println(al);


    }
}
