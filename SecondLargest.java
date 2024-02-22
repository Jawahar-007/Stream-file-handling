package com.stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
    List<Integer> num = Arrays.asList(1,17,54,14,33,45,-11);
        System.out.println("List of Numbers"+num);

        Integer secondSmallest = num.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        Integer secondLargest = num.stream()
                .distinct()
                .sorted((a,b)->Integer.compare(b,a))
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("Second Smallest Number : "+ secondSmallest);
        System.out.println("Second Largest Number : "+secondLargest);

    }

}
